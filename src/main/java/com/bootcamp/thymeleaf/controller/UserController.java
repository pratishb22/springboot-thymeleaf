package com.bootcamp.thymeleaf.controller;

import com.bootcamp.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanchit on 14/10/18
 */
@RequestMapping("/")
@Controller
public class UserController {

    @GetMapping("users")
    public String empList(Model model) {
        List<User> users = populateUsers();
        model.addAttribute("users", users);
        return "usersPage";
    }

    private List<User> populateUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.setAdmin(true).setId(1).setName("Pratish").setSalary(100).setSex("M");
        user2.setAdmin(false).setId(2).setName("Neha").setSalary(200).setSex("F");
        user3.setAdmin(false).setId(3).setName("Sahil").setSalary(300).setSex("M");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @GetMapping("list/users")
    @ResponseBody
    public List<User> getUsers() {
        return populateUsers();
    }
}
