/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.malik.testproject.entity.DAO;

import org.hibernate.Session;
import ru.malik.testproject.entity.HibernateUtil;

/**
 *
 * @author Малик
 */
public class SecondNameDAO extends AbstractDAO<SecondName>{

    private Session session = null;
    
    @Override
    public Session getSession() {
        return session;
    }

    public SecondNameDAO() {
        super(SecondName.class);
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    
    
}
