package com.bjsxt.mongo.controller;

import com.bjsxt.mongo.domain.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/service1")
public class WebController {

    /**
     * 将数据存放到HttpSession中
     */
    @RequestMapping("/setMsg")
    public String getMsg(HttpSession session,String msg){
        session.setAttribute("msg",msg);
        return "ok";
    }

    /**
     * 获取数据封装Users
     */
    @RequestMapping("/setUsers")
    public String setUsers(HttpSession session, Users users){
        session.setAttribute("users",users);
        return "ok";
    }
}
