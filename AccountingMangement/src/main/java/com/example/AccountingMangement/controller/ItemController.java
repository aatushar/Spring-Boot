package com.example.AccountingMangement.controller;


import com.example.AccountingMangement.model.Item;
import com.example.AccountingMangement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller



@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService service;

    @GetMapping("/")
    public String getAllItem(Model m) {
        List<Item> itemList = service.getAllItem();
        m.addAttribute("itemList", itemList);
        m.addAttribute("title", "All Item");
        return "viewItem";
    }

    @GetMapping("/additem")
    public String addForm(Model m) {

        m.addAttribute("item", new Item());
        m.addAttribute("title", "Add Item");
        return "additem";

    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addItem(@ModelAttribute Item i) {
        service.save(i);
        return "redirect:/item/";


    }

    @GetMapping("/delete/{id}")
    public String deleteItem(@PathVariable int id) {

        service.deleteItem(id);
        return "redirect:/item/";
    }
    @GetMapping("/edit/{id}")
    public String editItem(@PathVariable int id, Model m) {

        Item i = service.editItem(id);
        m.addAttribute("item", i);

        return "additem";
    }
}
