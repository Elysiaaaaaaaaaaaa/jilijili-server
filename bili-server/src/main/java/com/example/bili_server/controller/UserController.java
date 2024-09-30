package com.example.bili_server.controller;

import com.example.bili_server.DTO.LoginRequest;
import com.example.bili_server.DTO.LoginResponse;
import com.example.bili_server.pojo.User;
import com.example.bili_server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        LoginResponse response = userService.login(loginRequest);
        if (response.getMessage().equals("Login Successful")){
            return ResponseEntity.ok(response);
        }else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }
    @GetMapping("/getUser")
    public User getUser(@RequestParam String userName){
        User user = userService.getUser(userName);
        return user;
    }
}
