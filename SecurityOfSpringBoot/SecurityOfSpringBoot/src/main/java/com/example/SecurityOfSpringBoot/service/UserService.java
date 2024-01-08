package com.example.SecurityOfSpringBoot.service;

import com.example.SecurityOfSpringBoot.model.User;
import com.example.SecurityOfSpringBoot.repository.IUserRipo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private IUserRipo userRipo;

    public boolean isEmailUnique(String email){

        User userEmail = userRipo.getuserByEmail(email);
        return userEmail==null;

    }
}
