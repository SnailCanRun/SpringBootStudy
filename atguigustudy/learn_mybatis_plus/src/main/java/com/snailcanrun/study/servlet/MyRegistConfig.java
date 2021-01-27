package com.snailcanrun.study.servlet;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.logging.Filter;

/**
 * author:zhouyiqiu
 * createTime:2021/1/25 8:27
 */
@Configuration(proxyBeanMethods = true)
public class MyRegistConfig {

//    @Bean
//    public ServletRegistrationBean myServlet(){
//        MyServlet myServlet = new MyServlet();
//        return new ServletRegistrationBean(myServlet,"/my","/css/*");
//    }
//
//    @Bean
//    public FilterRegistrationBean myFilter(){
//        MyFilter myFilter = new MyFilter();
////        //第一种用法
////        return new FilterRegistrationBean(myFilter,myServlet());
//
//        //第二种用法
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter);
//        filterRegistrationBean.setUrlPatterns(Arrays.asList("/my","/css/*"));
//        return filterRegistrationBean;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean myListener(){
//        MyServletContextListener myServletContextListener = new MyServletContextListener();
//        return new ServletListenerRegistrationBean(myServletContextListener);
//    }
}
