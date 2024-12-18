package com.example.my_cool_app_demo.rest;

import com.example.my_cool_app_demo.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Animal animal;

    @Autowired
    public DemoController(@Qualifier("SeaAnimal") Animal animal) {
        this.animal = animal;
    }

    @GetMapping("/race")
    public String getAnimalRace() {
        return animal.getRace();
    }
}
