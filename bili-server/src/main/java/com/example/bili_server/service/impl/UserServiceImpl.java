package com.example.bili_server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bili_server.pojo.LoginRequest;
import com.example.bili_server.pojo.User;
import com.example.bili_server.mapper.UserMapper;
import com.example.bili_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Override
    public String login(LoginRequest loginRequest) {
        String userName = loginRequest.getUserName();
        String password = loginRequest.getPassword();
        Integer userId = loginRequest.getUserId();
        User curUser = getById(userId);
        if (!userName.equals(curUser.getUserName())||!password.equals(curUser.getPassword())){
            return "false";
        }
        return "true";
    }

    @Override
    public User getUser(String userName) {
        User oneUser = lambdaQuery().eq(User::getUserName, userName).one();
        return oneUser;
    }
}
