package com.hibernate;

//import com.hibernate.dao.Dao;
//import com.hibernate.dao.TaskDao;


import com.hibernate.dao.Dao;
import com.hibernate.dao.Trans;
import com.hibernate.entity.Task;
import com.hibernate.generated.TaskEntity;
import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
//        TaskDao taskDao = new TaskDao();
//        TaskEntity task = new TaskEntity();
//        task.setName("123");
//        task.setDate(Timestamp.valueOf(LocalDateTime.now()));
//        taskDao.saveTask(task);
//        List<TaskEntity>
//                tasks = taskDao.getTask();
//        tasks.forEach(s -> System.out.println(s.getName()));
//        Dao dao = new Dao();
//        TaskEntity task = new TaskEntity();
//        task.setName("123");
//        task.setDate(Timestamp.valueOf(LocalDateTime.now()));
//        dao.save(task);
        long id = 12;
//        List<TaskEntity>
//                tasks = (List<TaskEntity>) dao.get(TaskEntity.class, id);
//        tasks.forEach(s -> System.out.println(s.getName()));

        Dao<Trans, TaskEntity> dao = new Dao();
        TaskEntity task = new TaskEntity();
        task.setName("123");
        task.setDate(Timestamp.valueOf(LocalDateTime.now()));
        dao.save(task);

    }

}