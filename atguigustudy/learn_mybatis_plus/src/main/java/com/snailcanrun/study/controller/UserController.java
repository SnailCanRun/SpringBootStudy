package com.snailcanrun.study.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.snailcanrun.study.entity.User;
import com.snailcanrun.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * author:zhouyiqiu
 * createTime:2021/1/20 14:52
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<User> getUser(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        List<User> list = userService.list();

        Page<User> userPage = new Page<>(pn, 5);
        Page<User> page = userService.page(userPage, null);

        model.addAttribute("page",page);

        return list;
    }
}
