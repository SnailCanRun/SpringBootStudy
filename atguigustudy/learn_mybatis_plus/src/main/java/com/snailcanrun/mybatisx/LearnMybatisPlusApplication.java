package com.snailcanrun.mybatisx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.snailcanrun.mybatisx.mapper")
public class LearnMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnMybatisPlusApplication.class, args);
    }

}
