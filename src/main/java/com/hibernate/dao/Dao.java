package com.hibernate.dao;


import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

import static com.hibernate.util.HibernateUtil.getSessionFactory;


public class Dao<Transaction, T> {
    Session session = getSessionFactory().getCurrentSession();



    public <T> T save(final T o) {
        return (T) session.save(o);
    }


    public void delete(final Object object) {
        session.delete(object);
    }

    /***/
    public <T> T get(final Class<T> type, final Long id) {
        return (T) session.get(type, id);
    }

    /***/
    public <T> T merge(final T o) {
        return (T) session.merge(o);
    }

    /***/
    public <T> void saveOrUpdate(final T o) {
        session.saveOrUpdate(o);
    }


}


