package com.mike.rns.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping("/index")
    public String getHomePage() {
        return "home_page";
    }
}
