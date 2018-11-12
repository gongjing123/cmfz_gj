package com.baizhi.test;

import com.baizhi.service.MenusService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MenusTest extends  BaseTest {


    @Autowired
    private MenusService menusService;

    @Test
    public  void  test1(){

        menusService.findAllmenus();


    }
}
