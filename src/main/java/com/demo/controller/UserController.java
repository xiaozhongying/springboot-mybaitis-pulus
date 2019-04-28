package com.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("findAll")
    public List<User> findAll(){
        System.out.println(111);
        return service.findAll();
    }
    @RequestMapping("findPage")
    public IPage<User> findPage(){
        return service.findPage();
    }
    @RequestMapping("addUser")
    public void addUser(User user){
        service.addUser(user);
    }
}
