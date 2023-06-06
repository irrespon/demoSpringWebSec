package com.example.demospringwebsec.service;

import com.example.demospringwebsec.models.Role_test;
import com.example.demospringwebsec.models.User_test;
import com.example.demospringwebsec.repository.RoleSpringWebRepository;
import com.example.demospringwebsec.repository.UserSpringWebRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    final UserSpringWebRepository userSpringWebRepository;
    final RoleSpringWebRepository roleSpringWebRepository;

    final User_test userTest;
    final Role_test roleTest;

    public UserServiceImpl(UserSpringWebRepository userSpringWebRepository, RoleSpringWebRepository roleSpringWebRepository, User_test userTest, Role_test roleTest) {
        this.userSpringWebRepository = userSpringWebRepository;
        this.roleSpringWebRepository = roleSpringWebRepository;
        this.userTest = userTest;
        this.roleTest = roleTest;
    }

    @Override
    public boolean saveUser(String userName, String roleName) {
        userTest.setName(userName);
        roleTest.setName(roleName);
        roleTest.setUser_test(userTest);

        userSpringWebRepository.save(userTest);
        return true;
    }

    public boolean delete(User_test user_test) {
        userSpringWebRepository.delete(user_test);
        return true;
    }
}
