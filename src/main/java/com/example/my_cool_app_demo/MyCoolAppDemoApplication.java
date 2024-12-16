package com.example.my_cool_app_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.example.my_cool_app_demo",
				"com.example.utils"}
)
public class MyCoolAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCoolAppDemoApplication.class, args);
	}


}
