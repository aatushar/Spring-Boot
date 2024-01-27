package com.example.ApiFirstProject.RestController;


import com.example.ApiFirstProject.Model.Student;
import com.example.ApiFirstProject.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ApiController {

    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/student")
    public List<Student> allStudent(){
        return studentRepo.findAll();
    }
 @PostMapping("/student")
    public Student svaeStudent(@RequestBody Student student){
       return studentRepo.save(student);
 }
 @DeleteMapping("/student/{id}")
    public ResponseEntity<String> delete (@PathVariable("id") int id){
   boolean exist = studentRepo.existsById(id);
   if(exist){
       studentRepo.deleteById(id);
       return new ResponseEntity<>("Student is deleated", HttpStatus.OK);
   }
   return new ResponseEntity<>("Student is not exist" , HttpStatus.BAD_REQUEST);

 }
 @PutMapping("/student/{id}")
    public ResponseEntity<String> update(@PathVariable("id") int id, @RequestBody Student student){
       boolean exist = studentRepo.existsById(id);
       if (exist){
           Student student1 = studentRepo.getById(id);
           student1.setName(student.getName());
           student1.setId(id);
           studentRepo.save(student);
           return  new ResponseEntity<>("Student is updated", HttpStatus.OK);


       }
       return new ResponseEntity<>("Student is not Exist", HttpStatus.BAD_REQUEST);
 }
}
