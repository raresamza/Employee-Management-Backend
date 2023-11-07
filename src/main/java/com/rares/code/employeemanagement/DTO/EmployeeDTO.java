package com.rares.code.employeemanagement.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {


    private String firstName;
    private String lastName;
    private String email;
    private int workedHours;
    public EmployeeDTO(String firstName, String lastName, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
