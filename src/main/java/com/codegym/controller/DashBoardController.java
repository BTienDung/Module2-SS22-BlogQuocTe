package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class DashBoardController {
    @GetMapping("/dashboard")
    public ModelAndView dashBoard(){
        ModelAndView modelAndView = new ModelAndView("/dashboard");
        return modelAndView;
    }
}
