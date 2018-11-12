package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
//-------------------登录---------------------------
    @RequestMapping("/login")
    public   String login(Admin admin, HttpServletRequest request, HttpServletResponse response,String code){
        HttpSession session = request.getSession();
        String validationCode = (String) session.getAttribute("validationCode");
        Admin admin1 = adminService.findOne(admin);
        System.out.println(admin1);
        if(validationCode.equals(code)) {
            if (admin1 != null) {
                session.setAttribute("admin", admin1);
                return "redirect:/back/main/main.jsp";
            } else {
                return "/back/login";
            }
        }else {
            return "/back/login";
        }
    }

    @RequestMapping("update")
//-----------------修改管理员密码------------------------
    public void update(Admin admin, String oldpassword){


        adminService.motify(oldpassword,admin);

    }
    //-------------退出系统----------------------
    @RequestMapping("/out")
    public  String out(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        session.removeAttribute("admin");
        return "/back/login";
    }




}
