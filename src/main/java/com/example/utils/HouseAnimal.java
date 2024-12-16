package com.example.utils;

import org.springframework.stereotype.Component;

@Component
public class HouseAnimal implements Animal {

    @Override
    public String getRace() {
        return "cat";
    }
}
