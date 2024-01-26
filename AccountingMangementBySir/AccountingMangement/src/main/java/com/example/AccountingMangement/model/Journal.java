package com.example.AccountingMangement.model;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
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
    private Long id;

    private String entryDescription;
    private Double debitAmount;
    private Double creditAmount;


    private Date entryDate;

    @ManyToOne
    @JoinColumn(name = "debit_chart_of_account_id")
    private ChartOfAccount debitChartOfAccount;

    @ManyToOne
    @JoinColumn(name = "credit_chart_of_account_id")
    private ChartOfAccount creditChartOfAccount;

}
