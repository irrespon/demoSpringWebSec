package com.example.demospringwebsec.repository;

import com.example.demospringwebsec.models.manytomany.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
