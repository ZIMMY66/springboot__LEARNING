package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;

import com.example.demo.service.StudentService;
import com.example.demo.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // Marks this class as a REST API Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Our Temporary Database
    List<Student> students = new ArrayList<>();
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
        students.add(student);  // ← Actually SAVES the student now!
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
//    @DeleteMapping("/student/{id}")
//    public String deleteStudent(
//
//            // Takes id from URL
//            @PathVariable int id
//    ) {
//        return "Student " + id +
//                " deleted successfully";
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id) {

        // Loop through every student
        for (Student s : students) {

            // Check if this student's id matches
            if (s.getId() == id) {

                // Remove from our list
                students.remove(s);
                return "Student " + id + " deleted successfully";
            }
        }

        // If we reach here, student was not found
        return "Student with id " + id + " not found";
    }
    @GetMapping("/service")
    public String serviceMessage() {
        return studentService.getMessage();
    }

    // Returns Java Object
    // Spring Boot automatically converts Object into JSON
    @GetMapping("/student")
    public Student getStudent() {

        //to import multiple student or to make object for multiple student we use list

        // Creates Student Object
        return new Student(1, "Shubham");
    }
// List
// Stores multiple objects.

// ArrayList
// Creates an empty List.

// add()
// Adds an object into the List.

    // Spring Boot automatically converts
// List -> JSON Array.
    // Returns multiple Student Objects as JSON
//    @GetMapping("/students")
//    public List<Student> getStudents()
//
//    {
//        // Creating an empty List
//        List<Student> students = new ArrayList<>();
//
//        // Adding Student objects into the List
//        students.add(new Student(1, "Shubham"));
//        students.add(new Student(2, "Rahul"));
//        students.add(new Student(3, "Aman"));
//
//        // Returning List
//        // Spring Boot converts List into JSON Array
//        return students;
//    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;  // ← Returns whatever was actually POSTed!
    }
}


