package com.kswr.spirngboot.springchuckjokes.services;

import com.kswr.spirngboot.springchuckjokes.interfaces.JokesService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesService implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokesService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
