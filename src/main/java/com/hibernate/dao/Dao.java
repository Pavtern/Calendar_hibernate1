package com.hibernate.dao;


import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;


import java.util.List;

import static com.hibernate.util.HibernateUtil.getSessionFactory;


public class Dao<T> {




    public <T> T save(final T o) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return (T) session;
    }


    public void delete(final Object object) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
    }

    /***/
    public <T> T get(final Class<T> type, final int id) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.get(type, id);
        session.getTransaction().commit();
        return (T) session;
    }

    /***/
    public <T> T merge(final T o) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.merge(o);
        session.getTransaction().commit();
        return (T) session;
    }

    /***/
    public <T> void saveOrUpdate(final T o) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(o);
        session.getTransaction().commit();
    }

}


