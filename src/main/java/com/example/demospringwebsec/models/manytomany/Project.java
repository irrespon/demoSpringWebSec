package com.example.demospringwebsec.models.manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Entity
public class Project {
    @Id
    private long id;

    @ManyToMany(mappedBy = "projects")
    Set<Employee> employees = new HashSet<>();

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
