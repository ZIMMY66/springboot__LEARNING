package com.example.demo;
import org.springframework.web.bind.annotation.*;

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
    //handles dynamic URL values like /studentss/1
    @GetMapping("/student/{id}")
    public String getStudent(
         //takes values from url and stores
            @PathVariable int id
    )
    {
        return " Student Id is "+id;
    }
    @GetMapping ("/hellobyname")
    public String hello(
            @RequestParam String name

    )
    {
        return "Hello"+name;
    }

}
