package com.hibernate.dao;

import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Trans {
    public static void main(String[] args) {
        trans();
    }
    private static Transaction trans() {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return transaction;
    }
}
