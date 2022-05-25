package com.new_folder.repository;

import com.new_folder.entity.Customer;
import com.new_folder.entity.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan({ "com.new_folder.*" })
public interface AdminRepository extends JpaRepository<User, Integer> {
}
