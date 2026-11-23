package com.example.PracticeDB.controller;

import com.example.PracticeDB.model.Course;
import com.example.PracticeDB.model.CourseMaterial;
import com.example.PracticeDB.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private courseService courseService;

    @PostMapping("/addCourse")
    public void add(){
        courseService.saveCourseData();
    }

    @PostMapping("/addCourseWithTeacher")
    public void addCourseWithTeacher(){
        courseService.addCourseWithTeacher();
    }

    @GetMapping("/PrintData")
    public List<CourseMaterial> getData(){
        return courseService.printAllStudent();
    }

    @GetMapping("/findPage")
    public List<Course> findPage(){
        return courseService.findPage();
    }

    @GetMapping("/findTotalElement")
    public int findTotalElement(){
        return courseService.findTotalElement();
    }

    @GetMapping("/findBySort")
    public List<Course> findBySort(){
        return courseService.findBySort();
    }

    @GetMapping("/findByTitleContaining")
    public List<Course> findByTitleContaining(){
        return courseService.findByTitleContaining();
    }

    @PostMapping("/addCourseWithStudent")
    public void addCourseWithStudent(){
        courseService.addCourseWithStudent();
    }

}
