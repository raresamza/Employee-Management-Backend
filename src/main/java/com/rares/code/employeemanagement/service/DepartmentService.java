package com.rares.code.employeemanagement.service;

import com.rares.code.employeemanagement.DTO.DepartmentDTO;
import com.rares.code.employeemanagement.collection.Department;

import java.util.List;

public interface DepartmentService {
    Department addDepartment(DepartmentDTO departmentDTO);

    List<DepartmentDTO> getAllDepartments();
}
