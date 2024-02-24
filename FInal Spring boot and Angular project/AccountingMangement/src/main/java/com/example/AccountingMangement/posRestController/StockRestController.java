package com.example.AccountingMangement.posRestController;


import com.example.AccountingMangement.entity.Stock;
import com.example.AccountingMangement.posRepository.IStockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/stock")
public class StockRestController {


    @Autowired
    private IStockRepository stockRepository;

    @GetMapping()
    public Optional<List<Stock>> getAllStock(){

        return Optional.of(stockRepository.findAll());
    }


}
