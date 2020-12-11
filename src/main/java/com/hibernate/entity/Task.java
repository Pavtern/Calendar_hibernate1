package com.hibernate.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTask")
    private int id;

    @Column(name = "name")
    private String nameOfTask;

    @Column(name = "Date")
    private String dateOfTask;

    @Column(name = "idCategory1")
    private int categoryOfTask;

    public Task() {
    }

    public Task(String nameOfTask, String dateOfTask, int categoryOfTask) {
        this.nameOfTask = nameOfTask;
        this.dateOfTask = dateOfTask;
        this.categoryOfTask = categoryOfTask;
    }

    public String getNameOfTask() {
        return nameOfTask;
    }

    public void setNameOfTask(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public String getDateOfTask() {
        return dateOfTask;
    }

    public void setDateOfTask(String dateOfTask) {
        this.dateOfTask = dateOfTask;
    }

    public int getCategoryOfTask() {
        return categoryOfTask;
    }

    public void setCategoryOfTask(int categoryOfTask) {
        this.categoryOfTask = categoryOfTask;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return "Tsk [id=" + id + ", name=" + nameOfTask + ", date=" + dateOfTask + ", categoryId=" + categoryOfTask;
    }
}
