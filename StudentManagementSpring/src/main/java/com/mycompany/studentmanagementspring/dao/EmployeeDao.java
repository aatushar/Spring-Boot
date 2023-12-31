/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementspring.dao;


import com.mycompany.studentmanagementspring.model.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author user
 */
public class EmployeeDao {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    

    public int saveEmp(Employee e) {

        String sql = "insert into student(name, department, gender, marks)"
                + "values('" + e.getName() + "', '" + e.getdepartment() + "','" + e.getGender() +"', '" + e.getmarks() + "')";

        return jdbcTemplate.update(sql);
    }

    public int deleteEmp(int id) {

        String sql = "delete from student where id=" + id + " ";

        return jdbcTemplate.update(sql);
    }

    public int updateEmp(Employee e) {

        String sql = "update  student set name='"  +  e.getdepartment() + "' where id='" + e.getId() + "' ";

        return jdbcTemplate.update(sql);
    }

    public List<Employee> getAllEmp() {
        return jdbcTemplate.query("select * from student", new RowMapper<Employee>() {
            public Employee mapRow(ResultSet rs, int row) throws SQLException {
                Employee e = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getString("gender"),
                        rs.getString("marks")
                       
                );

                return e;
            }
        });

    }

    public Employee getEmpById(int id) {
        String sql = "select * from student where id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Employee>(Employee.class));
    }

}
