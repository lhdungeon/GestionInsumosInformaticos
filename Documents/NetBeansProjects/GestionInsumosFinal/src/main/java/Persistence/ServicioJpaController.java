
package Persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Logica.Sala;
import Logica.Servicio;
import Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ServicioJpaController implements Serializable {

    public ServicioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public ServicioJpaController(){
        emf=Persistence.createEntityManagerFactory("gestionInsumosPersistence");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Servicio servicio) {
        if (servicio.getSala() == null) {
            servicio.setSala(new ArrayList<Sala>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ArrayList<Sala> attachedSala = new ArrayList<Sala>();
            for (Sala salaSalaToAttach : servicio.getSala()) {
                salaSalaToAttach = em.getReference(salaSalaToAttach.getClass(), salaSalaToAttach.getId());
                attachedSala.add(salaSalaToAttach);
            }
            servicio.setSala(attachedSala);
            em.persist(servicio);
            for (Sala salaSala : servicio.getSala()) {
                Servicio oldServicioOfSalaSala = salaSala.getServicio();
                salaSala.setServicio(servicio);
                salaSala = em.merge(salaSala);
                if (oldServicioOfSalaSala != null) {
                    oldServicioOfSalaSala.getSala().remove(salaSala);
                    oldServicioOfSalaSala = em.merge(oldServicioOfSalaSala);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Servicio servicio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Servicio persistentServicio = em.find(Servicio.class, servicio.getId());
            ArrayList<Sala> salaOld = persistentServicio.getSala();
            ArrayList<Sala> salaNew = servicio.getSala();
            ArrayList<Sala> attachedSalaNew = new ArrayList<Sala>();
            for (Sala salaNewSalaToAttach : salaNew) {
                salaNewSalaToAttach = em.getReference(salaNewSalaToAttach.getClass(), salaNewSalaToAttach.getId());
                attachedSalaNew.add(salaNewSalaToAttach);
            }
            salaNew = attachedSalaNew;
            servicio.setSala(salaNew);
            servicio = em.merge(servicio);
            for (Sala salaOldSala : salaOld) {
                if (!salaNew.contains(salaOldSala)) {
                    salaOldSala.setServicio(null);
                    salaOldSala = em.merge(salaOldSala);
                }
            }
            for (Sala salaNewSala : salaNew) {
                if (!salaOld.contains(salaNewSala)) {
                    Servicio oldServicioOfSalaNewSala = salaNewSala.getServicio();
                    salaNewSala.setServicio(servicio);
                    salaNewSala = em.merge(salaNewSala);
                    if (oldServicioOfSalaNewSala != null && !oldServicioOfSalaNewSala.equals(servicio)) {
                        oldServicioOfSalaNewSala.getSala().remove(salaNewSala);
                        oldServicioOfSalaNewSala = em.merge(oldServicioOfSalaNewSala);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = servicio.getId();
                if (findServicio(id) == null) {
                    throw new NonexistentEntityException("The servicio with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Servicio servicio;
            try {
                servicio = em.getReference(Servicio.class, id);
                servicio.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The servicio with id " + id + " no longer exists.", enfe);
            }
            ArrayList<Sala> sala = servicio.getSala();
            for (Sala salaSala : sala) {
                salaSala.setServicio(null);
                salaSala = em.merge(salaSala);
            }
            em.remove(servicio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Servicio> findServicioEntities() {
        return findServicioEntities(true, -1, -1);
    }

    public List<Servicio> findServicioEntities(int maxResults, int firstResult) {
        return findServicioEntities(false, maxResults, firstResult);
    }

    private List<Servicio> findServicioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Servicio.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Servicio findServicio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Servicio.class, id);
        } finally {
            em.close();
        }
    }

    public int getServicioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Servicio> rt = cq.from(Servicio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
