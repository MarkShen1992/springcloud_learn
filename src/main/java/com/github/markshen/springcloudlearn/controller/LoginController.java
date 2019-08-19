package com.github.markshen.springcloudlearn.controller;

import com.github.markshen.springcloudlearn.entity.UserEntity;
import com.github.markshen.springcloudlearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    @ResponseBody
    public Object login(UserEntity userEntity) {
        return userService.getUserById(1L);
    }
}