package com.bogovich.JokeSpringBoot.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class JokeChuckNorrisService implements JokeGenerator{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeChuckNorrisService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
