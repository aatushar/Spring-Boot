package com.example.AccountingMangement.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.sql.Date;


@Entity
@Data
@ToString
public class PurchaseGadgets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int quantity;
    private double unitPrice;
    private Date productionDate;
    private Date expiryDate;

    @ManyToOne
    @JoinColumn(
            name = "generic_id"
    )
    GadgetType generic;

    @ManyToOne
    @JoinColumn(
            name = "manufacturer_id"
    )
    BrandName manufacturer;


    public PurchaseGadgets(String name, int quantity, double unitPrice, Date productionDate, Date expiryDate, GadgetType generic, BrandName manufacturer) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.productionDate = productionDate;
        this.expiryDate = expiryDate;
        this.generic = generic;
        this.manufacturer = manufacturer;
    }

    public PurchaseGadgets(int id, String name, int quantity, double unitPrice, Date productionDate, Date expiryDate, GadgetType generic, BrandName manufacturer) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.productionDate = productionDate;
        this.expiryDate = expiryDate;
        this.generic = generic;
        this.manufacturer = manufacturer;
    }

    public PurchaseGadgets(int id) {
        this.id = id;
    }
    public PurchaseGadgets() {

    }


}
