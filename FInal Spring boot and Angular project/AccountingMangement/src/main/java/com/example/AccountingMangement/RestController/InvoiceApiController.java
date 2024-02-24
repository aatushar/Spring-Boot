package com.example.AccountingMangement.RestController;

import com.example.AccountingMangement.model.Invoice;
import com.example.AccountingMangement.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoices")
@CrossOrigin("*")
public class InvoiceApiController {

    @Autowired
    private InvoiceService service;

    @GetMapping("/")
    public ResponseEntity<List<Invoice>> getAllInvoices() {
        List<Invoice> invoiceList = service.getAllInvoices();
        return new ResponseEntity<>(invoiceList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addInvoice(@RequestBody Invoice invoice) {
        service.save(invoice);
        return ResponseEntity.ok("Data inserted");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteInvoice(@PathVariable int id) {
        service.deleteInvoice(id);
        return ResponseEntity.ok("Data deleted");
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> editInvoice(@PathVariable int id, @RequestBody Invoice updatedInvoice) {
        Invoice invoice = service.editInvoice(id);
        if (invoice != null) {
            updatedInvoice.setId(id);
            service.save(updatedInvoice);
            return ResponseEntity.ok("Data updated");
        } else {
            return ResponseEntity.ok("Data not found");
        }
    }
}
