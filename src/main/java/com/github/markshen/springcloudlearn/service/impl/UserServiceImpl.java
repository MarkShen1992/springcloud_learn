package com.github.markshen.springcloudlearn.service.impl;

import com.github.markshen.springcloudlearn.dao.UserDAO;
import com.github.markshen.springcloudlearn.entity.UserEntity;
import com.github.markshen.springcloudlearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserEntity getUserById(Long id) {
        return userDAO.getUserById(id);
    }
}
