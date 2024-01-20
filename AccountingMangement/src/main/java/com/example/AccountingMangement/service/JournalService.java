package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.Journal;
import com.example.AccountingMangement.repository.JournalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService {

    @Autowired
    private JournalRepo repo;

    public void save(Journal j) {
        repo.save(j);
    }

    public List<Journal> getAllJournal() {
        return repo.findAll();
    }

    public void deleteJournal(int id) {
        repo.deleteById(id);
    }

    public Journal editJournal(int id) {
        return repo.findById(id).get();
    }
}
