package com.github.markshen.springcloudlearn.controller;

import com.github.markshen.springcloudlearn.entity.UserEntity;
import com.github.markshen.springcloudlearn.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("登录接口")
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户登录" ,  notes="用户登录")
    @GetMapping("/login")
    @ResponseBody
    public Object login(UserEntity userEntity) {
        return userService.getUserById(1L);
    }
}