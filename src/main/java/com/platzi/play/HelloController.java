package com.platzi.play;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final PlatziPlayAIService iaService;

    public HelloController(PlatziPlayAIService iaService) {
        this.iaService = iaService;
    }

    @GetMapping("/")
    public String hello(){
        return this.iaService.generateGreeting();
    }
}
