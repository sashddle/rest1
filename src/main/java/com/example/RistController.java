package com.example.rest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RistController {

    @GetMapping("/text")
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/num")
    public int number() {
        return 28;
    }
}