/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Logica.Insumos.Computadora;
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
public class ComputadoraJpaController implements Serializable {

    public ComputadoraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ComputadoraJpaController(){
        emf=Persistence.createEntityManagerFactory("gestionInsumosPersistence");
    }
    
    
    private EntityManagerFactory emf = null;   

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Computadora computadora) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(computadora);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Computadora computadora) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            computadora = em.merge(computadora);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = computadora.getId();
                if (findComputadora(id) == null) {
                    throw new NonexistentEntityException("The computadora with id " + id + " no longer exists.");
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
            Computadora computadora;
            try {
                computadora = em.getReference(Computadora.class, id);
                computadora.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The computadora with id " + id + " no longer exists.", enfe);
            }
            em.remove(computadora);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Computadora> findComputadoraEntities() {
        return findComputadoraEntities(true, -1, -1);
    }

    public List<Computadora> findComputadoraEntities(int maxResults, int firstResult) {
        return findComputadoraEntities(false, maxResults, firstResult);
    }

    private List<Computadora> findComputadoraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Computadora.class));
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

    public Computadora findComputadora(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Computadora.class, id);
        } finally {
            em.close();
        }
    }

    public int getComputadoraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Computadora> rt = cq.from(Computadora.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
