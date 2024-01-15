package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.Journal;
import com.example.AccountingMangement.repository.JournalRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class JournalSerrvice {

    @Autowired
    private JournalRepo repo;

    public void saveJournal(Journal j){
        repo.save(j);
    }
}
