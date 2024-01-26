package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.ChartOfAccount;
import com.example.AccountingMangement.service.ChartOfAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chart-of-accounts")
public class ChartOfAccountController {

    @Autowired
    private ChartOfAccountService chartOfAccountService;

    @GetMapping
    public String getAllChartOfAccounts(Model model) {
        List<ChartOfAccount> chartOfAccounts = chartOfAccountService.getAllChartOfAccounts();
        model.addAttribute("chartOfAccounts", chartOfAccounts);
        return "chartOfAccounts/list"; // Assuming you have a Thymeleaf template named "list.html" in the "chartOfAccounts" folder
    }

    @GetMapping("/{id}")
    public String getChartOfAccountById(@PathVariable Long id, Model model) {
        ChartOfAccount chartOfAccount = chartOfAccountService.getChartOfAccountById(id);
        model.addAttribute("chartOfAccount", chartOfAccount);
        return "chartOfAccounts/details"; // Assuming you have a Thymeleaf template named "details.html" in the "chartOfAccounts" folder
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("chartOfAccount", new ChartOfAccount());
        return "/chartOfAccounts/create"; // Assuming you have a Thymeleaf template named "create.html" in the "chartOfAccounts" folder
    }

    @PostMapping("/create")
    public String createChartOfAccount(@ModelAttribute ChartOfAccount chartOfAccount) {
        chartOfAccountService.createChartOfAccount(chartOfAccount);
        return "redirect:/chart-of-accounts";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        ChartOfAccount chartOfAccount = chartOfAccountService.getChartOfAccountById(id);
        model.addAttribute("chartOfAccount", chartOfAccount);
        return "chartOfAccounts/edit"; // Assuming you have a Thymeleaf template named "edit.html" in the "chartOfAccounts" folder
    }

    @PostMapping("/edit/{id}")
    public String updateChartOfAccount(@PathVariable Long id, @ModelAttribute ChartOfAccount chartOfAccount) {
        chartOfAccountService.updateChartOfAccount(id, chartOfAccount);
        return "redirect:/chart-of-accounts";
    }

    @GetMapping("/delete/{id}")
    public String deleteChartOfAccount(@PathVariable Long id) {
        chartOfAccountService.deleteChartOfAccount(id);
        return "redirect:/chart-of-accounts";
    }
}
