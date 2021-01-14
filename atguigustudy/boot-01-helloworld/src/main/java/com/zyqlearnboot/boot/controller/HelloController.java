package com.zyqlearnboot.boot.controller;

import com.zyqlearnboot.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private User user;

    @RequestMapping("/hello")
    public String HanderString(){
        return "Hello Spring Boot 2!";
    }

    @RequestMapping("/user")
    public User myUser(){
        return user;
    }
}
