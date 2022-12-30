package com.cscec1bne.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${test.hello:TEST}")
    private String test;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world"+test;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello world,"+name;
    }
}
