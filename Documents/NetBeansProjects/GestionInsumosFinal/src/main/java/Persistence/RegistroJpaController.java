/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Logica.Insumos.RegistroInsumos;
import Persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Administrador
 */
public class RegistroJpaController implements Serializable {

    public RegistroJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    
    public RegistroJpaController(){
        emf=Persistence.createEntityManagerFactory("gestionInsumosPersistence");
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(RegistroInsumos registro) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(registro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(RegistroInsumos registro) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            registro = em.merge(registro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = registro.getId_registro();
                if (findRegistro(id) == null) {
                    throw new NonexistentEntityException("The registro with id " + id + " no longer exists.");
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
            RegistroInsumos registro;
            try {
                registro = em.getReference(RegistroInsumos.class, id);
                registro.getId_registro();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The registro with id " + id + " no longer exists.", enfe);
            }
            em.remove(registro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<RegistroInsumos> findRegistroEntities() {
        return findRegistroEntities(true, -1, -1);
    }

    public List<RegistroInsumos> findRegistroEntities(int maxResults, int firstResult) {
        return findRegistroEntities(false, maxResults, firstResult);
    }

    private List<RegistroInsumos> findRegistroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(RegistroInsumos.class));
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

    public RegistroInsumos findRegistro(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(RegistroInsumos.class, id);
        } finally {
            em.close();
        }
    }

    public int getRegistroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<RegistroInsumos> rt = cq.from(RegistroInsumos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
