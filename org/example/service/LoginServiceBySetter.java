package org.example.service;

import org.example.dao.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceBySetter {
    private LoginRepository loginRepository;

    public LoginRepository getLoginRepository() {
        return loginRepository;
    }

    @Autowired
    public void setLoginRepository(LoginRepository loginRepository) {
        System.out.printf("LoginServiceBySetter: loginRepository=%s%n", loginRepository);
        this.loginRepository = loginRepository;
    }
}
