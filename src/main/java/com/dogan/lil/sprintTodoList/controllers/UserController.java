package com.dogan.lil.sprintTodoList.controllers;

import com.dogan.lil.sprintTodoList.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/addUser")
    public String sendForm(User user){
        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(User user) {

        return "showAddUser";
    }


}
