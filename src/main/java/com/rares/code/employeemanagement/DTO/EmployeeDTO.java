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
}
