package com.kunt.dubbo.service.impl;

import com.kunt.dubbo.model.User;
import com.kunt.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id, String username) {
        User user = new User();
        user.setId(id);
        user.setUsername(username+"-1");
        return user;
    }
}
