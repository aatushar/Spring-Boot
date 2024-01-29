package com.example.ApiFirstProject.Repository;

import com.example.ApiFirstProject.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department , Integer> {
    Department findBydName (String dName);
}
