
package Persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Logica.Servicio;
import Logica.Registro;
import Logica.Sala;
import Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SalaJpaController implements Serializable {
    
    public SalaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public SalaJpaController(){
        emf=Persistence.createEntityManagerFactory("gestionInsumosPersistence");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sala sala) {
        if (sala.getListaRegistros() == null) {
            sala.setListaRegistros(new LinkedList<Registro>());//Se cambio arrayList por LinkedList
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Servicio servicio = sala.getServicio();
            if (servicio != null) {
                servicio = em.getReference(servicio.getClass(), servicio.getId());
                sala.setServicio(servicio);
            }
            LinkedList<Registro> attachedListaRegistros = new LinkedList<Registro>();//Se cambio arrayList por LinkedList
            for (Registro listaRegistrosRegistroToAttach : sala.getListaRegistros()) {
                listaRegistrosRegistroToAttach = em.getReference(listaRegistrosRegistroToAttach.getClass(), listaRegistrosRegistroToAttach.getId_registro());
                attachedListaRegistros.add(listaRegistrosRegistroToAttach);
            }
            sala.setListaRegistros(attachedListaRegistros);
            em.persist(sala);
            if (servicio != null) {
                servicio.getSala().add(sala);
                servicio = em.merge(servicio);
            }
            for (Registro listaRegistrosRegistro : sala.getListaRegistros()) {
                Sala oldSalaOfListaRegistrosRegistro = listaRegistrosRegistro.getSala();
                listaRegistrosRegistro.setSala(sala);
                listaRegistrosRegistro = em.merge(listaRegistrosRegistro);
                if (oldSalaOfListaRegistrosRegistro != null) {
                    oldSalaOfListaRegistrosRegistro.getListaRegistros().remove(listaRegistrosRegistro);
                    oldSalaOfListaRegistrosRegistro = em.merge(oldSalaOfListaRegistrosRegistro);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sala sala) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sala persistentSala = em.find(Sala.class, sala.getId());
            Servicio servicioOld = persistentSala.getServicio();
            Servicio servicioNew = sala.getServicio();
            LinkedList<Registro> listaRegistrosOld = persistentSala.getListaRegistros();
            LinkedList<Registro> listaRegistrosNew = sala.getListaRegistros();
            if (servicioNew != null) {
                servicioNew = em.getReference(servicioNew.getClass(), servicioNew.getId());
                sala.setServicio(servicioNew);
            }
            LinkedList<Registro> attachedListaRegistrosNew = new LinkedList<Registro>();//Se cambio arrayList por LinkedList
            for (Registro listaRegistrosNewRegistroToAttach : listaRegistrosNew) {
                listaRegistrosNewRegistroToAttach = em.getReference(listaRegistrosNewRegistroToAttach.getClass(), listaRegistrosNewRegistroToAttach.getId_registro());
                attachedListaRegistrosNew.add(listaRegistrosNewRegistroToAttach);
            }
            listaRegistrosNew = attachedListaRegistrosNew;
            sala.setListaRegistros(listaRegistrosNew);
            sala = em.merge(sala);
            if (servicioOld != null && !servicioOld.equals(servicioNew)) {
                servicioOld.getSala().remove(sala);
                servicioOld = em.merge(servicioOld);
            }
            if (servicioNew != null && !servicioNew.equals(servicioOld)) {
                servicioNew.getSala().add(sala);
                servicioNew = em.merge(servicioNew);
            }
            for (Registro listaRegistrosOldRegistro : listaRegistrosOld) {
                if (!listaRegistrosNew.contains(listaRegistrosOldRegistro)) {
                    listaRegistrosOldRegistro.setSala(null);
                    listaRegistrosOldRegistro = em.merge(listaRegistrosOldRegistro);
                }
            }
            for (Registro listaRegistrosNewRegistro : listaRegistrosNew) {
                if (!listaRegistrosOld.contains(listaRegistrosNewRegistro)) {
                    Sala oldSalaOfListaRegistrosNewRegistro = listaRegistrosNewRegistro.getSala();
                    listaRegistrosNewRegistro.setSala(sala);
                    listaRegistrosNewRegistro = em.merge(listaRegistrosNewRegistro);
                    if (oldSalaOfListaRegistrosNewRegistro != null && !oldSalaOfListaRegistrosNewRegistro.equals(sala)) {
                        oldSalaOfListaRegistrosNewRegistro.getListaRegistros().remove(listaRegistrosNewRegistro);
                        oldSalaOfListaRegistrosNewRegistro = em.merge(oldSalaOfListaRegistrosNewRegistro);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = sala.getId();
                if (findSala(id) == null) {
                    throw new NonexistentEntityException("The sala with id " + id + " no longer exists.");
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
            Sala sala;
            try {
                sala = em.getReference(Sala.class, id);
                sala.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sala with id " + id + " no longer exists.", enfe);
            }
            Servicio servicio = sala.getServicio();
            if (servicio != null) {
                servicio.getSala().remove(sala);
                servicio = em.merge(servicio);
            }
            LinkedList<Registro> listaRegistros = sala.getListaRegistros();
            for (Registro listaRegistrosRegistro : listaRegistros) {
                listaRegistrosRegistro.setSala(null);
                listaRegistrosRegistro = em.merge(listaRegistrosRegistro);
            }
            em.remove(sala);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sala> findSalaEntities() {
        return findSalaEntities(true, -1, -1);
    }

    public List<Sala> findSalaEntities(int maxResults, int firstResult) {
        return findSalaEntities(false, maxResults, firstResult);
    }

    private List<Sala> findSalaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sala.class));
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

    public Sala findSala(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sala.class, id);
        } finally {
            em.close();
        }
    }

    public int getSalaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sala> rt = cq.from(Sala.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
