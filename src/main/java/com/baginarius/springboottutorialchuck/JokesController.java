package com.baginarius.springboottutorialchuck;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokeGetter jokeGetter;

    public JokesController(JokeGetter jokeGetter) {
        this.jokeGetter = jokeGetter;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeGetter.getJoke());
        return "chucknorris";
    }

}
