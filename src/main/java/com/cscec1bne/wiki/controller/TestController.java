package com.cscec1bne.wiki.controller;

import com.cscec1bne.wiki.domain.Test;
import com.cscec1bne.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
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

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
