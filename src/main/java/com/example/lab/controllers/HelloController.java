package com.example.lab.controllers;

import com.example.lab.difexample.ClientComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ClientComponent clientComponent;

    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World from Client Component = " + clientComponent;
    }

    @GetMapping("/test/text")
    public String testtext(){
        return "Acesta este un text pentru a testa o teorie personala";
    }

    @GetMapping("/lab4/test")
    public String lab4Test(){
        return "Hai sa rezolvam laboratorul 4";
    }
}