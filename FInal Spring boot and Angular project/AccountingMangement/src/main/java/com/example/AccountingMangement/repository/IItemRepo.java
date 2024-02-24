package com.example.AccountingMangement.repository;

import com.example.AccountingMangement.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemRepo extends JpaRepository<Item, Integer> {
}
