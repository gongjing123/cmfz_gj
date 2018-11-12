package com.baizhi.service;

import com.baizhi.dao.MenusDAO;
import com.baizhi.entity.Menus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MenusServiceImpl implements MenusService {
    @Autowired
    private MenusDAO menusDAO;
    @Override
    public List<Menus> findAllmenus() {

        List<Menus> menus = menusDAO.queryAll();
        return menus;
    }
}
