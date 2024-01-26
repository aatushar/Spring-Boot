package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IJournalRepository extends JpaRepository<Journal, Long> {


}
