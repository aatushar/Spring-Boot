package com.example.SecurityOfSpringBoot.controller;

import com.example.SecurityOfSpringBoot.model.Role;
import com.example.SecurityOfSpringBoot.model.User;
import com.example.SecurityOfSpringBoot.repository.IRoleRepo;
import com.example.SecurityOfSpringBoot.repository.IUserRipo;
import com.example.SecurityOfSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private IRoleRepo roleRepo;

    @Autowired
    private IUserRipo userRipo;


    @GetMapping("")
    public String viewAllUser(Model m){
       List<User> userList = userRipo.findAll();
       m.addAttribute("userList", userList);

       return "alluser";
    }
    @RequestMapping("/saveform")
    public String userSaveform(Model m){
        m.addAttribute("user", new User());
        return "saveuserform";
    }

    @PostMapping(value = "/save")

    public String userSave(@ModelAttribute User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        Role userRole = new Role(1);
        user.addRole(userRole);
        userRipo.save(user);


        return "redirect:/user";


    }
}
