package com.example.AccountingMangement.service;


import com.example.AccountingMangement.model.Customer;
import com.example.AccountingMangement.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private ICustomerRepo repo;

    public void save(Customer c){
        repo.save(c);

    }
    public List<Customer> getAllCustomer(){
        return repo.findAll();
    }

    public void deleteCustomer(int id){
        repo.deleteById(id);

    }

    public Customer editCustomer(int id){
        return repo.findById(id).get();
    }
}

