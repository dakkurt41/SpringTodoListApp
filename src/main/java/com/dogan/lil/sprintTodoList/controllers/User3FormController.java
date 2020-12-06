package com.dogan.lil.sprintTodoList.controllers;

import com.dogan.lil.sprintTodoList.models.User3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class User3FormController {
    @GetMapping("/user3Form")
    public String index() {
        return "redirect:/form";
    }

    @GetMapping("/form")
    public String formGet() {
        return "form";
    }

    @PostMapping("/form")
    public String formPost(User3 user, Model model) {
        model.addAttribute("user", user);
        return "formResult";
    }

}
