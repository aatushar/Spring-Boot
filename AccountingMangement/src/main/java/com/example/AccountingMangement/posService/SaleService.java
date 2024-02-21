package com.example.AccountingMangement.posService;


import com.example.AccountingMangement.entity.PurchaseGadgets;
import com.example.AccountingMangement.entity.Sales;
import com.example.AccountingMangement.entity.Stock;
import com.example.AccountingMangement.posRepository.IStockRepository;
import com.example.AccountingMangement.posRepository.SalesRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleService {


    private  final SalesRepository salesRepository;
    private final IStockRepository stockRepository;




    public Sales addSale(Sales sale) {
        // Update stock
        updateStock(sale.getMedicine(), sale.getQuantitySold());

        // Add sale
        return salesRepository.save(sale);
    }

    // Method to update stock
    private void updateStock(PurchaseGadgets medicine, double quantitySold) {
        Stock stock = stockRepository.findByMedicine(medicine);
        if (stock != null) {
            double updatedQuantity = stock.getTotalQuantity() - quantitySold;
            stock.setTotalQuantity(updatedQuantity);
            stockRepository.save(stock);
        } else {
            // Handle stock not found for the medicine
            // You may want to throw an exception or handle it based on your application logic
        }
    }

}
