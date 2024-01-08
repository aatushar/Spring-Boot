package com.example.SecurityOfSpringBoot.repository;

import com.example.SecurityOfSpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUserRipo extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.email=:email")
    public User getuserByEmail(@Param("email")String email);


}
