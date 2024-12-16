package com.example.utils;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimaryAnimal implements Animal {
    @Override
    public String getRace() {
        return "primary";
    }
}
