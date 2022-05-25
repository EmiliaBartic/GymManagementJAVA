package com.new_folder.service;

import com.new_folder.entity.Customer;
import com.new_folder.entity.GymDetails;
import com.new_folder.entity.Trainer;
import com.new_folder.repository.CustomerRepository;
import com.new_folder.repository.GymRepository;
import com.new_folder.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@ComponentScan({ "com.new_folder.*" })
public class AdminService implements IAdminService {

    private TrainerRepository trainerRepository;
    private CustomerRepository customerRepository;
    private GymRepository gymRepository;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository){ this.customerRepository=customerRepository;}

    @Autowired
    public void setTrainerRepository(TrainerRepository tr){this.trainerRepository=tr;}

    @Autowired
    public void setGymRepository(GymRepository tr){this.gymRepository=tr;}

    @Transactional
    public void fireTrainer(Integer id) {
        Trainer t = trainerRepository.getById(id);
        trainerRepository.delete(t);
    }

    @Transactional
    public void cancelSubscriptionUser(Integer id) {
        Customer c = customerRepository.getById(id);
        customerRepository.delete(c);
    }

    @Transactional
    public void setOccupancyRate(Integer id,Integer nr){
        GymDetails gym = gymRepository.getById(id);
        gym.setOccupancyRate(nr);
        gymRepository.save(gym);
    }
}
