package com.bjsxt.session.test.controller;

import com.bjsxt.session.test.domain.Roles;
import com.bjsxt.session.test.domain.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("service1")
public class WebController {

    @RequestMapping("/setMsg")
    public String setMsg(HttpSession session,String msg){
        session.setAttribute("msg",msg);
        return "ok";
    }

    /**
     * 获取Users信息，保存到HttpSession中
     */
    @RequestMapping("/addUsers")
    public String addUsers(HttpSession session, Users users){
        Roles roles = new Roles();
        roles.setRoleid(1);
        roles.setRolename("管理员");
        users.setRoles(roles);
        session.setAttribute("u",users);
        return "ok";
    }
}
