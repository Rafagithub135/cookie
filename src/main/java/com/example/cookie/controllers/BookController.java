package com.example.cookie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @GetMapping("/book")
    public String book() {
        return "book/index";
    }
}
