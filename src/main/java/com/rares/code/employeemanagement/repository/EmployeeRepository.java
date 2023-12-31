package com.rares.code.employeemanagement.repository;

import com.rares.code.employeemanagement.collection.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
