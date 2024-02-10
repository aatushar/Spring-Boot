package com.example.AccountingMangement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TestLedger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "journal_id")
    private Journal journal;

    private double debitAmount;

    private double creditAmount;

    // Getters and setters

    // Constructors, getters, and setters
}

