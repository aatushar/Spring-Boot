package com.example.ApiFirstProject.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(unique = true)
    private  String email;
    @Column(length = 12)
    private String gender;
    private String ecellNo;
    private Date dob;
    private  String image;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(
            name = "dep_id"
    )
    private Department department;
}
