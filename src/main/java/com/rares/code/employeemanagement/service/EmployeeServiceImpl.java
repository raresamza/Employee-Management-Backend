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
        return employeeRepository.insert(mapper.toEmployeeCreate(employeeDTO));
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

    @Override
    public List<Employee> getAllEmployeesWithID() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeDTO getEmployeeByID(String id) {
        EmployeeDTO employeeDTO=mapper.toEmployeeDTO(employeeRepository.findById(id).get());

        return employeeDTO;
    }

    @Override
    public EmployeeDTO updateEmployee(String id, EmployeeDTO employeeDTO) {
        Employee employee=employeeRepository.findById(id).get();
        employee.setEmail(employeeDTO.getEmail());
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setLastName(employeeDTO.getLastName());
        employee.setWorkedHours(employeeDTO.getWorkedHours());
        employee.setRole(employeeDTO.getRole());
        employee.setDescription(employeeDTO.getDescription());
        System.out.println(employee+" employee in update function");
        employeeRepository.save(employee);
        return employeeDTO;
    }
}
