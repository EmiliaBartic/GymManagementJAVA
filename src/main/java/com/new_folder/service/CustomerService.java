package com.new_folder.service;


import com.new_folder.entity.Customer;
import com.new_folder.entity.GymDetails;
import com.new_folder.entity.Trainer;
import com.new_folder.entity.User;
import com.new_folder.repository.CustomerRepository;
import com.new_folder.repository.GymRepository;
import com.new_folder.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@ComponentScan({ "com.new_folder.*" })
public class CustomerService implements ICustomerService {

    private CustomerRepository customerRepository;
    private TrainerRepository trainerRepository;
    private GymRepository gymRepository;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository){ this.customerRepository=customerRepository;}

    @Autowired
    public void setTrainerRepository(TrainerRepository tr){this.trainerRepository=tr;}

    @Autowired
    public void setGymRepository(GymRepository tr){this.gymRepository=tr;}


    @Transactional
    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }

    @Transactional
    public Customer getCustomersInfo(int id){
        return customerRepository.getById(id);
    }

    @Transactional
    public void addCustomer(Customer c){
        customerRepository.save(c);
    }

    @Transactional
    public List<Trainer> getAllTrainers(){
        return trainerRepository.findAll();
    }

    @Transactional
    public void updateHealthForId(int id,String health){
        Customer customer = customerRepository.getById(id);
        customer.setCurrentHealth(health);
        customerRepository.save(customer);
    }

    @Transactional
    public void updateAboutMeId (int id,String ab){
        Customer customer = customerRepository.getById(id);
        customer.setAboutMe(ab);
        customerRepository.save(customer);
    }

    @Transactional
    public int getOccupancyRateGym(int userid){
        Customer customer = customerRepository.getById(userid);
        GymDetails gym = gymRepository.getById(customer.getIdGym());
        return gym.getOccupancyRate();
    }




}
