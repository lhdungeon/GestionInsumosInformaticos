/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import Logica.Login.Login;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Logica.Servicios.Sala;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Usuario
 */
public class LoginJpaController implements Serializable {

    public LoginJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Login login) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sala sala = login.getSala();
            if (sala != null) {
                sala = em.getReference(sala.getClass(), sala.getId());
                login.setSala(sala);
            }
            em.persist(login);
            if (sala != null) {
                Login oldLoginOfSala = sala.getLogin();
                if (oldLoginOfSala != null) {
                    oldLoginOfSala.setSala(null);
                    oldLoginOfSala = em.merge(oldLoginOfSala);
                }
                sala.setLogin(login);
                sala = em.merge(sala);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Login login) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Login persistentLogin = em.find(Login.class, login.getId());
            Sala salaOld = persistentLogin.getSala();
            Sala salaNew = login.getSala();
            if (salaNew != null) {
                salaNew = em.getReference(salaNew.getClass(), salaNew.getId());
                login.setSala(salaNew);
            }
            login = em.merge(login);
            if (salaOld != null && !salaOld.equals(salaNew)) {
                salaOld.setLogin(null);
                salaOld = em.merge(salaOld);
            }
            if (salaNew != null && !salaNew.equals(salaOld)) {
                Login oldLoginOfSala = salaNew.getLogin();
                if (oldLoginOfSala != null) {
                    oldLoginOfSala.setSala(null);
                    oldLoginOfSala = em.merge(oldLoginOfSala);
                }
                salaNew.setLogin(login);
                salaNew = em.merge(salaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = login.getId();
                if (findLogin(id) == null) {
                    throw new NonexistentEntityException("The login with id " + id + " no longer exists.");
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
            Login login;
            try {
                login = em.getReference(Login.class, id);
                login.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The login with id " + id + " no longer exists.", enfe);
            }
            Sala sala = login.getSala();
            if (sala != null) {
                sala.setLogin(null);
                sala = em.merge(sala);
            }
            em.remove(login);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Login> findLoginEntities() {
        return findLoginEntities(true, -1, -1);
    }

    public List<Login> findLoginEntities(int maxResults, int firstResult) {
        return findLoginEntities(false, maxResults, firstResult);
    }

    private List<Login> findLoginEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Login.class));
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

    public Login findLogin(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Login.class, id);
        } finally {
            em.close();
        }
    }

    public int getLoginCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Login> rt = cq.from(Login.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
