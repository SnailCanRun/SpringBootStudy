package com.snailcanrun.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.snailcanrun.mybatisx.entity.User;
import com.snailcanrun.mybatisx.mapper.UserMapper;
import com.snailcanrun.mybatisx.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
