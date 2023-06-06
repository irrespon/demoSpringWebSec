package com.example.demospringwebsec.models.manytomany;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@Entity
public class Employee {

    @Id
    private long id;

    @ManyToMany(cascade = {CascadeType.ALL})
    Set<Project> projects = new HashSet<>();

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
