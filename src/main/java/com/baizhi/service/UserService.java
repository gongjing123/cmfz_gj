package com.baizhi.service;

import com.baizhi.entity.User;

public interface UserService {
    //--------注册--------------------
    void register(User user);
    //-------登录---------------
    User login(String username,String password);
    //--------修改-------------------
    void motify(User user);

}
