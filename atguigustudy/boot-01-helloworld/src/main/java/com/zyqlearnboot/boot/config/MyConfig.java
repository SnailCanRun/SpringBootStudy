package com.zyqlearnboot.boot.config;

import com.zyqlearnboot.boot.bean.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(User.class)
public class MyConfig {

}
