package com.hibernate.generated;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "task", schema = "calendar", catalog = "")
public class TaskEntity {
    private int idTask;
    private String name;
    private Timestamp date;
    private Collection<SubtaskEntity> subtasksByIdTask;
    private CategoryEntity categoryByIdCategory1;


    @Id
    @Column(name = "idTask", nullable = false)
    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskEntity that = (TaskEntity) o;

        if (idTask != that.idTask) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTask;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "taskByIdTask")
    public Collection<SubtaskEntity> getSubtasksByIdTask() {
        return subtasksByIdTask;
    }

    public void setSubtasksByIdTask(Collection<SubtaskEntity> subtasksByIdTask) {
        this.subtasksByIdTask = subtasksByIdTask;
    }

    @ManyToOne
    @JoinColumn(name = "idCategory1", referencedColumnName = "idCategory", nullable = true)
    public CategoryEntity getCategoryByIdCategory1() {
        return categoryByIdCategory1;
    }

    public void setCategoryByIdCategory1(CategoryEntity categoryByIdCategory1) {
        this.categoryByIdCategory1 = categoryByIdCategory1;
    }

}
