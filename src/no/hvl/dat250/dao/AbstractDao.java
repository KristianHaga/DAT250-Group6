package no.hvl.dat250.dao;

import javax.persistence.EntityManager;
import java.util.List;

public abstract class AbstractDao<T> {

    private Class<T> jpaClass;

    EntityManager em;

    public final void setClass(Class<T> jpaClass){
        this.jpaClass = jpaClass;
    }

    public T findById(long id){
        return em.find(jpaClass, id);
    }

    public List<T> findAll(){
        return em.createQuery( "Select c from " + jpaClass.getName() + " c").getResultList();
    }

    public void create(T entity){
        em.persist(entity);
    }

    public T update(T entity){
        return em.merge(entity);
    }

    public void delete(T entity){
        em.remove(entity);
    }
    public void deleteById(long entityId){
        T entity = findById(entityId);
        delete(entity);
    }

    public void deleteById(String entityId){
        T entity = findById(entityId);
        delete(entity);
    }

    public void deleteById(int entityId){
        T entity = findById(entityId);
        delete(entity);
    }
    public T findById(String id) {
        return em.find(jpaClass, id);
    }

    public T findById(int id) {
        return em.find(jpaClass, id);
    }
}
