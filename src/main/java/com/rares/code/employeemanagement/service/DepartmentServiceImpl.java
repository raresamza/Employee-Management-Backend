package com.rares.code.employeemanagement.service;

import com.rares.code.employeemanagement.DTO.DepartmentDTO;
import com.rares.code.employeemanagement.collection.Department;
import com.rares.code.employeemanagement.repository.DepartmentRepository;
import com.rares.code.employeemanagement.utils.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {


    private final DepartmentRepository departmentRepository;

    private final Mapper mapper;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, Mapper mapper) {
        this.departmentRepository = departmentRepository;
        this.mapper = mapper;
    }

    @Override
    public Department addDepartment(DepartmentDTO departmentDTO) {
        return departmentRepository.insert(mapper.toDepartmentCreate(departmentDTO));
    }

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        return departmentRepository.findAll().stream().map(mapper::toDepartmentDTO).toList();
    }
}
