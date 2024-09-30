package com.example.bili_server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bili_server.pojo.LoginRequest;
import com.example.bili_server.pojo.User;

import java.util.List;


public interface UserService extends IService<User> {
    public String login(LoginRequest loginRequest);
    public User getUser(String userName);

}
