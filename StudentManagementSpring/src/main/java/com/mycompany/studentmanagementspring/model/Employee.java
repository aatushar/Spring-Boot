
package com.mycompany.studentmanagementspring.model;


public class Employee {
    
    private int id;
    private String name;
    private String department;
    private String marks;
 

    public Employee() {
    }

    public Employee(int id, String name, String department, String marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
       
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public String getmarks() {
        return marks;
    }

    public void setmarks(String marks) {
        this.marks = marks;
    }

  

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", department=" + department + ", marks=" + marks +  '}';
    }
    
  
    
}
