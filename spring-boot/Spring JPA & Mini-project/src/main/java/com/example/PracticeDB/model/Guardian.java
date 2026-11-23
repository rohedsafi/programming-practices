package com.example.PracticeDB.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({ // these are annotations which is use for
        @AttributeOverride(
        name = "Name", // this is the attribute or variable name
        column = @Column(name = "guardian_name") // this give the name to database column
        ),
        @AttributeOverride(
                name = "Email",
                column = @Column(name = "guardian_Email")
        ),
        @AttributeOverride(
                name = "Mobile",
                column = @Column(name = "guardian_Mobile")
        )

})
public class Guardian {


    private String Name; // attribute or variable
    private String Email;
    private String Mobile;
}
