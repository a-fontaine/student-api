package iim.orangina.studentapi.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String contract;
    private String jobs;
    private String experience;
    private String activities;

}
