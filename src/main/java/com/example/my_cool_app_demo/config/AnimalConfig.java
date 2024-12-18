package com.example.my_cool_app_demo.config;

import com.example.my_cool_app_demo.common.Animal;
import com.example.my_cool_app_demo.common.SeaAnimal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {
    @Bean("SeaAnimal")
    public Animal setAnimal() {
        return new SeaAnimal();
    }
}
