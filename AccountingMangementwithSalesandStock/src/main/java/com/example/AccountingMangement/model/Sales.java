package com.example.AccountingMangement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;

//    @ManyToOne
//    @JoinColumn(name = "medicine_id")
    private String product_name;
    private int quantitySold;
    private double totalPrice;
    private Date saleDate;


}