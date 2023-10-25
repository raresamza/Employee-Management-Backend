package com.rares.code.employeemanagement.service;


import com.rares.code.employeemanagement.DTO.EmployeeDTO;
import com.rares.code.employeemanagement.collection.Employee;
import com.rares.code.employeemanagement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import com.rares.code.employeemanagement.utils.Mapper;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final Mapper mapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, Mapper mappper) {
        this.employeeRepository = employeeRepository;
        this.mapper = mappper;
    }

    @Override
    public Employee addEmployee(EmployeeDTO employeeDTO) {
        System.out.println(employeeDTO);
        return employeeRepository.insert(mapper.toEmployee(employeeDTO));
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll().stream().map(mapper::toEmployeeDTO).toList();
    }

    @Override
    public boolean deleteEmployeeByID(String id) {
        Employee employee = employeeRepository.findById(id).get();
        employeeRepository.delete(employee);
        return true;
    }
}
