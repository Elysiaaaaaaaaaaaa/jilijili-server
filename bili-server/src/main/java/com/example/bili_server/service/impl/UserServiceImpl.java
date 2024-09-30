package com.example.bili_server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bili_server.DTO.LoginRequest;
import com.example.bili_server.DTO.LoginResponse;
import com.example.bili_server.pojo.User;
import com.example.bili_server.mapper.UserMapper;
import com.example.bili_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        User user = userMapper.findByUserName(loginRequest.getUserName());
        if (user!=null){
            return new LoginResponse("Login Successful");
        }
        else {
            return new LoginResponse("Invalid Login");
        }
    }

    @Override
    public User getUser(String userName) {
        User oneUser = lambdaQuery().eq(User::getUserName, userName).one();
        return oneUser;
    }
}
