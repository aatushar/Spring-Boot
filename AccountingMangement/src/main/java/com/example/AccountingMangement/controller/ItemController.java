package com.example.AccountingMangement.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller



@RequestMapping("/item")
public class ItemController {
    @GetMapping("")
    public String item(){
        return "item";
    }
//    @GetMapping("/index")
//    public String index(){
//        return "index";
//    }

}
