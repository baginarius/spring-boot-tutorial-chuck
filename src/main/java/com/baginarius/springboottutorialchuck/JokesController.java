package com.baginarius.springboottutorialchuck;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokesController {

    @RequestMapping("/")
    public String getJoke(){
        return "Nic śmiesznego";
    }
}
