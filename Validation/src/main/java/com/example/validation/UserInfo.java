package com.example.validation;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data1")
public class UserInfo {
    User user;
    @PostMapping
    public String create(@RequestBody User user)
    {
        this.user=user;
        return "created a new user";
    }
}
