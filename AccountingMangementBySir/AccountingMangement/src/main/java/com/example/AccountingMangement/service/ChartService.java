package com.example.AccountingMangement.service;


import com.example.AccountingMangement.model.ChartOfAccount;
import com.example.AccountingMangement.repository.IChartOfAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartService {
    @Autowired
    private IChartOfAccountRepository repo;
    public void save(ChartOfAccount c){
        repo.save(c);
    }
    public List<ChartOfAccount> getAllChart(){
        return  repo.findAll();
    }




    public void deleteChart(long id){
        repo.deleteById(id);

    }

    public ChartOfAccount editChart(long id){
        return repo.findById(id).get();
    }
}
