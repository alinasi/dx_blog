package com.yulike.dm.web;

import com.yulike.dm.pojo.User;
import com.yulike.dm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Serializable;

@Controller
@RequestMapping("/index")
public class indexAction implements Serializable{

    @Autowired
    private UserService userService;

    @RequestMapping("/welcome")
    public String index(){
        User user = userService.getUserById(1L);
        System.out.println("user_name ===================== " + user.getUserName());
        return "index";
    }
}
