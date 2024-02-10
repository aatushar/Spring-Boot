package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.TestLedger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestLedgerRepo  extends JpaRepository<TestLedger, Long> {
}
