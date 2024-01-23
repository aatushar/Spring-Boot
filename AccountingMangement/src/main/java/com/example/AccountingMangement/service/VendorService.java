package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.Vendor;

import com.example.AccountingMangement.repository.VendorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    @Autowired
    private VendorRepo repo;

    public void save(Vendor v) {
        repo.save(v);
    }

    public List<Vendor> getAllVendors() {
        return repo.findAll();
    }

    public void deleteVendor(int id) {
        repo.deleteById(id);
    }

    public Vendor editVendor(int id) {
        return repo.findById(id).get();
    }
}
