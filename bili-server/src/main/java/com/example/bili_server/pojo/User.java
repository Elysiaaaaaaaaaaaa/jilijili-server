package com.example.bili_server.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user_info")
public class User {
    private Integer userId;

    private String userName;
    private String phone;
    private String password;
    private Date createTime;
}
