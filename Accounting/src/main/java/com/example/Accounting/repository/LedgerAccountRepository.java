package com.example.Accounting.repository;

import com.example.Accounting.model.LedgerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface LedgerAccountRepository extends JpaRepository<LedgerAccount, Long> {

    LedgerAccount findByName(String name);
}


