package com.example.ApiFirstProject.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)

  private Integer id;

  private String name;
  private  String department;

  @ManyToOne
  @JoinColumn ( name = "seudent_id")
  private  Student student;


}
