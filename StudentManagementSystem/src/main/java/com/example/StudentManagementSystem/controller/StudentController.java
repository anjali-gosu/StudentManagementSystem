package com.example.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.StudentManagementSystem.Entity.*;
import com.example.StudentManagementSystem.service.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    // Display all students
    @GetMapping("/")
    public String viewHomePage(Model model) {

        model.addAttribute("students", service.getAllStudents());

        return "students";
    }

    // Open Add Student Page
    @GetMapping("/addStudent")
    public String addStudentForm(Model model) {

        model.addAttribute("student", new Student());

        return "add-student";
    }

    // Save Student
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student) {

        service.saveStudent(student);

        return "redirect:/";
    }

    // Open Edit Page
    @GetMapping("/editStudent/{id}")
    public String editStudent(@PathVariable int id, Model model) {

        model.addAttribute("student", service.getStudentById(id));

        return "edit-student";
    }

    // Update Student
    @PostMapping("/updateStudent")
    public String updateStudent(@ModelAttribute Student student) {

        service.updateStudent(student);

        return "redirect:/";
    }

    // Delete Student
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {

        service.deleteStudent(id);

        return "redirect:/";
    }

}