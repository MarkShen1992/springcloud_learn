package com.github.markshen.springcloudlearn.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

    private Long id;

    @NotEmpty
    private String username;

    @NotEmpty
    private String passwd;

    @NotEmpty
    private String realName;

    @NotEmpty
    private String phone;

    @NotEmpty
    private String email;

    private String createTime;

    private String createUser;

    private String updateTime;

    private String updateUser;

    private Integer deleted;
}