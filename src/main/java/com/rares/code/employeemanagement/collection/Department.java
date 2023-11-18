package com.rares.code.employeemanagement.collection;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "departments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Department {
    @Id
    private String id;
    private String name;
    private String code;
    private List<Employee> employees;



    public Department(String name,String code) {
        this.name=name;
        this.code=code;
        this.employees=new ArrayList<>();
    }

    public Department(String name, String code, List<Employee> employees) {
            this.name=name;
            this.code=code;
            this.employees=employees;
    }
}
