package com.example.AccountingMangement.posRepository;

import com.example.AccountingMangement.entity.PurchaseGadgets;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseGadgetsRepository extends JpaRepository<PurchaseGadgets, Integer> {
    PurchaseGadgets findByName(String medicineName);
}
