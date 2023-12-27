/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.StudentInfoSpring.controller;

import com.mycompany.StudentInfoSpring.dao.StudentDao;
import com.mycompany.StudentInfoSpring.model.Student;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author user
 */
@Controller 
public class StudentController {
    
    @Autowired
    private StudentDao dao;
    
    @GetMapping("/studentform")    
    public String showform(Model m){    
        m.addAttribute("student", new Student());  
        return "studentform";   
    }  
    
    
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("student") Student student){    
        dao.saveStudent(student);    
        return "redirect:/viewstudent";//will redirect to viewemp request mapping    
    } 
    
    
    @RequestMapping("/viewstudent")    
    public String viewemp(Model m){    
        List<Student> list=dao.getStudents();    
        m.addAttribute("list",list);  
        return "viewstudent";    
    }  
    @RequestMapping(value="/editstudent/{id}")    
    public String edit(@PathVariable("id") int id, Model m){    
        Student student=dao.getStudentById(id);    
        m.addAttribute("student",student);  
        return "studenteditform";    
    }    
    /* It updates model object. */    
    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("student") Student student){    
        dao.updateStudent(student);    
        return "redirect:/viewstudent";    
    }       
    /* It deletes record for the given id in URL and redirects to /viewemp */    
    @RequestMapping(value="/deletestudent/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.delete(id);    
        return "redirect:/viewstudent";    
    }  
    
    
    
    
}
