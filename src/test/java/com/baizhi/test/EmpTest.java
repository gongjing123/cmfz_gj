package com.baizhi.test;


import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpTest extends BaseTest{

    @Autowired
    private AdminService adminService;


    @Test
    public void testFind(){
        Admin admin=new Admin("1","张三","1234");
        Admin admin1 = adminService.findOne(admin);
        System.out.println(admin1);
    }


}
