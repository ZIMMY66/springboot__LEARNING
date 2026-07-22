# 🚀 Spring Boot Learning Journey

Welcome to my **Spring Boot Learning Repository**!

This repository documents my day-by-day journey of learning **Spring Boot**, **Backend Development**, and **Java**. Instead of only watching tutorials, I practice every concept by writing code, testing APIs using Postman, maintaining daily GitHub commits, and documenting everything I learn.

The goal of this repository is to build a strong backend development foundation before moving on to real-world projects.

---

# 👨‍💻 About Me

**Name:** Shubham Kumar

🎓 B.Tech Information Technology Student

💻 Currently Learning

- Java
- Spring Boot
- REST APIs
- Backend Development
- Git & GitHub
- Data Structures & Algorithms

---

# 🎯 Learning Goals

My primary objectives are:

- Build a strong understanding of Spring Boot fundamentals.
- Learn professional backend development practices.
- Master REST API development.
- Learn Spring Data JPA and MySQL.
- Build production-ready backend projects.
- Improve problem-solving skills through DSA.
- Maintain consistent GitHub contributions.

---

# 🛠 Tech Stack

| Category | Technologies |
|----------|--------------|
| Language | Java 21 |
| Framework | Spring Boot |
| Build Tool | Maven |
| IDE | IntelliJ IDEA |
| API Testing | Postman |
| Version Control | Git |
| Repository | GitHub |

---

# 📚 Learning Progress

---

# ✅ Day 1

## Topics Covered

- Introduction to Spring Boot
- Spring Boot Architecture
- Project Structure
- Maven
- pom.xml
- application.properties
- Embedded Tomcat
- @SpringBootApplication

## Practical Work

- Created my first Spring Boot project.
- Explored the project structure.
- Successfully ran the application.

## Outcome

✔ Successfully created and executed my first Spring Boot application.

---

# ✅ Day 2

## Topics Covered

- REST APIs
- @RestController
- @GetMapping
- Request & Response
- HTTP Basics

## APIs Created

GET /hello

## Practical Work

- Built my first REST API.
- Tested APIs using Postman.

## Outcome

✔ Understood how Spring Boot handles HTTP GET requests.

---

# ✅ Day 3

## Topics Covered

- @PostMapping
- @RequestBody
- JSON
- POJO
- Model Class

## APIs Created

POST /student

## Practical Work

- Created Student model.
- Accepted JSON request body.
- Converted JSON into Java Object.

## Outcome

✔ Learned how Spring Boot automatically converts JSON into Java Objects.

---

# ✅ Day 4

## Topics Covered

- @PathVariable
- @RequestParam
- @PutMapping
- @DeleteMapping
- CRUD HTTP Methods

## APIs Created

GET /student/{id}

PUT /student/{id}

DELETE /student/{id}

GET /hellobyname?name=Shubham

## Outcome

✔ Learned how to pass data using URL Path Variables and Query Parameters.

---

# ✅ Day 5

## Topics Covered

- Returning Java Objects
- JSON Response
- Serialization
- Parameterized Constructor

## APIs Created

GET /student

## Practical Work

- Returned Java Objects from REST APIs.
- Understood Serialization.

## Outcome

✔ Learned how Spring Boot converts Java Objects into JSON automatically.

---

# ✅ Day 6

## Topics Covered

- List
- ArrayList
- JSON Arrays
- Returning Multiple Objects

## APIs Created

GET /students

## Practical Work

- Stored Student objects in an ArrayList.
- Returned multiple Student objects as JSON.

## Outcome

✔ Learned how to build APIs returning collections of data.

---

# ✅ Day 7

## Topics Covered

- Layered Architecture
- Controller
- Service
- Repository
- Business Logic
- Separation of Concerns (SoC)
- Single Responsibility Principle (SRP)

## Concepts Learned

- Responsibilities of each application layer.
- Why business logic should not remain inside the Controller.
- Request flow inside a Spring Boot application.
- Importance of clean architecture.

## Outcome

✔ Understood how professional Spring Boot applications are structured.

---

# ✅ Day 8

## Topics Covered

