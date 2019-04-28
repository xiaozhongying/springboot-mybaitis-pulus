package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @RequestMapping("/hello")
    public String hello(){
        int a =1;
        return "hello11";

    }
}
