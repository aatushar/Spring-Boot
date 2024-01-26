package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.ChartOfAccount;
import com.example.AccountingMangement.repository.IChartOfAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChartOfAccountService {

    @Autowired
    private IChartOfAccountRepository chartOfAccountRepository;

    public List<ChartOfAccount> getAllChartOfAccounts() {
        return chartOfAccountRepository.findAll();
    }

    public ChartOfAccount getChartOfAccountById(Long id) {
        Optional<ChartOfAccount> chartOfAccount = chartOfAccountRepository.findById(id);
        return chartOfAccount.orElse(null);
    }

    public ChartOfAccount createChartOfAccount(ChartOfAccount chartOfAccount) {
        return chartOfAccountRepository.save(chartOfAccount);
    }

    public ChartOfAccount updateChartOfAccount(Long id, ChartOfAccount updatedChartOfAccount) {
        Optional<ChartOfAccount> existingChartOfAccount = chartOfAccountRepository.findById(id);

        if (existingChartOfAccount.isPresent()) {
            ChartOfAccount chartOfAccount = existingChartOfAccount.get();
            chartOfAccount.setAccountCode(updatedChartOfAccount.getAccountCode());
            chartOfAccount.setAccountName(updatedChartOfAccount.getAccountName());

            return chartOfAccountRepository.save(chartOfAccount);
        } else {
            return null; // Handle the case where the chart of account with the given id is not found
        }
    }

    public void deleteChartOfAccount(Long id) {
        chartOfAccountRepository.deleteById(id);
    }
}
