package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/hello")
    public String hello() {

        return "Hello Shubham";

    }
    @PostMapping("/student")
    public String addStudent(@RequestBody Student student)
    {
        return "Student Added Successfully";
    }
}
