package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer
        > {
}
