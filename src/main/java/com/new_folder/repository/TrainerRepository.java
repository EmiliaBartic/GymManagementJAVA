package com.new_folder.repository;

import com.new_folder.entity.Customer;
import com.new_folder.entity.Trainer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@ComponentScan({ "com.new_folder.*" })
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

    @Query("SELECT c FROM Customer c WHERE c.idMyTrainer = :trainerid")
    public List<Customer> getMyCustomers( @Param("trainerid") Integer id);
}
