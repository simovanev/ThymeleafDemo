package com.springboot.tymeleafdeme.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
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
    @RequestMapping("/processFormThree")
    public String shoutLouder(@RequestParam("studentName") String theName, Model model){

        model.addAttribute("message", theName.toUpperCase());
        return "hello";
    }
}
