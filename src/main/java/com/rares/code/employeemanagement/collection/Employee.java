package com.rares.code.employeemanagement.collection;

import com.rares.code.employeemanagement.DTO.EmployeeDTO;
import com.rares.code.employeemanagement.utils.Role;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private int workedHours=0;
    private Role role=Role.N_A;
    private String description="";

    public Employee(String firstName, String lastName, String email, int workedHours)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.workedHours = workedHours;
    }

    public Employee(String firstName, String lastName, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}


