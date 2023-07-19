package iim.orangina.studentapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "students")
@NoArgsConstructor
public class Student {

    @Id
    @Generated
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String contract;
    private String jobs;
    private String year;
    private String activities;

}
