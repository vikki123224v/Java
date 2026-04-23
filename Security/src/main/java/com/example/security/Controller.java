package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data2")
public class Controller {
    @GetMapping
    public String hello() {
        return "hello world!";
    }
    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
    @GetMapping("/java")
    public String java() {
        return "java";
    }
}
