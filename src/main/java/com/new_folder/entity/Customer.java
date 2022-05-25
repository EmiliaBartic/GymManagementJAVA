package com.new_folder.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "customers", schema = "public", catalog = "postgres")
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "current_health", nullable = true, length = 30)
    private String currentHealth;
    @Basic
    @Column(name = "subscription_price", nullable = true)
    private Integer subscriptionPrice;
    @Basic
    @Column(name = "about_me", nullable = true, length = 300)
    private String aboutMe;
    @Basic
    @Column(name = "subscription_until", nullable = true)
    private Date subscriptionUntil;
    @Basic
    @Column(name = "id_my_trainer", nullable = true)
    private Integer idMyTrainer;
    @Basic
    @Column(name = "id_gym", nullable = true)
    private Integer idGym;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(String currentHealth) {
        this.currentHealth = currentHealth;
    }

    public Integer getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setSubscriptionPrice(Integer subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public Date getSubscriptionUntil() {
        return subscriptionUntil;
    }

    public void setSubscriptionUntil(Date subscriptionUntil) {
        this.subscriptionUntil = subscriptionUntil;
    }

    public Integer getIdMyTrainer() {
        return idMyTrainer;
    }

    public void setIdMyTrainer(Integer idMyTrainer) {
        this.idMyTrainer = idMyTrainer;
    }

    public Integer getIdGym() {
        return idGym;
    }

    public void setIdGym(Integer idGym) {
        this.idGym = idGym;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(currentHealth, customer.currentHealth) && Objects.equals(subscriptionPrice, customer.subscriptionPrice) && Objects.equals(aboutMe, customer.aboutMe) && Objects.equals(subscriptionUntil, customer.subscriptionUntil) && Objects.equals(idMyTrainer, customer.idMyTrainer) && Objects.equals(idGym, customer.idGym);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currentHealth, subscriptionPrice, aboutMe, subscriptionUntil, idMyTrainer, idGym);
    }
}
