package com.example.PracticeDB.repository;

import com.example.PracticeDB.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher , Long> {
}
