package com.example.PracticeDB.service;

import com.example.PracticeDB.model.Course;
import com.example.PracticeDB.model.Teacher;
import com.example.PracticeDB.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class teacherService {
    @Autowired
    private TeacherRepo teacherRepo;

//    public void addTeacher(){
//
//        Course course1 = Course.builder()
//                .courseTitle("Software Engineering")
//                .courseCredit(8)
//
//                .build();
//        Course course2 = Course.builder()
//                .courseTitle("Database Fundamental")
//                .courseCredit(6)
//                .build();
//
//
//        Teacher teacher = Teacher.builder()
//                .teacherFirstName("Mubarak")
//                .teacherLastName("Shah")
////                .course(List.of(course1, course2)) // adding both course to one teacher | here I use oneToMany
//                .build();
//    }
}
