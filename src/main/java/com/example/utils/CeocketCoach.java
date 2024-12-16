package com.example.utils;

import org.springframework.stereotype.Component;

@Component
public class CeocketCoach implements Coach {

    @Override
    public String getWorkout() {
        return "Practice";
    }
}
