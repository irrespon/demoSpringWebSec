package com.example.demospringwebsec.models;


import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "user_test")
public class User_test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(mappedBy = "user_test", cascade = CascadeType.ALL)
    // @JoinColumn(referencedColumnName = "id")
    private Role_test role_test;

    public void setRole_test(Role_test role_test) {
        this.role_test = role_test;
    }
}



