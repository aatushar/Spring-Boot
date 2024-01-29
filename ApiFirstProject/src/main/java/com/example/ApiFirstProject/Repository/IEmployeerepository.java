package com.example.ApiFirstProject.Repository;

import com.example.ApiFirstProject.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeerepository extends JpaRepository<Employee, Long> {
}
