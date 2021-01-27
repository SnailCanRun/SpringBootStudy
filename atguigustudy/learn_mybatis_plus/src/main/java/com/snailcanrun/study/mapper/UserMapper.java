package com.snailcanrun.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.snailcanrun.study.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * author:zhouyiqiu
 * createTime:2021/1/20 14:54
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
