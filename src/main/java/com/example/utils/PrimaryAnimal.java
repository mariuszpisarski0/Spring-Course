package com.example.utils;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PrimaryAnimal implements Animal {
    public PrimaryAnimal() {
        System.out.println("Consttucted: " + this.getClass().getSimpleName());
    }

    @Override
    public String getRace() {
        return "primary";
    }
}
