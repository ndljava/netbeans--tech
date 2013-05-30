/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsv.ctr;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import jsv.ctr.exceptions.NonexistentEntityException;
import jsv.ctr.exceptions.PreexistingEntityException;
import jsv.db.Customer;
import jsv.db.MicroMarket;
import jsv.db.DiscountCode;

/**
 *
 * @author Administrator
 */
public class CustomerJpaController implements Serializable {

    public CustomerJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Customer customer) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            MicroMarket zip = customer.getZip();
            if (zip != null) {
                zip = em.getReference(zip.getClass(), zip.getZipCode());
                customer.setZip(zip);
            }
            DiscountCode discountCode = customer.getDiscountCode();
            if (discountCode != null) {
                discountCode = em.getReference(discountCode.getClass(), discountCode.getDiscountCode());
                customer.setDiscountCode(discountCode);
            }
            em.persist(customer);
            if (zip != null) {
                zip.getCustomerCollection().add(customer);
                zip = em.merge(zip);
            }
            if (discountCode != null) {
                discountCode.getCustomerCollection().add(customer);
                discountCode = em.merge(discountCode);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCustomer(customer.getCustomerId()) != null) {
                throw new PreexistingEntityException("Customer " + customer + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Customer customer) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Customer persistentCustomer = em.find(Customer.class, customer.getCustomerId());
            MicroMarket zipOld = persistentCustomer.getZip();
            MicroMarket zipNew = customer.getZip();
            DiscountCode discountCodeOld = persistentCustomer.getDiscountCode();
            DiscountCode discountCodeNew = customer.getDiscountCode();
            if (zipNew != null) {
                zipNew = em.getReference(zipNew.getClass(), zipNew.getZipCode());
                customer.setZip(zipNew);
            }
            if (discountCodeNew != null) {
                discountCodeNew = em.getReference(discountCodeNew.getClass(), discountCodeNew.getDiscountCode());
                customer.setDiscountCode(discountCodeNew);
            }
            customer = em.merge(customer);
            if (zipOld != null && !zipOld.equals(zipNew)) {
                zipOld.getCustomerCollection().remove(customer);
                zipOld = em.merge(zipOld);
            }
            if (zipNew != null && !zipNew.equals(zipOld)) {
                zipNew.getCustomerCollection().add(customer);
                zipNew = em.merge(zipNew);
            }
            if (discountCodeOld != null && !discountCodeOld.equals(discountCodeNew)) {
                discountCodeOld.getCustomerCollection().remove(customer);
                discountCodeOld = em.merge(discountCodeOld);
            }
            if (discountCodeNew != null && !discountCodeNew.equals(discountCodeOld)) {
                discountCodeNew.getCustomerCollection().add(customer);
                discountCodeNew = em.merge(discountCodeNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = customer.getCustomerId();
                if (findCustomer(id) == null) {
                    throw new NonexistentEntityException("The customer with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Customer customer;
            try {
                customer = em.getReference(Customer.class, id);
                customer.getCustomerId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The customer with id " + id + " no longer exists.", enfe);
            }
            MicroMarket zip = customer.getZip();
            if (zip != null) {
                zip.getCustomerCollection().remove(customer);
                zip = em.merge(zip);
            }
            DiscountCode discountCode = customer.getDiscountCode();
            if (discountCode != null) {
                discountCode.getCustomerCollection().remove(customer);
                discountCode = em.merge(discountCode);
            }
            em.remove(customer);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Customer> findCustomerEntities() {
        return findCustomerEntities(true, -1, -1);
    }

    public List<Customer> findCustomerEntities(int maxResults, int firstResult) {
        return findCustomerEntities(false, maxResults, firstResult);
    }

    private List<Customer> findCustomerEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Customer.class));
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

    public Customer findCustomer(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Customer.class, id);
        } finally {
            em.close();
        }
    }

    public int getCustomerCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Customer> rt = cq.from(Customer.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
