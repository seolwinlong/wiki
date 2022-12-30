package com.cscec1bne.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello world,"+name;
    }
}
