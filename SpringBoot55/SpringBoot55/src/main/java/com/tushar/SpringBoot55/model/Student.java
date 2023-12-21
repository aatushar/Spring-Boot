package com.tushar.SpringBoot55.model;

import jakarta.persistence.*;
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
    @Column(name = "studentName", length = 50)
    private String name;
    private String mail;
    private String gender;
    private String dob;
    private String subject;
}
