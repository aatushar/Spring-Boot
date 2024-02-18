package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.GoodPurchase;
import com.example.AccountingMangement.model.GoodSales;
import com.example.AccountingMangement.model.Stock;
import com.example.AccountingMangement.repository.StockRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockService {

    @Autowired
    private StockRepo stockRepository;

    @Transactional
    public void addGoodPurchase(GoodPurchase goodPurchase) {
        Stock existingStock = stockRepository.findByProductName(goodPurchase.getProductName());
        if (existingStock != null) {
            existingStock.setQuantity(existingStock.getQuantity() + goodPurchase.getQuantity());
        } else {
            Stock newStock = new Stock();
            newStock.setProductName(goodPurchase.getProductName());
            newStock.setQuantity(goodPurchase.getQuantity());
            stockRepository.save(newStock);
        }
    }

    @Transactional
    public void removeGoodSales(GoodSales goodSales) {
        Stock existingStock = stockRepository.findByProductName(goodSales.getProductName());
        if (existingStock != null) {
            existingStock.setQuantity(existingStock.getQuantity() - goodSales.getQuantity());
        }
    }

    public Iterable<Stock> getAllStock() {
        return stockRepository.findAll();
    }
}
