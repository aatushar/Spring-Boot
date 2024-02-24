package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.Invoice;
import com.example.AccountingMangement.repository.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepo repo;

    public void save(Invoice i) {
        repo.save(i);
    }

    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }

    public void deleteInvoice(int id) {
        repo.deleteById(id);
    }

    public Invoice editInvoice(int id) {
        return repo.findById(id).orElse(null);
    }
}
