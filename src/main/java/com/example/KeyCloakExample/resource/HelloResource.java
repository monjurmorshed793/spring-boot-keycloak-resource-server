package com.example.KeyCloakExample.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class HelloResource {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from spring boot";
    }
}
