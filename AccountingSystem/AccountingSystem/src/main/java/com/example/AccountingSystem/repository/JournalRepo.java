package com.example.AccountingSystem.repository;

import com.example.AccountingSystem.model.Journal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepo extends JpaRepository<Journal, Long> {
}