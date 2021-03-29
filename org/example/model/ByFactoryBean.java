package org.example.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.FactoryBean;

@Component
public class ByFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("abc");
        user.setPassword("123");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
