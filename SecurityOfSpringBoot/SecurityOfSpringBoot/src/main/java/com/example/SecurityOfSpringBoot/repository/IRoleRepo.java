package com.example.SecurityOfSpringBoot.repository;


import com.example.SecurityOfSpringBoot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepo extends JpaRepository<Role ,Integer> {

}
