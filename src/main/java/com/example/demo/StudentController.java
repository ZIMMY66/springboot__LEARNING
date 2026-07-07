package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController // Marks this class as a REST API Controller
public class StudentController {

    // Handles GET request
    @GetMapping("/hello")
    public String hello() {
        return "Hello Shubham";
    }

    // Handles GET request with Query Parameter
    // Example: /hellobyname?name=Shubham
    @GetMapping("/hellobyname")
    public String hello(
            @RequestParam String name
    ) {
        return "Hello " + name;
    }

    // Handles POST request
    // Used to create new student
    @PostMapping("/student")
    public String addStudent(

            // Converts JSON into Java Object
            @RequestBody Student student
    ) {
        return "Student Added Successfully";
    }

    // Handles GET request with Path Variable
    // Example: /student/1
    @GetMapping("/student/{id}")
    public String getStudentById(

            // Takes id from URL
            @PathVariable int id
    ) {
        return "Student Id is " + id;
    }

    // Handles PUT request
    // Used to update existing student
    @PutMapping("/student/{id}")
    public String updateStudent(

            // Takes id from URL
            @PathVariable int id,

            // Takes updated student data from JSON
            @RequestBody Student student
    ) {
        return "Student " + id +
                " updated to " +
                student.getName();
    }

    // Handles DELETE request
    // Used to delete student
    @DeleteMapping("/student/{id}")
    public String deleteStudent(

            // Takes id from URL
            @PathVariable int id
    ) {
        return "Student " + id +
                " deleted successfully";
    }

    // Returns Java Object
    // Spring Boot automatically converts Object into JSON
    @GetMapping("/student")
    public Student getStudent() {

        // Creates Student Object
        return new Student(1, "Shubham");
    }

}