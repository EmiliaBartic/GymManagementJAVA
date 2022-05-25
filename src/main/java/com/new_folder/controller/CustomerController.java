package com.new_folder.controller;
import com.new_folder.entity.*;
import java.util.*;
import com.new_folder.repository.CustomerRepository;
import com.new_folder.entity.*;
import com.new_folder.repository.*;
import com.new_folder.service.CustomerService;
import com.new_folder.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@ComponentScan({ "com.new_folder.*" })
@CrossOrigin
public class CustomerController {

    private ICustomerService customerService;

    @Autowired
    public void setCustomerService(@Qualifier("customerService") ICustomerService u){this.customerService=u;}

    //@GetMapping("/")
//    public List<Customer> getAllCustomers(){
//        return customerService.findAllCustomers();
//    }

    @GetMapping(value = "/get/{id}", produces = "application/json")
    public Customer getCustomer(@PathVariable("id") Integer id){
        System.out.println("id:" + id);
        return customerService.getCustomersInfo(id);
    }

    @PutMapping(value = "/puth/{id}")
    public void updateCustomersHealth(@PathVariable("id") int id, @RequestBody String health){
        customerService.updateHealthForId(id,health);
    }

    @PutMapping(value = "/puta/{id}")
    public void updateAboutMeId(@PathVariable("id") int id, @RequestBody String about){
        customerService.updateHealthForId(id,about);
    }

    @GetMapping(value="/getgymocc/{id}")
    public int getMyGymOccupancyRate(@PathVariable("id") int id){
        return customerService.getOccupancyRateGym(id);
    }

    @PostMapping(value = "/addCustomer", consumes="application/json")
    public void addCustomer(@RequestBody Customer c){
        customerService.addCustomer(c);
    }
}
