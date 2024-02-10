package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.TestJournal;
import com.example.AccountingMangement.model.TestLedger;
import com.example.AccountingMangement.repository.TestJournalRepo;
import com.example.AccountingMangement.repository.TestLedgerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestJournalService {
    @Autowired
    private TestJournalRepo journalRepository;

    @Autowired
    private TestLedgerRepo ledgerRepository;

    public void createJournalEntry(TestJournal journal) {
        journalRepository.save(journal);

        // Logic to update ledger entries based on the journal
        for (TestLedger testLedger : journal.getLedgers()) {
            testLedger.setJournal(journal);
            ledgerRepository.save(testLedger);
        }
    }
}
