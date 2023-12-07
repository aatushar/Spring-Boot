package com.tushar.SpringBoot55.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private int roll;
    private String name;
    private String mail;
    private String gender;
    private String dob;
    private String subject;
}
