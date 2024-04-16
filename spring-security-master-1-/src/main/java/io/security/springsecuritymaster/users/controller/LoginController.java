package io.security.springsecuritymaster.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @GetMapping(value="/login")
    public String login() {
        return "login/login";
    }

    @GetMapping(value="/signup")
    public String signup() {
        return "login/signup";
    }
}
