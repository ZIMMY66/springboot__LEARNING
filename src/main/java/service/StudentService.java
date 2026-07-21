package com.example.demo.service;
import org.springframework.stereotype.Service;

// Marks this class as Service Layer
// Spring will automatically create its Bean.
@Service
public class StudentService {

    // Simple method
    public String getMessage()
    {
        return "Hello from Student Service";
    }

}
