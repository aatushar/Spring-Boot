package com.example.AccountingMangement.service;


import com.example.AccountingMangement.model.Chart;
import com.example.AccountingMangement.repository.IChartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartService {
    @Autowired
    private IChartRepo repo;
    public Chart save(Chart c){
        repo.save(c);
        return c;
    }
    public List<Chart> getAllChart(){
        return
                repo.findAll();
    }

    public void deleteChart(int id){
        repo.deleteById(id);


    }

    public Chart editChart(int id){

        return repo.findById(id).get();
    }
}
