package com.example.demospringwebsec.controllers;

import com.example.demospringwebsec.models.IAuthenticationFacade;
import com.example.demospringwebsec.models.manytomany.Employee;
import com.example.demospringwebsec.models.manytomany.Project;
import com.example.demospringwebsec.repository.EmployeeRepository;
import com.example.demospringwebsec.service.EmployeeServiceImpl;
import com.example.demospringwebsec.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final IAuthenticationFacade authenticationFacade;

    final
    UserServiceImpl userServiceimpl;
    final
    EmployeeServiceImpl employeeService;


    public MainController(IAuthenticationFacade authenticationFacade, UserServiceImpl userServiceimpl, EmployeeServiceImpl employeeService) {
        this.authenticationFacade = authenticationFacade;
        this.userServiceimpl = userServiceimpl;
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String mainPage() {
        Authentication authentication = authenticationFacade.getAuthentication();
        return "ok " + authentication.getName();
    }

    @GetMapping("/admin/")
    public String adminPage() {
        userServiceimpl.saveUser("user2", "role2");
        return "admin";
    }

    @GetMapping("/user/")
    public String userPage() {
        userServiceimpl.saveUser("user1", "role1");
        return "user";
    }

    @GetMapping("/many/")
    public String manyPage() {

        employeeService.save(new Employee("E"), new Project("P"));
        return "many";
    }

    @GetMapping("/delete/")
    public String deletePage() {


        return "delete";
    }
}
