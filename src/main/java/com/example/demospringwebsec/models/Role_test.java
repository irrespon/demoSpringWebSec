package com.example.demospringwebsec.models;


import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "role_test")
public class Role_test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_test_id")
    private User_test user_test;

    public void setName(String name) {
        this.name = name;
    }

    public void setUser_test(User_test user_test) {
        this.user_test = user_test;
    }
}
