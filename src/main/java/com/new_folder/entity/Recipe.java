package com.new_folder.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "recipes", schema = "public", catalog = "postgres")
public class Recipe {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "id_trainer", nullable = true)
    private Integer idTrainer;
    @Basic
    @Column(name = "title", nullable = true, length = 50)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = 400)
    private String description;
    @Basic
    @Column(name = "prepare_time", nullable = true)
    private Integer prepareTime;
    @Basic
    @Column(name = "calories", nullable = true)
    private Integer calories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(Integer idTrainer) {
        this.idTrainer = idTrainer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrepareTime() {
        return prepareTime;
    }

    public void setPrepareTime(Integer prepareTime) {
        this.prepareTime = prepareTime;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id && Objects.equals(idTrainer, recipe.idTrainer) && Objects.equals(title, recipe.title) && Objects.equals(description, recipe.description) && Objects.equals(prepareTime, recipe.prepareTime) && Objects.equals(calories, recipe.calories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idTrainer, title, description, prepareTime, calories);
    }
}
