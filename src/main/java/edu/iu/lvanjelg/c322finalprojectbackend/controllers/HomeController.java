package edu.iu.lvanjelg.c322finalprojectbackend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {

    @GetMapping("/")
    public String greeting() {
        return "Welcome to the database demo!";
    }
}
