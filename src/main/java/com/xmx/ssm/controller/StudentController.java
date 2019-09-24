package com.xmx.ssm.controller;

import com.xmx.ssm.entity.Student;
import com.xmx.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/studentList")
    public String findAll(Model model){
        List<Student> students = studentService.findAll();
        model.addAttribute("students",students);
        return "student/studentList";
    }
}
