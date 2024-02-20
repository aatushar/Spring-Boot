package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Integer> {
}
