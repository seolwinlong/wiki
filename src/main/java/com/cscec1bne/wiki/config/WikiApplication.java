package com.cscec1bne.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cscec1bne")
@SpringBootApplication
@MapperScan("com.cscec1bne.wiki.mapper")
public class WikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikiApplication.class, args);
    }

}
