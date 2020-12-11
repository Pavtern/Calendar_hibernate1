//package com.hibernate.dao;
//
//import java.util.List;
//
//import com.hibernate.generated.TaskEntity;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import com.hibernate.util.HibernateUtil;
//
//import javax.swing.text.html.parser.Entity;
//
//public class TaskDao<T> {
//    public void saveTask(T t) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.save(t);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//    }
//
//    public List <T>
//
//    getTask() {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            return session.createQuery("from T", T.class).list();
//        }
//    }
//}