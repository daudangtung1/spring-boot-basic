package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/demo")
    public String homepage() {
        int number = 1;
        return "index";
    }
}