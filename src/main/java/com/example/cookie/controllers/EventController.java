package com.example.cookie.controllers;

import com.example.cookie.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@Controller
//public class EventController {
//    private final EventRepository eventDao;
//
//    public EventController(EventRepository eventDao) {
//        this.eventDao = eventDao;
//    }
//
//    @GetMapping("/events")
//    public String eventsHome(Model model) {
//        List<Event> events = eventDao.findAll();
//        model.addAttribute("events", events);
//        return "events/upcoming";
//    }
//
//    @GetMapping("/events/book")
//    public String book() {
//        return "events/book";
//    }
//
//    @GetMapping("/events/{id}")
//    public String postsView(@PathVariable long id, Model model) {
//        Event event = eventDao.findEventById(id);
//        model.addAttribute("event", event);
//        return "events/upcoming";
//    }
//
//    @GetMapping("/events/upcoming")
//    public String list() {
//        return "events/upcoming";
//    }
//}
