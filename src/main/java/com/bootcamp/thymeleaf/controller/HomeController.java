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

}
