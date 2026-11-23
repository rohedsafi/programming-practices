package com.example.PracticeDB.service;
import com.example.PracticeDB.model.Course;
import com.example.PracticeDB.model.CourseMaterial;
import com.example.PracticeDB.model.Student;
import com.example.PracticeDB.model.Teacher;
import com.example.PracticeDB.repository.CourseMaterialRepo;
import com.example.PracticeDB.repository.CourseRepo;
import com.example.PracticeDB.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountedCompleter;

@Service
public class courseService {

    @Autowired
    private CourseMaterialRepo MaterialRepo;

    @Autowired
    private CourseRepo courseRepo;

    public void saveCourseData(){
        Course course = Course.builder()
                .courseTitle("Mathematics")
                .courseCredit(6)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .courseURL("www.GeekForGeeks.com")
                .course(course)
                .build();

        MaterialRepo.save(courseMaterial);
    }

        public void addCourseWithTeacher() {

           Teacher teacher = Teacher.builder()
                   .teacherFirstName("Muqadar")
                   .teacherLastName("Niazi")
                    //.course(List.of(course1, course2)) // adding both course to one teacher | here I use oneToMany
                    .build();

            Course course1 = Course.builder()
                    .courseTitle("Mathematics")
                    .courseCredit(4)
                    .teacher(teacher)
                    .build();

            Course course2 = Course.builder()
                    .courseTitle("DSA")
                    .courseCredit(6)
                    .teacher(teacher)
                    .build();

            courseRepo.save(course2);
        }

    public List<CourseMaterial> printAllStudent(){
        return MaterialRepo.findAll();
    }

    public List<Course> findPage(){
        Pageable firstPageTwoRecord = PageRequest.of(0, 3);
        int numberOfElements = courseRepo.findAll(firstPageTwoRecord).getNumberOfElements();
        return  courseRepo.findAll(firstPageTwoRecord).getContent();
    }

    public int findTotalElement(){
        Pageable firstPageTwoRecord = PageRequest.of(0, 3);
        return (int) courseRepo.findAll(firstPageTwoRecord).getTotalElements();
    }


    public List<Course> findBySort(){
        Pageable sortByTitle = PageRequest.of(
                0 ,
                3 ,
                Sort.by("courseTitle").descending()
        );

        return courseRepo.findAll(sortByTitle).getContent();
    }

    public List<Course> findByTitleContaining(){
        Pageable firstPageThree = PageRequest.of(0 , 3);
        return courseRepo.findBycourseTitleContaining("D" , firstPageThree).getContent();
    }


    public void addCourseWithStudent() {
        Teacher teacher = Teacher.builder()
                .teacherFirstName("Jone")
                .teacherLastName("Morgan")
                .build();

        Student student = Student.builder() // it build student entity
                .firstName("Samer")
                .lastName("Ali")
                .emailId("samer@gmail.com")
                .build();

        Course course = Course.builder()
                .courseTitle("Islamic Education")
                .courseCredit(2)
                .teacher(teacher)
                .build();

        course.addStudent(student);

        courseRepo.save(course);
    }





}
