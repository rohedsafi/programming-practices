package com.example.PracticeDB.repository;

import com.example.PracticeDB.model.Course;
import com.example.PracticeDB.model.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseMaterialRepoTest {

    @Autowired
   private CourseMaterialRepo repo;

    @Test
    public void saveCourseData(){
        Course course = Course.builder()
                .courseTitle("Mathematics")
                .courseCredit(6)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .courseURL("www.GeekForGeeks.com")
                .course(course)
                .build();

       repo.save(courseMaterial);
    }
    @Test
    public void getcourseMaterial(){
        List<CourseMaterial> materials = repo.findAll();
        System.out.println(materials);
    }

}