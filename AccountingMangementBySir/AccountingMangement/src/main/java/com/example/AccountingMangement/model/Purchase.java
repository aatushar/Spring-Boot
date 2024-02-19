package com.example.AccountingMangement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;



@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String itemId;
    private int quantity;
    private double totalPrice;
    private LocalDateTime purchaseDate;
}