package com.example.my_cool_app_demo.rest;

import com.example.utils.Animal;
import com.example.utils.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Animal anotherPrimaryAnimal;
    private Coach coach;
    private Animal houseAnimal;
    private Animal wildAnimal;
    private Animal primaryAnimal;

    @Autowired
    DemoController(Coach coach, Animal animal) {
        this.coach = coach;
        this.primaryAnimal = animal;
        this.anotherPrimaryAnimal = animal;
    }

    @Autowired
    private void setWildAnimal(@Qualifier("wildAnimal") Animal animal) {
        this.wildAnimal = animal;
    }

    @Autowired
    private void setHouseAnimal(@Qualifier("houseAnimal") Animal animal) {
        this.houseAnimal = animal;
    }

    @GetMapping("/work")
    public String getWorkout() {
        return this.coach.getWorkout();
    }

    @GetMapping("/wild")
    public String getWildAnimalRace() {
        return this.wildAnimal.getRace();
    }

    @GetMapping("/house")
    public String getHouseAnimalRace() {
        return this.houseAnimal.getRace();
    }

    @GetMapping("/primary")
    public String getPrimaryAnimalRace() {
        return primaryAnimal.getRace();
    }

    @GetMapping("/check")
    public String checkScope() {
        return "primaryAnimal vs anotherPrimaryAnimal: " + (primaryAnimal == anotherPrimaryAnimal);
    }
}
