//package com.example.ApiFirstProject.RestController;
//
//import com.example.ApiFirstProject.Model.Student;
//import com.example.ApiFirstProject.Repository.StudentRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/student")
//@CrossOrigin("*")
//public class StudentRestController {
//
//    @Autowired
//    private StudentRepo studentRepo;
//
//    @PostMapping("/")
//    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
//        // Assuming you want to check if the student with the same name already exists
//        List<Student> existingStudents = studentRepo.findByName(student.getName());
//        if (!existingStudents.isEmpty()) {
//            // You may handle the case where a student with the same name already exists
//            return new ResponseEntity<>(HttpStatus.CONFLICT);
//        }
//
//        Student savedStudent = studentRepo.save(student);
//        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
//    }
//}
