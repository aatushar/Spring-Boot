package com.example.AccountingMangement.posService;

import com.example.AccountingMangement.entity.PurchaseGadgets;
import com.example.AccountingMangement.entity.Stock;
import com.example.AccountingMangement.posRepository.IStockRepository;
import com.example.AccountingMangement.posRepository.PurchaseGadgetsRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseGadgetsService {

    private final PurchaseGadgetsRepository medicineRepository;
    private final IStockRepository stockRepository;

    public void updateStock(PurchaseGadgets medicine) {
        Stock stock = stockRepository.findByMedicine(medicine);
        if (stock != null) {
            stock.setTotalQuantity(stock.getTotalQuantity() + medicine.getQuantity());
            double totalPrice=medicine.getQuantity()*medicine.getUnitPrice();
            stock.setTotalPrice(stock.getTotalPrice()+totalPrice);
            stockRepository.save(stock);
        } else {
            // Create new stock entry if it doesn't exist
            Stock newStock = new Stock();
            newStock.setMedicine(medicine);
            newStock.setTotalQuantity(medicine.getQuantity());
            double totalPrice=medicine.getQuantity()*medicine.getUnitPrice();
            newStock.setTotalPrice(newStock.getTotalPrice()+totalPrice);
            stockRepository.save(newStock);
        }
    }

}
