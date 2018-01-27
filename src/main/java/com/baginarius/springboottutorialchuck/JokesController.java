package com.baginarius.springboottutorialchuck;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesController(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        String randomQuote = chuckNorrisQuotes.getRandomQuote();
        model.addAttribute("joke", randomQuote);
        return "chucknorris";
    }

}
