package com.example.cookie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String postsHome() {
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postsView() {
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postsForm() {
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost() {
        return "redirect:/posts";
    }
}
