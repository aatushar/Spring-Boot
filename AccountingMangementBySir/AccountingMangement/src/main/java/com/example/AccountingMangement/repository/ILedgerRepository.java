package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILedgerRepository extends JpaRepository<Ledger, Long> {

}
