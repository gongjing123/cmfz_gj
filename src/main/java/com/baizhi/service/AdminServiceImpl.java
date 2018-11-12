package com.baizhi.service;

import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDAO adminDAO;
    @Override
    public Admin findOne(Admin admin) {

        Admin admin1 = adminDAO.queryOne(admin);
        return admin1;

    }

    @Override
    public Admin findByID(String id) {
        Admin admin = adminDAO.queryById(id);
        return admin;
    }


    @Override
    public void motify(String oldpassword,Admin admin) {
        System.out.println(oldpassword);
        System.out.println(admin);


        Admin oldAdmin = adminDAO.queryById(admin.getId());
        System.out.println("oldAdmin"+oldAdmin);
        if(oldAdmin.getPassword().equals(oldpassword)){
            adminDAO.update(admin);
        }else{
            throw new RuntimeException("密码错误");
        }

    }
}
