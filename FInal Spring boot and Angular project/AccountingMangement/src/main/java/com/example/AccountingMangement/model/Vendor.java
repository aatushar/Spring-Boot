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
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String salutation;
    private String firstName;
    private String lastName;
    private String companyName;
    private String vendorDisplayName;
    private String vendorEmail;
    private String vendorPhone;
    private String address;
    private String taxRate;
    private String paymentTerms;
    private String documentsAttached;


    // Additional fields can be added as needed

    // Getters and setters
}
