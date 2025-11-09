package com.example.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("About.html")
    public String about() {
        // this returns the name of the view (about.html)
        return "About";
    }
}