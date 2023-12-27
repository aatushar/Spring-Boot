package aatushar.com.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;


@Entity(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private int roll;

     @Column(name = "studentname", length = 50)
    private String name;

    @Column(unique = true, nullable = false)
    public String email;

    private  String  gender;

    private String department;

    private String  hobby;

    private String dob ;
}
