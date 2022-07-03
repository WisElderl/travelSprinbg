package com.example.travelspringapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping()
    public ResponseEntity getUser(){

        try {
            return ResponseEntity.ok("okay");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("ошибка");
        }
    }
}
