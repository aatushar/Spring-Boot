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
public class Product {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  int id;

    private  String name;
    private  float quantity;
    private  float unitPrice;
    private  float totalPrice;
    private Date productionDate;
    private Date expireDate;

//    @ManyToOne(
//    )
//    @JoinColumn(
//            name = "medicine_id"
//    )
//    Medicine medicine;


    public void calculateTotalPrice() {

        totalPrice = quantity * unitPrice;

    }



}
