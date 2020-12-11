package com.hibernate.generated;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "category", schema = "calendar", catalog = "")
public class CategoryEntity {
    private int idCategory;
    private String name;
    private Collection<TaskEntity> tasksByIdCategory;

    @Id
    @Column(name = "idCategory", nullable = false)
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (idCategory != that.idCategory) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCategory;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "categoryByIdCategory1")
    public Collection<TaskEntity> getTasksByIdCategory() {
        return tasksByIdCategory;
    }

    public void setTasksByIdCategory(Collection<TaskEntity> tasksByIdCategory) {
        this.tasksByIdCategory = tasksByIdCategory;
    }
}
