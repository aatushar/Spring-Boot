package com.example.ApiFirstProject.RestController;


import com.example.ApiFirstProject.Model.Department;
import com.example.ApiFirstProject.Model.Employee;
import com.example.ApiFirstProject.Repository.IDepartmentRepository;
import com.example.ApiFirstProject.Repository.IEmployeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin("*")
public class EmployeeRestController {
    @Autowired
    private IEmployeerepository employeerepository;

    @Autowired
    private IDepartmentRepository departmentRepository;

    @GetMapping("")
    public List<Employee> allEmployee(){
        return employeerepository.findAll();
    }
    @PostMapping("")
    public ResponseEntity <Employee> saveEmployee (@RequestBody Employee employee){
      String dName= employee.getDepartment().getDName();
        Department department= departmentRepository.findBydName(dName);

        employee.setDepartment(department);

        Employee savedEmployee = employeerepository.save(employee);
        return ResponseEntity.ok(savedEmployee);
    }
}
