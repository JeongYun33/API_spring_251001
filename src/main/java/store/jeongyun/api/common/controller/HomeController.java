package store.jeongyun.api.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "auth/login"; // templates/login.html
    }

    @GetMapping("/register")
    public String register() {
        return "auth/register"; // templates/login.html
    }


    @GetMapping("/calculator/calculator.go")
    public String calculator() {
        return "contents/calculator/calculator"; // templates/login.html
    }


}
