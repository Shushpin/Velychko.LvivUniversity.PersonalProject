package com.calorie.calorie.tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/index")
    public String showRegPage() {
        return "index";
    }

    @GetMapping("/fscreen")
    public String showMenu() {
        return "fscreen";
    }

    @GetMapping("/faq")
    public String showFaqs() {
        return "faq";
    }

    @GetMapping("/app")
    public String showJs() {
        return "app";
    }
    @GetMapping("/calorie")
    public String showCalorie() {
        return "calorie";
    }
    @GetMapping("/main")
    public String showMain() {
        return "main";
    }
}
