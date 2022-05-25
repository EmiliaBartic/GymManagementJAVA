package com.new_folder.service;

import com.new_folder.entity.Customer;
import com.new_folder.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@ComponentScan({ "com.new_folder.*" })
public class TrainerService implements ITrainerService{

    private TrainerRepository trainerRepository;

    @Autowired
    public void setTrainerRepository(TrainerRepository tr){this.trainerRepository=tr;}

    public List<Customer> getMyCustomers(Integer id){
        return trainerRepository.getMyCustomers(id);
    }

}
