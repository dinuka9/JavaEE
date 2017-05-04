package com.esoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.esoft.service.LoginService;
import org.springframework.ui.ModelMap;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String home(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "password") String password,
            ModelMap model
    ) {
        System.out.println("input param : " + username + " " + password);
        if (username.equals("") || password.equals("")) {
            System.err.println("null input");
            model.addAttribute("error", "input fields cannot be empty");
            return "../../index";
        }
        else if (loginService.varifyUser(username, password).equals("valid")) {
            System.err.println("login successful");
            return "redirect:/emptable";
        } else {
            model.addAttribute("error", "username or password is incorrect");
            System.out.println("login failed");
            return "../../index";
        }
    }
}
