package com.bogovich.JokeSpringBoot;

import com.bogovich.JokeSpringBoot.controllers.JokeController;
import com.bogovich.JokeSpringBoot.services.JokeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokeSpringBootApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(JokeSpringBootApplication.class, args);
    }
}
