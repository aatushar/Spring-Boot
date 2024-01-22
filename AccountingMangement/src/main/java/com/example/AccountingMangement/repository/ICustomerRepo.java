package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepo extends JpaRepository<Customer , Integer> {

}
