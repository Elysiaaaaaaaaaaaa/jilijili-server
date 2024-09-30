package com.example.bili_server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.bili_server.DTO.LoginRequest;
import com.example.bili_server.DTO.LoginResponse;
import com.example.bili_server.pojo.User;


public interface UserService extends IService<User> {
    public LoginResponse login(LoginRequest loginRequest);
    public User getUser(String userName);

}
