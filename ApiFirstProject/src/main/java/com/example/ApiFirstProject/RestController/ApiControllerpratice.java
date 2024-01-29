

//package com.example.ApiFirstProject.RestController;
//
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
//@RequestMapping("/api")
//@CrossOrigin("*")
//public class ApiControllerpratice {
//
//    @Autowired
//    StudentRepo studentRepo;
//
//    public List<Student> allStudent(){
//        return studentRepo.findAll();
//    }
//    @PostMapping("/student")
//    public Student saveStudent(@RequestBody Student student){
//        return studentRepo.save(student);
//    }
//
//    @DeleteMapping("/student?{id}")
//    public ResponseEntity<String> delete(@PathVariable("id") int id){
//        boolean exist =studentRepo.existsById(id);
//        return new ResponseEntity<>(" Student is delated", HttpStatus.OK);
//
//
//    }
//    ;return new ResponseEntity<>("Student is not exist", HttpStatus.BAD_REQUEST);
//
//
//
//}
//
//@PutMapping("/student/{id}")
//public ResponseEntity<String> update(@PathVariable("id") int id, @RequestBody Student student){
//if(exist){
//    student student1 = studentRepo.getByID(id);
//    student1.setName(student.getName());
//    student1.setId(id);
//    studentRepo.save(student);
//    return new ReposponeEntity<("Student is updated", HttpStatus.ok>;
//
//}return new ResponseEntity<>("Student is not Exist ", HttpStatus.BAD )
//
//
//}
