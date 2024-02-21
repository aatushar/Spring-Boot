package com.example.AccountingMangement.posRepository;

import com.example.AccountingMangement.entity.PurchaseGadgets;
import com.example.AccountingMangement.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStockRepository extends JpaRepository<Stock,Integer> {
    Stock findByMedicine(PurchaseGadgets medicine);

}
