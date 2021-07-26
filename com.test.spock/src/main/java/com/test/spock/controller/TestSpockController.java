package com.test.spock.controller;

import com.test.spock.entity.User;
import com.test.spock.Service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpockController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("get-user")
    public User getuser(String age) {
        return userService.getUserByAge(age);
    }
}
