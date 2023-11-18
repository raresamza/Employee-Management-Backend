package com.rares.code.employeemanagement.DTO;

import com.rares.code.employeemanagement.collection.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    private String name;
    private String code;
    private List<Employee> employees;
}
