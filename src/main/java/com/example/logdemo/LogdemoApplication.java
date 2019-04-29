package com.example.logdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class LogdemoApplication extends SpringBootServletInitializer {

    //springboot war 包要继承LogdemoApplication 并 重写config方法

    public static void main(String[] args) {
        SpringApplication.run(LogdemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        System.out.println("dd");
        return builder.sources(LogdemoApplication.class);



    }

}
