package com.hibernate.generated;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "subtask", schema = "calendar", catalog = "")
public class SubtaskEntity {
    private int idSubtask;
    private String name;
    private Timestamp date;
    private TaskEntity taskByIdTask;

    @Id
    @Column(name = "idSubtask", nullable = false)
    public int getIdSubtask() {
        return idSubtask;
    }

    public void setIdSubtask(int idSubtask) {
        this.idSubtask = idSubtask;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 45)
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

        SubtaskEntity that = (SubtaskEntity) o;

        if (idSubtask != that.idSubtask) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSubtask;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "idTask", referencedColumnName = "idTask", nullable = false)
    public TaskEntity getTaskByIdTask() {
        return taskByIdTask;
    }

    public void setTaskByIdTask(TaskEntity taskByIdTask) {
        this.taskByIdTask = taskByIdTask;
    }
}
