package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo extends JpaRepository<Vendor , Integer> {
}
