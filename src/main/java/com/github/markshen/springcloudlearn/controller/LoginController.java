package com.github.markshen.springcloudlearn.controller;

import com.github.markshen.springcloudlearn.service.UserService;
import com.github.markshen.springcloudlearn.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Api("登录接口")
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "用户登录" ,  notes="用户登录")
    @GetMapping("/login")
    @ResponseBody
    public Response login(@RequestParam("username") String username, @RequestParam("passwd") String passwd) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, passwd);
        if (!ObjectUtils.isEmpty(subject) && !subject.isAuthenticated()) {
            subject.login(usernamePasswordToken);
        }
        return null;
    }
}