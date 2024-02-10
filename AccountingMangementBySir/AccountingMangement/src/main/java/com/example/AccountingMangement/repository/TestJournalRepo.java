package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.TestJournal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestJournalRepo extends JpaRepository<TestJournal, Long> {
}
