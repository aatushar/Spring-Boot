package com.example.AccountingSystem.service;

import com.example.AccountingSystem.model.Journal;
import com.example.AccountingSystem.model.Ledger;
import com.example.AccountingSystem.repository.JournalRepo;
import com.example.AccountingSystem.repository.LedgerRepository;
import com.example.accounting.model.Journal;
import com.example.accounting.model.Ledger;
import com.example.accounting.repository.JournalRepository;
import com.example.accounting.repository.LedgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class JournalService {

    @Autowired
    private JournalRepo journalRepository;

    @Autowired
    private LedgerRepository ledgerRepository;

    public void saveJournal(Journal journal) {
        journalRepository.save(journal);
    }

    public void updateLedger(String accountNumber, BigDecimal debit, BigDecimal credit) {
        Ledger ledger = ledgerRepository.(accountNumber);

        if (ledger == null) {
            throw new RuntimeException("Ledger account not found.");
        }

        if (debit != null) {
            ledger.setBalance(ledger.getBalance().add(debit));
        } else if (credit != null) {
            ledger.setBalance(ledger.getBalance().subtract(credit));
        }

        ledgerRepository.save(ledger);
    }
}