package com.example.PracticeDB.repository;

import com.example.PracticeDB.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface studentRepo extends JpaRepository<Student, Integer> {

    // this is  Native Query Name params Example
    @Query(value = "SELECT * FROM tbl_student s where s.first_name =:firstName", nativeQuery = true)
    public List<Student> findByFirstName(@Param("firstName") String firstName);


    public List<Student> findByFirstNameAndLastName(String firstName, String lastName);

    @Query("from Student where emailId=?1")
    public Optional<Student> findByEmailId(String emailId);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Student s SET s.firstName = :firstName, s.lastName =:lastName WHERE s.StudentId = :StudentId")
    void updateStudentFirstNameById(
            @Param("StudentId") int StudentId,
            @Param("firstName") String firstName,
            @Param("lastName") String lastName
    );



}
