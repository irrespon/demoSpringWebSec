package com.example.demospringwebsec.repository;

import com.example.demospringwebsec.models.User_test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringWebRepository extends JpaRepository<User_test,Long> {

}
