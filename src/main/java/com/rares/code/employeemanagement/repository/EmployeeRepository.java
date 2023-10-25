package com.rares.code.employeemanagement.repository;

import com.rares.code.employeemanagement.collection.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
