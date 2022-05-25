package com.new_folder.controller;

import com.new_folder.entity.Customer;
import com.new_folder.service.ITrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainer")
@ComponentScan({ "com.new_folder.*" })
@CrossOrigin
public class TrainerController {


    @Autowired
    private ITrainerService trainerService;

    public TrainerController(ITrainerService trainerService) {
        this.trainerService = trainerService;
    }


    @GetMapping("/{myid}")
    public List<Customer> getMyCustomers( @PathVariable("myid") Integer id){
        return trainerService.getMyCustomers(id);
    }
}
