package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.Customer;
import com.example.AccountingMangement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/")
    public String getAllCustomers(Model m) {
        List<Customer> customerList = service.getAllCustomer();
        m.addAttribute("customerList", customerList);
        m.addAttribute("title", "All Customers");
        return "viewCustomer";
    }

    @GetMapping("/addcustomer")
    public String addForm(Model m) {
        m.addAttribute("customer", new Customer());
        m.addAttribute("title", "Add Customer");
        return "addCustomer";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addCustomer(@ModelAttribute Customer c) {
        service.save(c);
        return "redirect:/customer/";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        service.deleteCustomer(id);
        return "redirect:/customer/";
    }

    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable int id, Model m) {
        Customer c = service.editCustomer(id);
        m.addAttribute("customer", c);
        return "addCustomer";
    }
}
