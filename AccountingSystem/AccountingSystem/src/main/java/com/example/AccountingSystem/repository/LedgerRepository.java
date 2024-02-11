package com.example.AccountingSystem.repository;



import com.example.AccountingSystem.model.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LedgerRepository extends JpaRepository<Ledger ,Long> {

}
