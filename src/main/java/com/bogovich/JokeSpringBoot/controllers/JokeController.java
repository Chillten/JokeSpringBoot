package com.bogovich.JokeSpringBoot.controllers;

import com.bogovich.JokeSpringBoot.services.JokeGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JokeController {

    private JokeGenerator jokeGenerator;

    public JokeController(JokeGenerator jokeGenerator) {
        this.jokeGenerator = jokeGenerator;
    }

    @RequestMapping(value = "/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeGenerator.getJoke());
        return "chucknorris";
    }
}
