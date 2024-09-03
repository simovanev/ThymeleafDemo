package com.springboot.tymeleafdeme.controller;

import com.springboot.tymeleafdeme.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "student-form";
    }

}
