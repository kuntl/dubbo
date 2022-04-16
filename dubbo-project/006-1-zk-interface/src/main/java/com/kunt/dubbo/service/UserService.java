package com.kunt.dubbo.service;

import com.kunt.dubbo.model.User;

public interface UserService {
    User queryUserById(Integer id,String username);
}
