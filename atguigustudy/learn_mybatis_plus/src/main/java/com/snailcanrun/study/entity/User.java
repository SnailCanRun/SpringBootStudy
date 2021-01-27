package com.snailcanrun.study.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * author:zhouyiqiu
 * createTime:2021/1/20 14:52
 */
@Data
public class User {
    @TableField(exist = false)
    private String username;
    @TableField(exist = false)
    private String password;

    private long id;
    private String name;
    private Integer age;
    private String email;
}
