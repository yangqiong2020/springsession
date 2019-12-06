package com.bjsxt.mongo.controller;

import com.bjsxt.mongo.domain.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/service2")
public class WebController {

    /**
     * 获取HttpSession中的数据
     */
    @RequestMapping("/getMsg")
    public String getMsg(HttpSession session){
        String msg = (String) session.getAttribute("msg");
        return msg;
    }

    /**
     * 从HttpSession中获取Users
     */
    @RequestMapping("/getUsers")
    public Object getUsers(HttpSession session){
        Users users = (Users) session.getAttribute("users");
        return users;
    }
}
