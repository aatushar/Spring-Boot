package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.Chart;
import com.example.AccountingMangement.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chart")
public class ChartController {

    @Autowired
    private ChartService service;

    @GetMapping("/")
    public String getAllCharts(Model m) {
        List<Chart> chartList = service.getAllChart();
        m.addAttribute("chartList", chartList);

        m.addAttribute("title", "All Charts");
        return "chart";
    }

    @GetMapping("/addchart")
    public String addForm(Model m) {
        m.addAttribute("chart", new Chart());
        return "chart";
    }

    @PostMapping("/save")
    public String addChart(@ModelAttribute Chart c) {
        service.save(c);
        return "redirect:/chart/addchart";
    }

    @GetMapping("/delete/{id}")
    public String deleteChart(@PathVariable int id) {
        service.deleteChart(id);
        return "redirect:/chart/";
    }

    @GetMapping("/edit/{id}")
    public String editChart(@PathVariable int id, Model m) {
        Chart c = service.editChart(id);
        m.addAttribute("chart", c);
        return "/chart/addchart";
    }
}
