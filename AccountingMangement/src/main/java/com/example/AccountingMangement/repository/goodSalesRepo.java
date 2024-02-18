package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.GoodSales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface goodSalesRepo extends JpaRepository<GoodSales, Integer> {
}
