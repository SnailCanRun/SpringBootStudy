package com.zyqlearnboot.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@ConfigurationProperties(prefix = "myuser")
public class User {
    private String name;
    private Integer age;
}
