package com.rares.code.employeemanagement.repository;

import com.rares.code.employeemanagement.collection.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department,String> {
}
