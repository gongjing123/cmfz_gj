package com.baizhi.dao;

import com.baizhi.entity.Admin;

public interface AdminDAO {
    //--------登录----------------
    Admin queryOne(Admin admin);
    //---------查单个----------
    Admin queryById(String id);
    //--------修该密码----------
    void  update(Admin admin);
}
