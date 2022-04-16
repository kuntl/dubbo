package com.kunt.dubbo.service.impl;


import com.kunt.dubbo.model.User;
import com.kunt.dubbo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUsername("zhangsan");
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 52;
    }
}
