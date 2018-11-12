package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    //---------------注册----------------------
    @RequestMapping("/register")
    public void register(User user,String code){
        user.setPassword(DigestUtils.md5Hex(user.getPassword()+code));//MD5加密 密码
        user.setSalt(code);//设置颜值
        userService.register(user);

    }
    //-------------------登录---------------------------
    @RequestMapping("/login")
    public   String login(String name,String password,HttpSession session, String code){

        String validationCode = (String) session.getAttribute("validationCode");
        User user1 = userService.login(name,password);
        System.out.println(user1);
        if(validationCode.equals(code)) {
            if (user1 != null) {
                session.setAttribute("user", user1);
                return "redirect:/back/main/main.jsp";
            } else {
                return "/back/login";
            }
        }else {
            return "/back/login";
        }
    }
    //---------------修改---------------------
    @RequestMapping("/motify")
    public @ResponseBody  void motify(User user){
        userService.motify(user);
    }


}
