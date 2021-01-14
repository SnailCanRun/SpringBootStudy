package com.zyqlearnboot.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController implements WebMvcConfigurer {

    @GetMapping("/user/{username}/age/{age}")
    public String getUser(@RequestHeader("host") String host,
                          @RequestHeader Map<String,String> headers,
                          @PathVariable("username") String name,
                          @PathVariable Map<String,String> pv,
                          @RequestParam("sex") String userSex,
                          @RequestParam("height") List heights,
                          @RequestParam Map<String,String> params){
        return "GET-张三";
    }

    @PostMapping("/user")
    public String saveUser(@RequestBody String content){
        return "POST-张三";
    }

    @PutMapping("/user")
    public String putUser(){
        return "PUT-张三";
    }

    @DeleteMapping("/user")
    public String deleteUser(){
        return "DELETE-张三";
    }

//    /**
//     * 开启SpringBoot的矩阵变量
//     * @return
//     */
//    @Bean
//    public WebMvcConfigurer webMvcConfigurer(){
//        return new WebMvcConfigurer() {
//            @Override
//            public void configurePathMatch(PathMatchConfigurer configurer) {
//                UrlPathHelper urlPathHelper = new UrlPathHelper();
//                urlPathHelper.setRemoveSemicolonContent(false);
//                configurer.setUrlPathHelper(urlPathHelper);
//            }
//        };
//    }

    /**
     * 开启SpringBoot的矩阵变量
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }
}
