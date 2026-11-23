package com.example.PracticeDB.controller;

import com.example.PracticeDB.model.Student;
import com.example.PracticeDB.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {
    @Autowired
    private studentService service;

    @PostMapping("/addStudent")
    public void add(){
//       service.saveStudent();
        service.saveStudentWithGuardian();
    }

    @GetMapping("/printStudent")
    public List<Student> printStudent(){
        return service.printAllStudent();
    }

    @GetMapping("/findId/{id}")
    public Student findById(@PathVariable int id){
        return service.printbyId(id);
    }

    @GetMapping("/findName/{name}")
    public List<Student> findByName(@PathVariable String name){
        return service.printByName(name);
    }

    @GetMapping("/findName/{firstname}/{lastname}")
    public List<Student> findById(@PathVariable String firstname,@PathVariable String lastname){
        return service.printByfirstNameAndLastName(firstname,lastname);
    }

    @GetMapping("/findEmail/{eId}")
    public ResponseEntity<Student> findByEmailId(@PathVariable String eId){
       return service.printByEmailId(eId).
               map(ResponseEntity::ok).
               orElse(ResponseEntity.notFound().build());

    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student){
        service.updateStudent(student);
    }


    @PutMapping("/update/{id}")
    public void updateStudent(
            @PathVariable("id") int id,
            @RequestParam("first") String firstName,
            @RequestParam("last") String lastName) {

        service.updateStudentFirstNameById(id, firstName,lastName);
//        return ResponseEntity.ok("Student updated successfully");
    }




}
