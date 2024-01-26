package com.example.AccountingMangement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String customerName;
    private String invoiceNumber;
    private String orderNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date invoiceDate;

    private String terms;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;

    private String salesPerson;

    // Additional fields can be added as needed

    // Getters and setters
}
