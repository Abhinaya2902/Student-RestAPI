# Student-RestAPI

Overview

This is a Spring Boot application designed to manage student records. It demonstrates how to implement CRUD operations for students using RESTful APIs, following clean coding practices and a layered architecture.

Each student record contains details like ID, name, and department. This project uses Spring Data JPA to interact with a MySQL database.



# Features

 *Student Management
  - Add a new student
  - Retrieve all students
  - Retrieve a student by ID
  - Update student details
  - Delete a student

  *DTO Mapping
  - Data Transfer Objects (DTOs) are used to ensure decoupling between the entity and API layer.
  
  *Exception Handling
  - Centralized and custom error responses using Spring's `@ControllerAdvice`.



# Technology Stack

| Tech           | Description                   |
|----------------|-------------------------------|
| Java           | Version 17                    |
| Spring Boot    | 3.x                           |
| Spring Data JPA| ORM framework                 |
| MySQL          | Relational database           |
| Maven          | Build and dependency manager  |
| Lombok         | Reduces boilerplate code      |



# Prerequisites

- Java 17
- Maven 3.x
- MySQL (create a database named `studentdb`)
- Postman (or any REST client to test the APIs)
