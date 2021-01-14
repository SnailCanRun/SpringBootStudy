package com.snailcanrun.mybatisx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("dynamic_table")
    public String dynamic_table(){
        return "";
    }
}
