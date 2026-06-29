package com.example.demo;

// This class represents a Student object.
// It is also called a Model or POJO (Plain Old Java Object).

public class Student {

    // Instance variables (properties of a student)
    private int id;
    private String name;

    // Default Constructor
    // Spring uses this to create the object automatically.
    public Student() {
    }

    // Getter method for id
    // Used to get/read the value of id.
    public int getId() {
        return id;
    }

    // Setter method for id
    // Used to set/update the value of id.
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for name
    // Used to get/read the value of name.
    public String getName() {
        return name;
    }

    // Setter method for name
    // Used to set/update the value of name.
    public void setName(String name) {
        this.name = name;
    }
}