package com.github.markshen.springcloudlearn.service;

import com.github.markshen.springcloudlearn.entity.UserEntity;

public interface UserService {

    UserEntity getUserById(Long id);
}
