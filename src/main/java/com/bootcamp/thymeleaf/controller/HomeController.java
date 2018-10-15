package com.bootcamp.thymeleaf.controller;

import com.bootcamp.thymeleaf.model.FormCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class HomeController {

    @GetMapping("sayHello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("js")
    public String js() {
        return "js";
    }

    @GetMapping("css")
    public String css() {
        return "css";
    }

    @GetMapping("common")
    public String commonTemplate() {
        return "sample";
    }

    @GetMapping("ajax")
    public String ajax() {
        return "ajax";
    }

    @GetMapping("enums")
    public String enums() {
        return "enums";
    }

    @GetMapping("registration")
    public String registration(Model model) {
        model.addAttribute("command", new FormCommand());
        return "registration";
    }

    @PostMapping("register")
    public String register(@ModelAttribute("command")FormCommand command, Model model) {
        System.out.println(command);
        return "redirect:/registration";
    }

}

