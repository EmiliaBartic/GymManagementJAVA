package com.new_folder.service;

import com.new_folder.entity.Customer;
import com.new_folder.entity.Trainer;
import com.new_folder.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerService {
    List<Customer> findAllCustomers();
    public Customer getCustomersInfo(int id);
    public List<Trainer> getAllTrainers();
    void updateHealthForId(int id,String health);
    void updateAboutMeId (int id,String ab);
    int getOccupancyRateGym(int id);
    void addCustomer(Customer u);
}
