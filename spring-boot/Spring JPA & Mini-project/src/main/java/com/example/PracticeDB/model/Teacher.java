package com.example.PracticeDB.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long teacherId;
    private String teacherFirstName;
    private String teacherLastName;

//    @OneToMany( // this is one way of relationship it is bit hard, we use bidirectional here
//            mappedBy = "teacher",
//            cascade = CascadeType.ALL
//    )
//    private List<Course> course;

}
