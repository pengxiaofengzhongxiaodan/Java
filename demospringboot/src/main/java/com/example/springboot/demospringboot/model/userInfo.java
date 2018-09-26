package com.example.springboot.demospringboot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class userInfo {

    public String getUserName() {
        return userName;
    }

    @Value("${userinfo.username}")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    private  String userName;
}