package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.Invoice;
import com.example.AccountingMangement.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @GetMapping("/")
    public String getAllInvoices(Model m) {
        List<Invoice> invoiceList = service.getAllInvoices();
        m.addAttribute("invoiceList", invoiceList);

        m.addAttribute("title", "All Invoices");
        return "addInvoice";
    }

    @GetMapping("/addinvoice")
    public String addForm(Model m) {
        m.addAttribute("invoice", new Invoice());
        return "addInvoice";
    }

    @PostMapping("/save")
    public String addInvoice(@ModelAttribute Invoice invoice) {
        service.save(invoice);
        return "redirect:/invoice/addinvoice";
    }

    @GetMapping("/delete/{id}")
    public String deleteInvoice(@PathVariable int id) {
        service.deleteInvoice(id);
        return "redirect:/addInvoice/";
    }

    @GetMapping("/edit/{id}")
    public String editInvoice(@PathVariable int id, Model m) {
        Invoice invoice = service.editInvoice(id);
        m.addAttribute("invoice", invoice);
        return "/addInvoice/addinvoice";
    }
}
