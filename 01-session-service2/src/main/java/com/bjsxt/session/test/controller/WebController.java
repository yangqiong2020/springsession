package com.bjsxt.session.test.controller;

import com.bjsxt.session.test.domain.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/service2")
public class WebController {

    @RequestMapping("/getMsg")
    public String getMsg(HttpSession session){
        String msg = (String) session.getAttribute("msg");
        return msg;
    }

    /**
     * 获取HttpSession中的Users对象
     */
    @RequestMapping("/getUsers")
    public Users getUsers(HttpSession session){
        Users users = (Users) session.getAttribute("u");
        return users;
    }
}
