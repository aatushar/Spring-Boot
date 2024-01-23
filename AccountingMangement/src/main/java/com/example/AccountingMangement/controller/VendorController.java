package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.Vendor;
import com.example.AccountingMangement.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vendor")
public class VendorController {

    @Autowired
    private VendorService service;

    @GetMapping("/")
    public String getAllVendors(Model m) {
        List<Vendor> vendorList = service.getAllVendors();
        m.addAttribute("vendorList", vendorList);

        m.addAttribute("title", "All Vendors");
        return "addvendor"; // Assuming you have an addVendor.html template
    }

    @GetMapping("/addvendor")
    public String addForm(Model m) {
        m.addAttribute("vendor", new Vendor());
        return "addvendor"; // Assuming you have an addVendor.html template
    }

    @PostMapping("/save")
    public String addVendor(@ModelAttribute Vendor vendor) {
        service.save(vendor);
        return "redirect:/vendor/addvendor";
    }

    @GetMapping("/delete/{id}")
    public String deleteVendor(@PathVariable int id) {
        service.deleteVendor(id);
        return "redirect:/vendor/";
    }

    @GetMapping("/edit/{id}")
    public String editVendor(@PathVariable int id, Model m) {
        Vendor vendor = service.editVendor(id);
        m.addAttribute("vendor", vendor);
        return "addvendor/addvendor"; // Assuming you have an addvendor.html template
    }
}
