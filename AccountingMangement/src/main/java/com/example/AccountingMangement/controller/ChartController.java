package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.Chart;
import com.example.AccountingMangement.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller

@RequestMapping("/chart")
public class ChartController {
    @Autowired
    private ChartService service;

    @GetMapping("/")
    public String getAllChart (Model m) {
        List<Chart> chartList = service.getAllChart();
        m.addAttribute("chartList", chartList);
        m.addAttribute("tiele", "All Chart");
        return "chart";

    }
        @GetMapping ("addchart")
                public String addfrom( Model m) {
            m.addAttribute("chart", new Chart());
            m.addAttribute("title", "Add Chart");

            return "chart";
        }

        @RequestMapping (value = "/save", method = RequestMethod.POST)
        public String addChart(@ModelAttribute Chart c){
            service.save(c);
            return "redirect:/chart/";
            }

    }







