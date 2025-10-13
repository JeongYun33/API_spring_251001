package store.jeongyun.api.controller;

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

    @GetMapping("/contents/calculator/plus")
    public String plus() {
        return "contents/calculator/plus"; // templates/login.html
    }

    @GetMapping("/contents/calculator/minus")
    public String minus() {
        return "contents/calculator/minus"; // templates/login.html
    }

    @GetMapping("/contents/calculator/gob")
    public String gob() {
        return "contents/calculator/gob"; // templates/login.html
    }

    @GetMapping("/contents/calculator/nanum")
    public String nanum() {
        return "contents/calculator/nanum"; // templates/login.html
    }


}
