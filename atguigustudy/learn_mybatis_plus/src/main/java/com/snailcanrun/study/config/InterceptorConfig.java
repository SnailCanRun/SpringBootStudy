package com.snailcanrun.study.config;

import com.snailcanrun.study.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * author:zhouyiqiu
 * createTime:2021/1/22 16:07
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")//拦截所有请求（包括静态资源（css等)）
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");//不需要拦截的请求
    }
}