- Java Packages
- Project Organization
- Controller Package
- Model Package
- Service Package
- @Service Annotation
- Spring Beans
- Inversion of Control (IoC)

## Practical Work

- Refactored project into professional package structure.
- Created separate packages:
  - controller
  - model
  - service
- Created the StudentService class.
- Learned how Spring manages Beans automatically.

## Concepts Learned

- Importance of project organization.
- Package responsibilities.
- Bean creation.
- Spring Container basics.

## Outcome

✔ Successfully organized the project using Spring Boot best practices.

---

# ✅ Day 9

## Topics Covered

- Dependency Injection (DI)
- @Autowired Annotation
- Controller-Service Communication
- Bean Injection
- Package Refactoring
- Spring Component Scanning

## Practical Work

- Injected StudentService into StudentController.
- Created the first Service endpoint.
- Connected Controller with Service.
- Updated package declarations.
- Updated import statements.
- Refactored the project into a standard Spring Boot structure.

## Problems Faced

While reorganizing the project, I encountered package-related issues such as:

- Package does not exist
- Package name does not correspond to file path
- Import resolution errors

After debugging these issues, I learned the importance of matching Java package declarations with the actual folder structure and understood how Spring Boot scans components.

## Concepts Learned

- How Dependency Injection works.
- Why Spring manages Beans instead of manually creating objects.
- Importance of proper package hierarchy.
- Component Scanning.
- Real-world debugging of package structure.

## Outcome

✔ Successfully implemented Dependency Injection using `@Autowired`.

✔ Connected the Controller with the Service layer.

✔ Fixed package structure and import issues following Spring Boot conventions.

## Next Goal

- Move all CRUD business logic from Controller to Service.
- Learn Spring Data JPA.
- Connect the application with MySQL.

---

# 🚀 APIs Built

| HTTP Method | Endpoint | Description |
|-------------|----------|-------------|
| GET | /hello | Returns a greeting message |
| GET | /hellobyname | Returns greeting using RequestParam |
| POST | /student | Creates a new student |
| GET | /student/{id} | Returns student by ID |
| PUT | /student/{id} | Updates student |
| DELETE | /student/{id} | Deletes student |
| GET | /student | Returns a Student object |
| GET | /students | Returns all students |
| GET | /service | Tests Service Layer communication |

---

# 📖 Spring Boot Concepts Learned

✔ Spring Boot Fundamentals

✔ Maven

✔ Embedded Tomcat

✔ REST APIs

✔ HTTP Methods

✔ Controller

✔ Service Layer

✔ Layered Architecture

✔ Business Logic

✔ RequestBody

✔ PathVariable

✔ RequestParam

✔ JSON

✔ Serialization

✔ Java Objects

✔ Collections (List & ArrayList)

✔ Spring Beans

✔ Inversion of Control (IoC)

✔ Dependency Injection (DI)

✔ @Service

✔ @Autowired

✔ Component Scanning

✔ Java Packages

✔ Project Structure

---

# 📌 Upcoming Topics

- Spring Data JPA
- Hibernate
- MySQL
- CRUD with Database
- Exception Handling
- Validation
- DTO
- Lombok
- Relationships
- Authentication & Authorization
- JWT Security
- Deployment

---

# 📈 Current Progress

- ✅ Spring Boot Fundamentals
- ✅ REST API Development
- ✅ Layered Architecture
- ✅ Service Layer
- ✅ Dependency Injection
- ⏳ Spring Data JPA
- ⏳ MySQL Integration
- ⏳ Real-world Backend Project

---

# 🎯 Long-Term Goal

Build complete backend applications using:

- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- REST APIs
- JWT Authentication
- Docker
- Git & GitHub

and become internship-ready for Backend Development roles.

---

# ⭐ Repository Purpose

This repository is more than just code.

It serves as my personal learning journal where I document:

- Daily progress
- Practical implementations
- Concepts learned
- Problems solved
- GitHub consistency
- Backend development journey

Every commit represents one step toward becoming a better Java Backend Developer.

---

## ⭐ If you find this repository helpful, feel free to star it!
