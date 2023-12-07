package com.tushar.SpringBoot55.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//@GetMapping("/student/")

@Controller
@RequestMapping("/ami")

public class Student {
    @GetMapping("/")
    public String allStudent (){
        return "student";
    }
}
