package com.example.studentmanagementsystem.cotroller;

import com.example.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/get-students")
    public String studentList(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }
}
