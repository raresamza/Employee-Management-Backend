package com.rares.code.employeemanagement.collection;

import com.rares.code.employeemanagement.DTO.EmployeeDTO;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "employees")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;

public Employee(String firstName,String lastName,String email) {
    this.firstName=firstName;
    this.lastName=lastName;
    this.email=email;
}

}


