package com.hangman.springboot.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HangmanController {
    @GetMapping({"/", "/hangman"})
    public String initialPage(Model model) {
        return "hangman";
    }
}
