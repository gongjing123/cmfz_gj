package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;
    //---------------注册----------------------
    @Override
    public void register(User user) {
        userDAO.insert(user);
    }
//-----------------------登录----------------
    @Override
    public User login( String username, String password) {

        User user = userDAO.query(username, password);
        return user;
    }
//----------------------修改------------------
    @Override
    public void motify(User user) {
        userDAO.update(user);
    }
}
