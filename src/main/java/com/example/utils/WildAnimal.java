package com.example.utils;

import org.springframework.stereotype.Component;

@Component
public class WildAnimal implements Animal{
    @Override
    public String getRace() {
        return "tiger";
    }
}
