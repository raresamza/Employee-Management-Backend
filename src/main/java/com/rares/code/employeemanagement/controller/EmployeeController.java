package com.rares.code.employeemanagement.controller;


import com.rares.code.employeemanagement.DTO.EmployeeDTO;
import com.rares.code.employeemanagement.collection.Employee;
import com.rares.code.employeemanagement.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@CrossOrigin(originPatterns = {"http://localhost:5173"})
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/add")
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/with")
    public List<Employee> getAllEmployeesWithID() {
        return employeeService.getAllEmployeesWithID();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployeeByID(@PathVariable String id) {
        boolean deleted=false;
        employeeService.deleteEmployeeByID(id);
        Map<String,Boolean> response=new HashMap<>();
        response.put("deleted",deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployeeByID(@PathVariable String id) {
        EmployeeDTO employee=null;
        employee=employeeService.getEmployeeByID(id);
        return ResponseEntity.ok(employee);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable String id,@RequestBody EmployeeDTO employeeDTO) {
        employeeDTO = employeeService.updateEmployee(id,employeeDTO);
        System.out.println(employeeDTO+"employeeDTO");
        return ResponseEntity.ok(employeeDTO);
    }
}
