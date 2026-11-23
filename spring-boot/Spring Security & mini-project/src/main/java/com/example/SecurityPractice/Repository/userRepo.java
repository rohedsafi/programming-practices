package com.example.SecurityPractice.Repository;

import com.example.SecurityPractice.Model.Student;
import com.example.SecurityPractice.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepo extends JpaRepository<Users, Integer> {

   Optional<Users> findByUsername(String username);
}
