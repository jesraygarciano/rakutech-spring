package com.rakutech.rakutechapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @RequestMapping("/register")
    public String register() {

        System.out.println("Register to Rakutech");

        return "register.html";
    }
}
