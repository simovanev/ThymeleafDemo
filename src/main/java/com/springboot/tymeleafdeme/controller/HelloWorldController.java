package com.springboot.tymeleafdeme.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {
    @GetMapping("/showForm")
    public String showForm() {
        return "input-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "hello";

    }
    @RequestMapping("/processFormTwo")
    public String shoutLoud(HttpServletRequest request, Model model){
        String theName=request.getParameter("studentName");
        model.addAttribute("message", theName.toUpperCase());
        return "hello";
    }
    @PostMapping("/processFormThree")
    public String shoutLouder(@RequestParam("studentName") String theName, Model model){

        model.addAttribute("message", theName.toUpperCase());
        return "hello";
    }
}
