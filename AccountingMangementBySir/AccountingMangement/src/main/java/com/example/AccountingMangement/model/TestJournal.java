package com.example.AccountingMangement.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

import java.util.Date;
import java.util.List;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TestJournal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    private String description;

    // Other fields as needed

    @OneToMany(mappedBy = "journal", cascade = CascadeType.ALL)
    private List<Ledger> ledgers;

    // Getters and setters

    // Constructors, getters, and setters
}

