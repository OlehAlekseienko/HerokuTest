package com.example.herokutest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/hello")
    String sayHello(){
        return "<h2>hello from controller</h2>";
    }
}
