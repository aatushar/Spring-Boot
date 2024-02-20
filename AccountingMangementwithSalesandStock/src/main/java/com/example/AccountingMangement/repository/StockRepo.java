package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<Stock, Integer> {
    Stock findByProductName(String productName);
}
