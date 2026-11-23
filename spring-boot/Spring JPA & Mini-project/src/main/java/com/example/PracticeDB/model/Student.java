package com.example.PracticeDB.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
//        name = "tbl_student",
//        uniqueConstraints = @UniqueConstraint( // here we add unique constraint (null) to email attribute
//                name = "emailId_unique",
//                columnNames = "email_address"
//
//        )
)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StudentId;
    private String firstName;
    private String lastName;

//    @Column(
//            name = "email_address" ,
//            nullable = false // when we add this to attribute, it don't accept null value
//    )
    private String emailId;

//    @Embedded // here we embedded guardian to Student entity
//    Guardian guardian;


//    private String guardianName;
//    private String guardianEmail;
//    private String guardianMobile;


}
