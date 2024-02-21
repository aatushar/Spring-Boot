package com.example.AccountingMangement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private double totalQuantity;
    private double totalPrice;

    @OneToOne
    @JoinColumn( name = "medicine_id"
    )
    PurchaseGadgets medicine;


}
