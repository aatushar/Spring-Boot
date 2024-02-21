package com.example.AccountingMangement.RestController;

import com.example.AccountingMangement.model.Customer;
import com.example.AccountingMangement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerApiController {

    @Autowired
    private CustomerService service;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customerList = service.getAllCustomer();
        return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
        service.save(customer);
        return ResponseEntity.ok("Data inserted");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
        service.deleteCustomer(id);
        return ResponseEntity.ok("Data deleted");
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> editCustomer(@PathVariable int id, @RequestBody Customer updatedCustomer) {
        Customer customer = service.editCustomer(id);
        if (customer != null) {
            updatedCustomer.setId(id);
            service.save(updatedCustomer);
            return ResponseEntity.ok("Data updated");
        } else {
            return ResponseEntity.ok("Data not found");
        }
    }
}
