/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.malik.testproject.entity.DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.malik.testproject.entity.HibernateUtil;

/**
 *
 * @author Малик
 */
public class MenBirthdayDAO {

    private Session session = null;

    public Session getSession() {
        return session;
    }

    
    
    public MenBirthdayDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
        //session.setFlushMode(FlushMode.MANUAL);
    }

    public void addMenBirthday(MenBirthday menBirthday) {
        Transaction tr = null;
        try {
            tr = getSession().beginTransaction();
            getSession().save(menBirthday);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
    }

    public List<MenBirthday> getAllMenBirthdays() {
        List<MenBirthday> list = new ArrayList<MenBirthday>();
        Transaction tr = null;
        try {
            tr = getSession().beginTransaction();
            list = getSession().createCriteria(MenBirthday.class).list();
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
        return list;
    }

    public void updateMenBirthday(MenBirthday menBirthday) {
        Transaction tr = null;
        try {
            tr = getSession().beginTransaction();
            getSession().update(menBirthday);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
        }
    }

    public MenBirthday getMenBirthdayById(Integer id) {
        Transaction tr = null;
        MenBirthday menBirthday = null;
        
        try {
            tr = getSession().beginTransaction();
            menBirthday = (MenBirthday) session.load(MenBirthday.class, id);
            tr.commit();
        } catch (Exception e) {
            tr.rollback();
            e.printStackTrace();
        }
        return menBirthday;
    }
    
    public void deleteMenBirthday(MenBirthday menBirthday) {
        Transaction tr = null;
        try {
            tr = getSession().beginTransaction();
            getSession().delete(menBirthday);
            tr.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tr.rollback();
        }
    }
}
