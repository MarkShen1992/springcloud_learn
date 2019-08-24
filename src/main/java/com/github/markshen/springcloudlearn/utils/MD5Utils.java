package com.github.markshen.springcloudlearn.utils;


import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * MD5加密类
 */
public class MD5Utils {

    /**
     * 加密密码
     * @param password
     * @return
     */
    public String encryptPassword(String password) {
        return Md5Hash.toString(password.getBytes());
    }
}
