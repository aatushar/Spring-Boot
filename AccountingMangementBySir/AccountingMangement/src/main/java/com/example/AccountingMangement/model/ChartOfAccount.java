package com.example.AccountingMangement.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChartOfAccount {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

    private String accountCode;
    private String accountName;




}
