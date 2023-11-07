package com.rares.code.employeemanagement.utils;

import com.rares.code.employeemanagement.DTO.EmployeeDTO;
import com.rares.code.employeemanagement.collection.Employee;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    public Employee toEmployee(EmployeeDTO employeeDTO) {
        return new Employee(employeeDTO.getFirstName(), employeeDTO.getLastName(), employeeDTO.getEmail(),employeeDTO.getWorkedHours());
    }

    public EmployeeDTO toEmployeeDTO(Employee employee) {
        return new EmployeeDTO(employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.getWorkedHours());
    }

    public EmployeeDTO toEmployeeDTOCreate(Employee employee) {
        return new EmployeeDTO(employee.getFirstName(), employee.getLastName(), employee.getEmail());
    }

    public Employee toEmployeeCreate(EmployeeDTO employeeDTO) {
        return new Employee(employeeDTO.getFirstName(), employeeDTO.getLastName(), employeeDTO.getEmail());
    }
}