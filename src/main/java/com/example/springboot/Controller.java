package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public Controller() {
    }

    @GetMapping({"/"})
    public String index() {
        return "Hello World";
    }
}
