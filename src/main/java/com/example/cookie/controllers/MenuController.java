package com.example.cookie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    @GetMapping("/drinks")
    public String drinks() {
        return "menu/index";
    }
}
