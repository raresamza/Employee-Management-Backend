package com.rares.code.employeemanagement.service;

import com.rares.code.employeemanagement.DTO.EmployeeDTO;
import com.rares.code.employeemanagement.collection.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(EmployeeDTO employeeDTO);

    List<EmployeeDTO> getAllEmployees();

    boolean deleteEmployeeByID(String id);

    List<Employee> getAllEmployeesWithID();

    EmployeeDTO getEmployeeByID(String id);

    EmployeeDTO updateEmployee(String id, EmployeeDTO employeeDTO);
}
