package com.brainscience.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.brainscience.domain.User;
import com.brainscience.service.UserService;

/**
 * @program: BrainScienceResearch1
 * @description: 用户Service实现类
 * @author: renhai
 * @Date ：2022/1/29 21:29
 **/
public class UserServiceImpl implements UserService {

    @Override
    public int login(String userEmail, String password) {

        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        return 0;
    }
}
