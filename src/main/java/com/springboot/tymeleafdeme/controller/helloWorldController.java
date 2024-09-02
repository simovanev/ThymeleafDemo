package com.springboot.tymeleafdeme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloWorldController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "input-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "hello";

    }
}
