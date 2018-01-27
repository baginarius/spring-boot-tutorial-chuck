package com.baginarius.springboottutorialchuck;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeGetterImpl implements JokeGetter {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeGetterImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
