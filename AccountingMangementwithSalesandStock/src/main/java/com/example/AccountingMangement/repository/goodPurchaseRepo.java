package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.GoodPurchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface goodPurchaseRepo extends JpaRepository<GoodPurchase, Integer> {
}
