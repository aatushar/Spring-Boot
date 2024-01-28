package com.example.ApiFirstProject.Repository;

import com.example.ApiFirstProject.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);
}
