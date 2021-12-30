package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAPi {

    @GetMapping("/")
    public String api(){
        return "Congrats!! You first api has been created";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello, Message received";
    }
}
