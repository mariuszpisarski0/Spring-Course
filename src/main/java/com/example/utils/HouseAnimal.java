package com.example.utils;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class HouseAnimal implements Animal {

    public HouseAnimal() {
        System.out.println("Consttucted: " + this.getClass().getSimpleName());
    }

    @Override
    public String getRace() {
        return "cat";
    }
}
