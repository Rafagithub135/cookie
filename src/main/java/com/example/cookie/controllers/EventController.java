package com.example.cookie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {
    @GetMapping("/events/book")
    public String book() {
        return "events/book";
    }

    @GetMapping("/events/upcoming")
    public String list() {
        return "events/upcoming";
    }
}
