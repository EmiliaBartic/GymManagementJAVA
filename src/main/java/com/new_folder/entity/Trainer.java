package com.new_folder.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "trainers", schema = "public", catalog = "postgres")
public class Trainer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "salary", nullable = true)
    private Integer salary;
    @Basic
    @Column(name = "hire_date", nullable = true)
    private Date hireDate;
    @Basic
    @Column(name = "gym_id_of_employee", nullable = true)
    private Integer gymIdOfEmployee;
//    @OneToMany(mappedBy = "trainersByIdMyTrainer")
//    private Collection<Customer> customersById;
//    @OneToMany(mappedBy = "trainersByIdTrainer")
//    private Collection<Recipe> recipesById;
//    @ManyToOne
//    @JoinColumn(name = "gym_id_of_employee", referencedColumnName = "id")
//    private GymDetails gymDetailsByGymIdOfEmployee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getGymIdOfEmployee() {
        return gymIdOfEmployee;
    }

    public void setGymIdOfEmployee(Integer gymIdOfEmployee) {
        this.gymIdOfEmployee = gymIdOfEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return id == trainer.id && Objects.equals(salary, trainer.salary) && Objects.equals(hireDate, trainer.hireDate) && Objects.equals(gymIdOfEmployee, trainer.gymIdOfEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary, hireDate, gymIdOfEmployee);
    }


}
