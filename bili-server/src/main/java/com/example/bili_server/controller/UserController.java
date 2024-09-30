package com.example.bili_server.controller;

import com.example.bili_server.pojo.LoginRequest;
import com.example.bili_server.pojo.User;
import com.example.bili_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public String login(LoginRequest loginRequest){
        String userName = loginRequest.getUserName();
        String password = loginRequest.getPassword();
        return userService.login(loginRequest);
    }
    @GetMapping("/getUser")
    public User getUser(@RequestParam String userName){
        User user = userService.getUser(userName);
        return user;
    }
}
