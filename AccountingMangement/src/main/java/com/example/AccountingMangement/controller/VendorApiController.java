package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.Vendor;
import com.example.AccountingMangement.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
public class VendorApiController {

    @Autowired
    private VendorService service;

    @GetMapping("/")
    public ResponseEntity<List<Vendor>> getAllVendors() {
        List<Vendor> vendorList = service.getAllVendors();
        return new ResponseEntity<>(vendorList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addVendor(@RequestBody Vendor vendor) {
        service.save(vendor);
        return ResponseEntity.ok("Data inserted");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteVendor(@PathVariable int id) {
        service.deleteVendor(id);
        return ResponseEntity.ok("Data deleted");
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> editVendor(@PathVariable int id, @RequestBody Vendor updatedVendor) {
        Vendor vendor = service.editVendor(id);
        if (vendor != null) {
            updatedVendor.setId((long) id); // Passing the id to setId() method
            service.save(updatedVendor);
            return ResponseEntity.ok("Data updated");
        } else {
            return ResponseEntity.ok("Data not found");
        }
    }
}
