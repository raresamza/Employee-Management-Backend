package com.rares.code.employeemanagement.controller;

import com.rares.code.employeemanagement.DTO.DepartmentDTO;
import com.rares.code.employeemanagement.collection.Department;
import com.rares.code.employeemanagement.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(originPatterns = {"http://localhost:5173"})
@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/add")
    public Department addDepartment(@RequestBody DepartmentDTO departmentDTO ) {
        return departmentService.addDepartment(departmentDTO);
    }

    @GetMapping
    public List<DepartmentDTO> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
