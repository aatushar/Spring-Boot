package com.example.AccountingMangement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class GoodSales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productName;
    private Number quantity;
    private Number price;
    private String customerName;
    private Date  salesDate;


//    @OneToOne(mappedBy = "goodSales")
//    private Stock stock;


}
