package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.entity.User;
import com.demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yipingwei
 * @describe
 * @Date 2023/3/17 10:53
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;



    @Override
    public User getOne() {
        return userMapper.getOne();
    }
}
