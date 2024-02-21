package com.example.AccountingMangement.posRepository;

import com.example.AccountingMangement.entity.BrandName;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandNameRepository extends JpaRepository<BrandName, Integer> {

    BrandName findByName(String name);

}
