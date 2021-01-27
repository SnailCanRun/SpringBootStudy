package com.snailcanrun.study.controller;

import com.snailcanrun.study.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * author:zhouyiqiu
 * createTime:2021/1/20 15:28
 */
@Controller
public class IndexController {

    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUsername()) && StringUtils.hasLength(user.getPassword())){
            session.setAttribute("loginUser", user);
            return "redirect:main.html";
        } else {
            model.addAttribute("msg", "账号密码错误！");
            return "login";
        }
    }


    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
        if(session.getAttribute("loginUser") != null){
            return "main";
        }else {
            model.addAttribute("msg", "请重新登录！");
            return "login";
        }
    }
}
