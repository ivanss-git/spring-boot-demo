package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello") 
    public String hello() { 
        return "Hello from Spring Boot!"; 
    }
    @GetMapping("/")      
    public String root()  { 
        return "OK"; 
    }
    @GetMapping("/test")  
    public String test()  { 
        return "This is only a test to see if I did it right."; 
    }
    @GetMapping("/favnum")
    public String favnum(){ 
        return "My favorite number is 10!"; 
    }
}
