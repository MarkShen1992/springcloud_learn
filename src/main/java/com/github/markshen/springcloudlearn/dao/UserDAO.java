package com.github.markshen.springcloudlearn.dao;

import com.github.markshen.springcloudlearn.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {

    UserEntity getUserById(@Param("id") Long id);
}
