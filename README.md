# 🚀 My First Web API – Spring Boot

A simple RESTful API built with **Java** and **Spring Boot**, focused on learning backend development fundamentals.

This application simulates user management operations such as create, read, update, and delete (CRUD), using a mocked repository layer (no database integration).

---

## 🛠️ Tech Stack

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![REST API](https://img.shields.io/badge/REST-FF6C37?style=for-the-badge)

---

## 🏗️ Architecture

The project follows a **layered architecture pattern**:

**Controller → Service → Repository (Mocked)**

- **Controller Layer** – Handles HTTP requests and REST endpoints  
- **Service Layer** – Contains business logic  
- **Repository Layer** – Simulates data persistence using an in-memory structure  

---

## 🔗 REST Endpoints

| Method | Endpoint       | Description           |
|--------|----------------|---------------------|
| POST   | `/users`       | Create a new user    |
| GET    | `/users`       | Retrieve all users   |
| GET    | `/users/{id}`  | Retrieve user by ID  |
| PUT    | `/users/{id}`  | Update a user        |
| DELETE | `/users/{id}`  | Delete a user        |

---

## 🎯 Project Goals

- Practice **REST API development** with Spring Boot  
- Understand **layered architecture** concepts  
- Learn **HTTP methods** and REST conventions  
- Simulate **data persistence** without a database  

---

## ▶️ How to Run

```bash
mvn spring-boot:run
