package com.new_folder.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface IAdminService {

    public void fireTrainer(Integer id);
    public void cancelSubscriptionUser(Integer id);
    public void setOccupancyRate(Integer id,Integer nr);
}
