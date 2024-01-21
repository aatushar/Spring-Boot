package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.Journal;
import com.example.AccountingMangement.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    private JournalService service;

    @GetMapping("/")
    public String getAllJournal(Model m) {
        List<Journal> journalList = service.getAllJournal();
        m.addAttribute("journalList", journalList);
        m.addAttribute("title", "All Journal");
        return "journal";
    }



    @GetMapping("/addjournal")
    public String addForm(Model m) {
        m.addAttribute("journal", new Journal());

        return "journal";
    }

    @PostMapping("/save")
    public String addJournal(@ModelAttribute Journal j) {
        service.save(j);
        return "redirect:/journal/addjournal";
    }
    @GetMapping("/delete/{id}")
    public String deleteJournal(@PathVariable int id) {
        service.deleteJournal(id);
        return "redirect:/journal/";
    }

    @GetMapping("/edit/{id}")
    public String editJournal(@PathVariable int id, Model m) {
        Journal j = service.editJournal(id);
        m.addAttribute("journal", j);
        return "/journal/addjournal";
    }
}
