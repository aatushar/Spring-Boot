package com.example.AccountingMangement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private Number quantity;

//    @OneToOne
//    @JoinColumn(name = "good_purchase_id") // Assuming good_purchase_id is the foreign key column in the Stock table
//    private GoodPurchase goodPurchase;
//
//    @OneToOne(mappedBy = "stock")
//    private goodSales goodSales;
}

