package com.new_folder.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "gym_details", schema = "public", catalog = "postgres")
public class GymDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "title", nullable = true, length = 40)
    private String title;
    @Basic
    @Column(name = "capacity", nullable = true)
    private Integer capacity;
    @Basic
    @Column(name = "occupancy_rate", nullable = true)
    private Integer occupancyRate;
   // @OneToMany(mappedBy = "gymDetailsByIdGym")
    //private Collection<Customer> customersById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getOccupancyRate() {
        return occupancyRate;
    }

    public void setOccupancyRate(Integer occupancyRate) {
        this.occupancyRate = occupancyRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GymDetails that = (GymDetails) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(capacity, that.capacity) && Objects.equals(occupancyRate, that.occupancyRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, capacity, occupancyRate);
    }


}
