# 🚀 My First Web API – Spring Boot

A simple RESTful API built with Java and Spring Boot, focused on learning backend development fundamentals.  

This application simulates user management operations such as create, read, update, and delete (CRUD), using a mocked repository layer (no database integration).

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring Web MVC
- Maven

---

## 🏗️ Architecture

The project follows a layered architecture pattern:

Controller → Service → Repository (Mocked)

- **Controller Layer** – Handles HTTP requests and REST endpoints  
- **Service Layer** – Contains business logic  
- **Repository Layer** – Simulates data persistence using an in-memory structure  

---

## 🔗 REST Endpoints

| Method | Endpoint        | Description              |
|--------|-----------------|--------------------------|
| POST   | /users          | Create a new user        |
| GET    | /users          | Retrieve all users       |
| GET    | /users/{id}     | Retrieve user by ID      |
| PUT    | /users/{id}     | Update a user            |
| DELETE | /users/{id}     | Delete a user            |

---

## 🎯 Project Goals

- Practice REST API development with Spring Boot  
- Understand layered architecture concepts  
- Learn HTTP methods and REST conventions  
- Simulate data persistence without a database  

---

## ▶️ How to Run

```bash
mvn spring-boot:run
```

The API will be available at:

```
http://localhost:8080
```

---

## 👨‍💻 Author

Djalma Ponciano Rodrigues  

This project was developed for educational purposes and backend learning practice.
