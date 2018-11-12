package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserTest extends  BaseTest {


    @Autowired
    private UserService userService;

    @Test
    public  void  test1(){

        User user = userService.login("123", "123");
        System.out.println(user);

    }
    @Test
    public  void  test2(){
    }
}
