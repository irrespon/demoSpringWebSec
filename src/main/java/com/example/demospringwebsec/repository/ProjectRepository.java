package com.example.demospringwebsec.repository;

import com.example.demospringwebsec.models.manytomany.Employee;
import com.example.demospringwebsec.models.manytomany.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
