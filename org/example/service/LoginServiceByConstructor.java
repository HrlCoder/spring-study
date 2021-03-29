package org.example.service;

import org.example.dao.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceByConstructor {

    private LoginRepository loginRepository;

    @Autowired
    public LoginServiceByConstructor(LoginRepository loginRepository){
        System.out.printf("LoginServiceByConstructor: %s%n", loginRepository);
        this.loginRepository = loginRepository;
    }
}
