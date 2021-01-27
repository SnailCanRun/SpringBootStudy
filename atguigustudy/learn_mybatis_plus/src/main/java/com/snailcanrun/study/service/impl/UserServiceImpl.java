package com.snailcanrun.study.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.snailcanrun.study.entity.User;
import com.snailcanrun.study.mapper.UserMapper;
import com.snailcanrun.study.service.UserService;
import org.springframework.stereotype.Service;

/**
 * author:zhouyiqiu
 * createTime:2021/1/20 15:14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
