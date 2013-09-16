/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.malik.testproject.entity.DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Малик
 */
public abstract class AbstractDAO<T> {
    private Class<T> entityClass;

    public abstract Session getSession();

    public Class<T> getEntityClass(){
        return entityClass;
    }

    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    

    public List<T> findAll() {
        List<T> list = new ArrayList<T>();
        Transaction tr = null;
        try {
            tr = getSession().beginTransaction();
            list = getSession().createCriteria(getEntityClass()).list();
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();

        }
        return list;
    }

    public void add(T entity) {
        Transaction tr = null;
        try {
            tr = getSession().beginTransaction();
            getSession().save(entity);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
    }

    public void update(T entity) {
        Transaction tr = null;
        try {
            tr = getSession().beginTransaction();
            getSession().update(entity);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
    }

    public void delete(T entity) {
        Transaction tr = null;
        try {
            tr = getSession().beginTransaction();
            getSession().delete(entity);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
    }

    public T getById(Integer id) {
        T result = null;
        Transaction tr = null;
        try {
            tr = getSession().beginTransaction();
            result = (T)getSession().load(getEntityClass(), id);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
        
        return result;
    }
}
