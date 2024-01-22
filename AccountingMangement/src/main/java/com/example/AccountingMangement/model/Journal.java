package com.example.AccountingMangement.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private Date journalDate;
    private String journalSerialNo;
    private String reference;
    private String notes;
    private boolean cashBasedJournal;
    private String transactionType;
    private String account;
    private String description;
    private String contact;
    private double tax;
    @Column(nullable = false)
    private double debits;
    @Column(nullable = false)
    private double credits;

    @ManyToOne
    @JoinColumn(name = "chartid")
     public Chart chart ;

}
