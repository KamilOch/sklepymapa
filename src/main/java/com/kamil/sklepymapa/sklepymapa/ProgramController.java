package com.kamil.sklepymapa.sklepymapa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramController {

    @GetMapping("/admin")
    public String admin(
            Model model
    ) {

        return "admin";
    }

    @GetMapping("/user")
    public String user(
            Model model
    ) {
        return "user";
    }

    @GetMapping("/hello")
    public String get() {
        return "hello";
    }
}
