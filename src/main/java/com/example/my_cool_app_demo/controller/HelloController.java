package com.example.my_cool_app_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return "woukout";
    }

    @GetMapping("/sss")
    public String getsss() {
        return "ssaaaa";
    }
}
