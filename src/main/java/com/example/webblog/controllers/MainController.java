package com.example.webblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class MainController {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title","Главная страница");
        return "home";//вызываем шаблон хоум
    }
    @GetMapping("/about")
    public String about( Model model) {
        model.addAttribute("title","Cтраница о нас");
        return "about";//вызываем шаблон хоум
    }

}

