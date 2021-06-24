package com.rakutech.rakutechapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String index(Model model) {
        model.addAttribute("Message","Register");
        return "Register here";
    }
}
