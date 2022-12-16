package com.codestate.todoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application !";
    }
}
