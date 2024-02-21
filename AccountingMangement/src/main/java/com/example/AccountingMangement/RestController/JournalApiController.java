package com.example.AccountingMangement.RestController;

import com.example.AccountingMangement.model.Journal;
import com.example.AccountingMangement.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journals")
public class JournalApiController {

    @Autowired
    private JournalService service;

    @GetMapping("/")
    public ResponseEntity<List<Journal>> getAllJournals() {
        List<Journal> journalList = service.getAllJournal();
        return new ResponseEntity<>(journalList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addJournal(@RequestBody Journal journal) {
        service.save(journal);
        return ResponseEntity.ok("Data inserted");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteJournal(@PathVariable int id) {
        service.deleteJournal(id);
        return ResponseEntity.ok("Data deleted");
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> editJournal(@PathVariable int id, @RequestBody Journal updatedJournal) {
        Journal journal = service.editJournal(id);
        if (journal != null) {
            updatedJournal.setId(id);
            service.save(updatedJournal);
            return ResponseEntity.ok("Data updated");
        } else {
            return ResponseEntity.ok("Data not found");
        }
    }
}
