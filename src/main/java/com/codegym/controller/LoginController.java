package com.codegym.controller;

import com.codegym.request.Credential;
import com.codegym.respone.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class LoginController {
    @GetMapping("/login")
    public ModelAndView formLogin(){
        ModelAndView modelAndView = new ModelAndView("/login");
        modelAndView.addObject("credential", new Credential());
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView dashBoard(@ModelAttribute Credential credential){
        ModelAndView modelAndView = new ModelAndView("/dashboard");
        User user = new User();
        user.setUserName(credential.getUsername());
        modelAndView.addObject("user", user);
        return modelAndView;
    }
}
