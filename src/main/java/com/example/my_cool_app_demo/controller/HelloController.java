package com.example.my_cool_app_demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teameName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return teameName + " " + coachName;
    }

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
