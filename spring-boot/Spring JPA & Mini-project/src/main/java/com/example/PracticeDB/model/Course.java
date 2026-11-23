package com.example.PracticeDB.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String courseTitle;
    private int courseCredit;

    @OneToOne(
            mappedBy = "course" // here I use Bidirectional
    )
    private CourseMaterial courseMaterial;


    @ManyToOne(
            cascade = CascadeType.ALL
    ) // this is another way of relationship it is simple rather then oneToMany
    @JoinColumn(name = "teacher_id", referencedColumnName = "teacherId")
    private Teacher teacher;

    @ManyToMany(
            cascade = { CascadeType.PERSIST , CascadeType.MERGE}
    )
    @JoinTable( // create third table for ManyToMany Mapping
            name = "student_course_map",  // here I give the name of table
            joinColumns = @JoinColumn(
                    name = "course_id",
                    referencedColumnName = "CourseId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "StudentId"
            )
    )
    private List<Student> students;

    public void addStudent(Student student){
        if (this.students == null){
            this.students = new ArrayList<>();
        }

        this.students.add(student);
    }
}
