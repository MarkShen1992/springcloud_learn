package com.github.markshen.springcloudlearn.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

    private Long id;

    private String username;

    private String passwd;

    private String realName;

    private String phone;

    private String email;

    private String createTime;

    private String createUser;

    private String updateTime;

    private String updateUser;

    private Integer deleted;
}