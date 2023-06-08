package com.example.demospringwebsec.service;

import com.example.demospringwebsec.models.manytomany.Employee;
import com.example.demospringwebsec.models.manytomany.Project;
import com.example.demospringwebsec.repository.EmployeeRepository;
import com.example.demospringwebsec.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    final
    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public boolean save(Employee employees, Project projects) {

        Set<Project> projectSet = new HashSet<>();
        projectSet.add(projects);
        employees.setProjects(projectSet);
       employeeRepository.save(employees);

        return false;
    }
}
