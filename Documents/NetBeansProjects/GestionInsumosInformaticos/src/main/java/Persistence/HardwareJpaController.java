/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Logica.Hardware;
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
public class HardwareJpaController implements Serializable {

    public HardwareJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public HardwareJpaController(){
        
        emf=Persistence.createEntityManagerFactory("GestionInsumosInformaticos");
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Hardware hardware) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(hardware);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Hardware hardware) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            hardware = em.merge(hardware);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = hardware.getId();
                if (findHardware(id) == null) {
                    throw new NonexistentEntityException("The hardware with id " + id + " no longer exists.");
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
            Hardware hardware;
            try {
                hardware = em.getReference(Hardware.class, id);
                hardware.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The hardware with id " + id + " no longer exists.", enfe);
            }
            em.remove(hardware);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Hardware> findHardwareEntities() {
        return findHardwareEntities(true, -1, -1);
    }

    public List<Hardware> findHardwareEntities(int maxResults, int firstResult) {
        return findHardwareEntities(false, maxResults, firstResult);
    }

    private List<Hardware> findHardwareEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Hardware.class));
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

    public Hardware findHardware(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Hardware.class, id);
        } finally {
            em.close();
        }
    }

    public int getHardwareCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Hardware> rt = cq.from(Hardware.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
