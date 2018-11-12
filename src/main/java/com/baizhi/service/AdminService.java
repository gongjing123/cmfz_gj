package com.baizhi.service;

import com.baizhi.entity.Admin;

public interface AdminService {
    //-----------登录----------------
    public Admin findOne(Admin admin);

    //---------查单个--------------
    public Admin findByID(String id);
    //----------修改密码-------------
    public void motify(String oldpassword,Admin admin);


}
