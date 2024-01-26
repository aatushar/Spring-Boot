package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.ChartOfAccount;
import com.example.AccountingMangement.model.Journal;
import com.example.AccountingMangement.repository.IJournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalService {

    @Autowired
    private IJournalRepository journalRepository;

    @Autowired
    private ChartOfAccountService chartOfAccountService;

    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    public Journal getJournalById(Long id) {
        Optional<Journal> journal = journalRepository.findById(id);
        return journal.orElse(null);
    }

    public Journal createJournal(Journal journal, Long debitChartOfAccountId, Long creditChartOfAccountId) {
        ChartOfAccount debitChartOfAccount = chartOfAccountService.getChartOfAccountById(debitChartOfAccountId);
        ChartOfAccount creditChartOfAccount = chartOfAccountService.getChartOfAccountById(creditChartOfAccountId);

        journal.setDebitChartOfAccount(debitChartOfAccount);
        journal.setCreditChartOfAccount(creditChartOfAccount);

        // Add logic to balance the debit and credit amounts if needed
        if (journal.getDebitAmount() == null || journal.getCreditAmount() == null) {
            // Handle the case where debit or credit amount is not provided
            throw new IllegalArgumentException("Debit and Credit amounts must be provided.");
        }

        if (!journal.getDebitAmount().equals(journal.getCreditAmount())) {
            // Handle the case where debit and credit amounts are not equal
            throw new IllegalArgumentException("Debit and Credit amounts must be equal for a balanced entry.");
        }

        return journalRepository.save(journal);
    }

    public Journal updateJournal(Long id, Journal updatedJournal, Long debitChartOfAccountId, Long creditChartOfAccountId) {
        Optional<Journal> existingJournal = journalRepository.findById(id);

        if (existingJournal.isPresent()) {
            Journal journal = existingJournal.get();

            ChartOfAccount debitChartOfAccount = chartOfAccountService.getChartOfAccountById(debitChartOfAccountId);
            ChartOfAccount creditChartOfAccount = chartOfAccountService.getChartOfAccountById(creditChartOfAccountId);

            journal.setDebitChartOfAccount(debitChartOfAccount);
            journal.setCreditChartOfAccount(creditChartOfAccount);

            // Add logic to balance the debit and credit amounts if needed
            if (updatedJournal.getDebitAmount() == null || updatedJournal.getCreditAmount() == null) {
                // Handle the case where debit or credit amount is not provided
                throw new IllegalArgumentException("Debit and Credit amounts must be provided.");
            }

            if (!updatedJournal.getDebitAmount().equals(updatedJournal.getCreditAmount())) {
                // Handle the case where debit and credit amounts are not equal
                throw new IllegalArgumentException("Debit and Credit amounts must be equal for a balanced entry.");
            }

            journal.setDebitAmount(updatedJournal.getDebitAmount());
            journal.setCreditAmount(updatedJournal.getCreditAmount());

            return journalRepository.save(journal);
        } else {
            return null; // Handle the case where the journal with the given id is not found
        }
    }

    public void deleteJournal(Long id) {
        journalRepository.deleteById(id);
    }
}
