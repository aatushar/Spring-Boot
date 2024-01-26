package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.ChartOfAccount;
import com.example.AccountingMangement.model.Journal;
import com.example.AccountingMangement.model.Ledger;
import com.example.AccountingMangement.service.ChartOfAccountService;
import com.example.AccountingMangement.service.JournalService;
import com.example.AccountingMangement.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/ledgers")
public class LedgerController {

    @Autowired
    private LedgerService ledgerService;

    @Autowired
    private ChartOfAccountService chartOfAccountService;

    @Autowired
    private JournalService journalService;

    @GetMapping
    public String listLedgers(Model model) {
        List<Ledger> ledgers = ledgerService.getAllLedgers();
        model.addAttribute("ledgers", ledgers);
        return "ledgers/list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        List<ChartOfAccount> chartOfAccounts = chartOfAccountService.getAllChartOfAccounts();
        model.addAttribute("chartOfAccounts", chartOfAccounts);
        model.addAttribute("ledger", new Ledger());
        return "ledgers/create-form"; // Thymeleaf template
    }

    @PostMapping("/create")
    public String createLedger(@ModelAttribute Ledger ledger) {
        // Validate and save the ledger entry
        ledgerService.createLedger(ledger.getChartOfAccount(), ledger.getDebitAmount(), ledger.getCreditAmount());
        return "redirect:/ledgers";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Ledger ledger = ledgerService.getLedgerById(id);
        if (ledger != null) {
            List<ChartOfAccount> chartOfAccounts = chartOfAccountService.getAllChartOfAccounts();
            model.addAttribute("chartOfAccounts", chartOfAccounts);
            model.addAttribute("ledger", ledger);
            model.addAttribute("editMode", true);
            return "ledgers/form";
        } else {
            return "redirect:/ledgers";
        }
    }

    @PostMapping("/edit/{id}")
    public String updateLedger(@PathVariable Long id, @ModelAttribute Ledger updatedLedger) {
        Ledger ledger = ledgerService.getLedgerById(id);
        if (ledger != null) {
            ledgerService.updateLedger(id, updatedLedger.getChartOfAccount(), updatedLedger.getDebitAmount(), updatedLedger.getCreditAmount());
        }
        return "redirect:/ledgers";
    }

    @GetMapping("/delete/{id}")
    public String deleteLedger(@PathVariable Long id) {
        ledgerService.deleteLedger(id);
        return "redirect:/ledgers";
    }
}
