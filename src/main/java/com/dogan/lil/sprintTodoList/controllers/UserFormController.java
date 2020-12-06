package com.dogan.lil.sprintTodoList.controllers;
import com.dogan.lil.sprintTodoList.models.User2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserFormController {

    @RequestMapping("/indexForm")
    public String home() {
        System.out.println("Going home...");
        return "indexForm";
    }

    @RequestMapping("/register")
    public String showForm(Model model) {
        User2 user = new User2();
        List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");

        model.addAttribute("user", user);
        model.addAttribute("professionList", professionList);

        return "register";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User2 user) {

        System.out.println(user);

        return "register";
    }



}
