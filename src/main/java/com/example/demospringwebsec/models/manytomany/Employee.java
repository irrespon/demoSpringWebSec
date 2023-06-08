package com.example.demospringwebsec.models.manytomany;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    @ManyToMany(cascade = {CascadeType.ALL})
    Set<Project> projects = new HashSet<>();

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public long getId() {
        return id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }
}
