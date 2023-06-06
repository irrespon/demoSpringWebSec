package com.example.demospringwebsec.service;

import com.example.demospringwebsec.models.manytomany.Employee;
import com.example.demospringwebsec.models.manytomany.Project;

import java.util.Set;

public interface EmployeeService {
    public boolean save1(Set<Employee> employees, Set<Project> projects);
}
