package com.example.jwt_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.Scanner;

@RestController
@RequestMapping("/stateful")

public class Controller {
    @GetMapping("/create")
    public String create() {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = in.nextLine();
        System.out.println(name);
        return "created new data";

    }
    @GetMapping("/exist")
    public String exist() {
        return "existed data";
    }
    @GetMapping("/get")
    public String get() {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = in.nextLine();
        return "ready data"+name;
    }
}
