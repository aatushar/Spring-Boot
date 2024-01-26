package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.ChartOfAccount;
import com.example.AccountingMangement.model.Ledger;
import com.example.AccountingMangement.repository.ILedgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LedgerService {
    @Autowired
    private ILedgerRepository ledgerRepository;

    public List<Ledger> getAllLedgers() {
        return ledgerRepository.findAll();
    }

    public Ledger getLedgerById(Long id) {
        return ledgerRepository.findById(id).orElse(null);
    }

    public Ledger createLedger(ChartOfAccount chartOfAccount, Double debitAmount, Double creditAmount) {
        Ledger ledger = new Ledger();
        ledger.setChartOfAccount(chartOfAccount);
        ledger.setDebitAmount(debitAmount);
        ledger.setCreditAmount(creditAmount);
        // Set other fields as needed
        return ledgerRepository.save(ledger);
    }

    // Additional methods for updating and deleting ledgers

    // Example: Update ledger
    public Ledger updateLedger(Long id, ChartOfAccount chartOfAccount, Double debitAmount, Double creditAmount) {
        Ledger ledger = ledgerRepository.findById(id).orElse(null);
        if (ledger != null) {
            ledger.setChartOfAccount(chartOfAccount);
            ledger.setDebitAmount(debitAmount);
            ledger.setCreditAmount(creditAmount);
            // Set other fields as needed
            return ledgerRepository.save(ledger);
        }
        return null;
    }

    // Example: Delete ledger
    public void deleteLedger(Long id) {
        ledgerRepository.deleteById(id);
    }

}
