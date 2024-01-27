package com.example.ApiFirstProject.Repository;

import com.example.ApiFirstProject.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
