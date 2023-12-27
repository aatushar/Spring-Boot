package aatushar.com.demo.controller;

import aatushar.com.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {

@Autowired
private StudentRepo repo;


    @GetMapping("/")
    public String allStudent(){

        return "studenthome";
    }

    @GetMapping("/add")
    public String addStudent(){

        return "addStudent";
    }
}
