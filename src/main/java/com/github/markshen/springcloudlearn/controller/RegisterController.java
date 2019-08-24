package com.github.markshen.springcloudlearn.controller;

import com.github.markshen.springcloudlearn.entity.UserEntity;
import com.github.markshen.springcloudlearn.utils.Response;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Api("注册接口")
@Controller
public class RegisterController {

    @GetMapping("/register")
    public String toRegister() {
        return "register";
    }

    @PostMapping("/register")
    @ResponseBody
    public Response register(@RequestBody @Valid UserEntity userEntity) {
        return null;
    }

    @GetMapping("/sendShortMessage")
    public Response sendShortMessage() {
        return null;
    }

    @GetMapping("/password/change")
    public String toPasswordChange(Model model) {
        return "password-change";
    }

    @PostMapping("/password/change")
    @ResponseBody
    public Response passwordChange() {
        return null;
    }
}
