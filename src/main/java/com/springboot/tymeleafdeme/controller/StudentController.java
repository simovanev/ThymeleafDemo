package com.springboot.tymeleafdeme.controller;

import com.springboot.tymeleafdeme.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Value("${contries}")
    private List<String> countries;
    @Value("${languages}")
    private List<String> languages;
    @Value("${oses}")
    private List<String> os;

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("os", os);
        return "student-form";
    }
    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student) {

        System.out.println("student: " + student.getFirstName()+" "+student.getLastName());
        return "student-confirmation";
    }

}
