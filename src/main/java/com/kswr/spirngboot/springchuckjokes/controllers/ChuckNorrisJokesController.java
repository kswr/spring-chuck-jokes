package com.kswr.spirngboot.springchuckjokes.controllers;

import com.kswr.spirngboot.springchuckjokes.services.ChuckNorrisJokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChuckNorrisJokesController {

    private ChuckNorrisJokesService chuckNorrisJokesService;

    @Autowired
    public ChuckNorrisJokesController(ChuckNorrisJokesService chuckNorrisJokesService) {
        this.chuckNorrisJokesService = chuckNorrisJokesService;
    }

    @GetMapping({"/",""})
    public String getJoke() {
        return chuckNorrisJokesService.getJoke();
    }


}
