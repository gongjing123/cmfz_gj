package com.baizhi.controller;

import com.baizhi.entity.Menus;
import com.baizhi.service.MenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/menus")
public class MenusController {
    @Autowired
    private MenusService menusService;

    //----------查询
    @RequestMapping("/findAll")
    public @ResponseBody List<Menus> findAll(){
        List<Menus> menus = menusService.findAllmenus();
        return menus;
    }
}
