package com.new_folder.repository;

import com.new_folder.entity.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@ComponentScan({ "com.new_folder.*" })
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
