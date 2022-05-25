package com.new_folder.controller;

import com.new_folder.entity.Customer;
import com.new_folder.entity.Trainer;
import com.new_folder.service.IAdminService;
import com.new_folder.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/admin")
@ComponentScan({ "com.new_folder.*" })
@CrossOrigin
public class AdminController {

    private ICustomerService customerService;
    private IAdminService adminService;

    @Autowired
    public void setCustomerService(@Qualifier("customerService") ICustomerService u){this.customerService=u;}

    @Autowired
    public void setAdminService(@Qualifier("adminService") IAdminService u){this.adminService=u;}

    @GetMapping("/getcustomers")
    public List<Customer> getAllCustomers(){
        return customerService.findAllCustomers();
    }

    @GetMapping("/gettrainers")
    public List<Trainer> getAllTrainers(){
        return customerService.getAllTrainers();
    }

    @DeleteMapping("/deletet/{id}")
    public void deleteTrainer(@PathVariable("id")Integer id){
        adminService.fireTrainer(id);
    }

    @DeleteMapping("/deletec/{id}")
    public void deleteCustomer(@PathVariable("id")Integer id){
        adminService.cancelSubscriptionUser(id);
    }

    @PutMapping("updateCapacity/{id}/{nr}")
    public void updateGymOccupancyRate(@PathVariable("id")Integer id, @PathVariable("nr") Integer nr){
        adminService.setOccupancyRate(id,nr);
    }


}
