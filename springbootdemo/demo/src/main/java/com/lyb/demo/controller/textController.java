package com.lyb.demo.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class textController {
    @GetMapping(value = "/")
    public String login(){
        return "index";
    }
    @PostMapping(value = "/login")
    public String login1(@RequestParam("userName") String username,@RequestParam("password") String password){
        if(username.equals(password)){
            return "登录成功";
        }else
            return "登录失败";
    }
    @GetMapping(value = "/login1")
    public String login1(){
        return "welcome";
    }
}
