package com.example.PracticeDB.service;

import com.example.PracticeDB.model.Guardian;
import com.example.PracticeDB.model.Student;
import com.example.PracticeDB.repository.studentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class studentService {
    @Autowired
   private studentRepo repo;


//    public void saveStudent(){
//        Student student = Student.builder()
//                .firstName("Ali")
//                .lastName("khan")
//                .emailId("ali@gmail.com")
//                .guardianName("jan")
//                .guardianEmail("jan@gmail.com")
//                .guardianMobile("0782234560")
//                .build();
//
//        repo.save(student);
//        System.out.println(student);
//    }

    public void saveStudentWithGuardian(){
        Guardian guardian = Guardian.builder() // it build guardian entity
                .Name("Haji")
                .Email("haj@gmail.com")
                .Mobile("0722222222")
                .build();

        Student student = Student.builder() // it build student entity
                .firstName("Jamal")
                .lastName("Kaka")
                .emailId("jamal@gmail.com")
//                .guardian(guardian) // add them together
                .build();

        repo.save(student); // save for CRUD
    }

    public List<Student> printAllStudent(){
        return repo.findAll();
    }

    public Student printbyId(int stdId){
        return repo.findById(stdId).orElse(new Student());
    }

    public List<Student> printByName(String name){
        return repo.findByFirstName(name);
    }

    public List<Student> printByfirstNameAndLastName(String firstName, String lastName){
        return repo.findByFirstNameAndLastName(firstName,lastName);
    }

    public Optional<Student> printByEmailId(String eId){
        return repo.findByEmailId(eId);
    }

    public void updateStudent(Student student){
        repo.save(student);
    }

    @Transactional
    public void updateStudentFirstNameById(int studentId, String firstName , String lastName) {
        repo.updateStudentFirstNameById(studentId, firstName, lastName);
    }
}

