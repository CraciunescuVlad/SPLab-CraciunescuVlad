package com.example.lab.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {

    @GetMapping
    public List<String> getAllBooks() {
        return List.of("Noapte buna, copii!", "Design Patterns - GoF");
    }

    @GetMapping("/count")
    public String getCount() {
        return "Total carti in sistem: 2";
    }
}