package com.example.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CeocketCoach implements Coach {
    public CeocketCoach() {
        System.out.println("Consttucted: " + this.getClass().getSimpleName());
    }

    @Override
    public String getWorkout() {
        return "Practice";
    }
}
