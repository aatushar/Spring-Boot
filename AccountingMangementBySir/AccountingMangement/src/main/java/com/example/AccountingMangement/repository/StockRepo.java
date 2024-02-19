package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Stock;

import java.util.List;

public interface StockRepo {

    List<Stock> getAllItems();
    Stock getItemById(String id);
    void addItem(Stock item);
    void updateItem(Stock item);
}
