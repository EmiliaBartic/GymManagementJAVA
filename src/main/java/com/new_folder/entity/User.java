package com.new_folder.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "public", catalog = "postgres")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 50)
    private String name;
    @Basic
    @Column(name = "surname", nullable = true, length = 50)
    private String surname;
    @Basic
    @Column(name = "birthday", nullable = true)
    private Date birthday;
    @Basic
    @Column(name = "phone_number", nullable = true, length = 15)
    private String phoneNumber;
    @Basic
    @Column(name = "is_trainer", nullable = true)
    private Boolean isTrainer;
    @Basic
    @Column(name = "is_admin", nullable = true)
    private Boolean isAdmin;
    @Basic
    @Column(name = "is_customer", nullable = true)
    private Boolean isCustomer;
//    @OneToOne(mappedBy = "usersById")
//    private Customer customersById;
//    @OneToOne(mappedBy = "usersById")
//    private Trainer trainersById;
//    @OneToOne(mappedBy = "usersById")
//    private UserDetails userDetailsById;
    @Basic
    @Column(name="password",nullable = false)
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getTrainer() {
        return isTrainer;
    }

    public void setTrainer(Boolean trainer) {
        isTrainer = trainer;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public Boolean getCustomer() {
        return isCustomer;
    }

    public void setCustomer(Boolean customer) {
        isCustomer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(birthday, user.birthday) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(isTrainer, user.isTrainer) && Objects.equals(isAdmin, user.isAdmin) && Objects.equals(isCustomer, user.isCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, birthday, phoneNumber, isTrainer, isAdmin, isCustomer);
    }

}
