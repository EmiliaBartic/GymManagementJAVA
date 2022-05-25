package com.new_folder.repository;

import com.new_folder.entity.GymDetails;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
@ComponentScan({ "com.new_folder.*" })
public interface GymRepository extends JpaRepository<GymDetails, Integer> {

}
