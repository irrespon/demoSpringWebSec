package com.example.demospringwebsec.controllers;

import com.example.demospringwebsec.models.IAuthenticationFacade;
import com.example.demospringwebsec.service.UserServiceImpl;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final IAuthenticationFacade authenticationFacade;

    final
    UserServiceImpl userServiceimpl;


    public MainController(IAuthenticationFacade authenticationFacade, UserServiceImpl userServiceimpl) {
        this.authenticationFacade = authenticationFacade;
        this.userServiceimpl = userServiceimpl;
    }

    @GetMapping("/")
    public String mainPage () {
        Authentication authentication = authenticationFacade.getAuthentication();
        return "ok " + authentication.getName();
    }

    @GetMapping("/admin/")
    public String adminPage () {
        userServiceimpl.saveUser("user2","role2");
        return "admin";
    }

    @GetMapping("/user/")
    public String userPage () {
       userServiceimpl.saveUser("user1","role1");
        return "user";
    }
//
//    @GetMapping("/delete/")
//    public String deletePage() {
//
//        userServiceimpl.delete()
//    }
}
