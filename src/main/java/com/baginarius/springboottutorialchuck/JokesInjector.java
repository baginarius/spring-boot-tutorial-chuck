package com.baginarius.springboottutorialchuck;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JokesInjector {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }

}
