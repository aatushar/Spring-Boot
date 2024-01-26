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
public class Ledger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "chart_of_account_id")
    private ChartOfAccount chartOfAccount;

    private Date transactionDate;

    private Double debitAmount;
    private Double creditAmount;


}
