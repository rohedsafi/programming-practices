package com.example.PracticeDB.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseMaterialId;
    private String courseURL;

    @OneToOne(
     // In Spring Data JPA, cascading is a mechanism that automatically propagates database operations(like saving, updating, or deleting) from a parent entity to its related child entity.// Without cascading configured on a @OneToOne relationship,// you must manually save, update, or delete both entities individually// in your code to avoid database errors.
//            cascade = CascadeType.ALL, // When you link two entities together in a @OneToOne mapping (for example, a User and their Passport), they are distinct rows in separate database tables. If you try to save a new User object containing a new Passport object without cascading, Hibernate will throw a TransientObjectException because the database does not know what to do with the unsaved passport.

            //When you query a parent entity (like a User), JPA needs to know whether it should immediately run a SQL JOIN to bring in the related Passport data, or wait until you explicitly ask for it in your Java code.
          fetch = FetchType.LAZY   // fetching determines when the related child entity is loaded from the database into memory alongside the parent entity.
    )
    @JoinColumn(
            name = "course_id", // giving name to column in CourseMaterial table. which is foreign key
            referencedColumnName = "courseId" // this line is referred to courseId property in Course class
    )
    private Course course;
}
