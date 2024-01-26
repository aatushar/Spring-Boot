package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.ChartOfAccount;
import com.example.AccountingMangement.model.Journal;
import com.example.AccountingMangement.repository.IChartOfAccountRepository;
import com.example.AccountingMangement.service.ChartOfAccountService;
import com.example.AccountingMangement.service.ChartService;
import com.example.AccountingMangement.service.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/journals")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @Autowired
    private ChartOfAccountService chartOfAccountService;

    @GetMapping("")
    public String getAllJournals(Model model) {
        List<Journal> journals = journalService.getAllJournals();
        model.addAttribute("journals", journals);
        return "journals/list";
    }

    @GetMapping("/{id}")
    public String getJournalById(@PathVariable Long id, Model model) {
        Journal journal = journalService.getJournalById(id);
        model.addAttribute("journal", journal);
        return "journals/details";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        List<ChartOfAccount> chartOfAccounts = chartOfAccountService.getAllChartOfAccounts();
        model.addAttribute("chartOfAccounts", chartOfAccounts);

        model.addAttribute("journal", new Journal());
        model.addAttribute("editMode", false);
        return "journals/form";
    }

    @PostMapping("/create")
    public String createJournal(@ModelAttribute Journal journal,
                                @RequestParam Long debitChartOfAccountId,
                                @RequestParam Long creditChartOfAccountId) {
        ChartOfAccount debitChartOfAccount = chartOfAccountService.getChartOfAccountById(debitChartOfAccountId);
        ChartOfAccount creditChartOfAccount = chartOfAccountService.getChartOfAccountById(creditChartOfAccountId);

        journal.setDebitChartOfAccount(debitChartOfAccount);
        journal.setCreditChartOfAccount(creditChartOfAccount);

        journalService.createJournal(journal,debitChartOfAccountId,creditChartOfAccountId);
        return "redirect:/journals";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        List<ChartOfAccount> chartOfAccounts = chartOfAccountService.getAllChartOfAccounts();
        model.addAttribute("chartOfAccounts", chartOfAccounts);

        Journal journal = journalService.getJournalById(id);
        model.addAttribute("journal", journal);
        model.addAttribute("editMode", true);
        return "journals/form";
    }

    @PostMapping("/edit/{id}")
    public String updateJournal(@PathVariable Long id, @ModelAttribute Journal journal,
                                @RequestParam Long debitChartOfAccountId,
                                @RequestParam Long creditChartOfAccountId) {
        ChartOfAccount debitChartOfAccount = chartOfAccountService.getChartOfAccountById(debitChartOfAccountId);
        ChartOfAccount creditChartOfAccount = chartOfAccountService.getChartOfAccountById(creditChartOfAccountId);

        journal.setDebitChartOfAccount(debitChartOfAccount);
        journal.setCreditChartOfAccount(creditChartOfAccount);

        journalService.updateJournal(id,journal,debitChartOfAccountId,creditChartOfAccountId );
        return "redirect:/journals";
    }

    @GetMapping("/delete/{id}")
    public String deleteJournal(@PathVariable Long id) {
        journalService.deleteJournal(id);
        return "redirect:/journals";
    }

}
