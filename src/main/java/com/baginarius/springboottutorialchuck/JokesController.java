package com.baginarius.springboottutorialchuck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
        System.out.println(env.getProperty("xxx"));
        model.addAttribute("joke", jokeGetter.getJoke());
        return "chucknorris";
    }

    @Autowired
    private Environment env;

}
