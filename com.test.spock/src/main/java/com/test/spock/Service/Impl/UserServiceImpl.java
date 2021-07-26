package com.test.spock.Service.Impl;

import com.test.spock.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    public User getUserByAge(String age) {
        if ("18".equals(age)) {
            return new User("yato", age);
        }
        else {
            return new User("marry", age);
        }
    }
}
