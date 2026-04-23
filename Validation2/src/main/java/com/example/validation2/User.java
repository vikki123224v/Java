package com.example.validation2;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Getter @Setter @Data @AllArgsConstructor @NoArgsConstructor
public class User {
    @NotNull
    private String name;
    private String username;
    private String password;
    private String email;
    private int age;
    private String corporateEmail;
    private Double salary;
    private Double accountBalance;
    private LocalDate dob;
    private LocalDate userExpiry;
    private List<String> hobbies;

}
