package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepo extends JpaRepository<Invoice, Integer> {
}
