package com.bootcamp.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

}
