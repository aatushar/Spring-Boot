package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepo extends JpaRepository<Journal, Integer> {


}
