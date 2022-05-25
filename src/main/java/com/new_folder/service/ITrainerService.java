package com.new_folder.service;

import com.new_folder.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ITrainerService {
    List<Customer> getMyCustomers(Integer id);

}
