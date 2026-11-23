package com.example.PracticeDB.repository;

import com.example.PracticeDB.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

    Page<Course> findBycourseTitleContaining(String courseTitle, Pageable pageable);
}
