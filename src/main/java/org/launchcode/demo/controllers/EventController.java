package org.launchcode.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;


@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String getAllEvents(Model model) {
        ArrayList<String> events = new ArrayList<>();
        events.add("Birthdays");
        events.add("Christmas");
        events.add("Thanksgiving");
        model.addAttribute("events", events);

        return "events/index";
    }
}
