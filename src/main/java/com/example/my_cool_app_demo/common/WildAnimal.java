package com.example.my_cool_app_demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class WildAnimal implements Animal {

    @PostConstruct
    public void doSomothinngOnStartup() {
        System.out.println("Startup initiated");
    }

    @PreDestroy
    public void doSomothinngOPreDestroy() {
        System.out.println("End up initiated");
    }

    @Override
    public String getRace() {
        return "tiger";
    }
}
