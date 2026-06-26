# 📚 Book Management REST API

A RESTful CRUD API built using **Spring Boot**, **Spring Data JPA**, **MySQL**, and **Lombok**. This project demonstrates the implementation of REST principles, layered architecture, DTOs, validation, exception handling, and database integration.

---

## 🚀 Features

- Create a new Book
- Retrieve all Books
- Retrieve a Book by ID
- Update existing Book details
- Delete a Book
- Request validation using Jakarta Validation
- Global Exception Handling
- MySQL Database Integration
- Layered Architecture (Controller → Service → Repository)
- DTO for request handling

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- Maven
- Jakarta Validation
- Postman

---

## 📁 Project Structure

```text
bookmanagementapi
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── shashank
│       │           └── bookmanagementapi
│       │               ├── controller
│       │               │     └── BookController.java
│       │               │
│       │               ├── dto
│       │               │     └── BookDTO.java
│       │               │
│       │               ├── entity
│       │               │     └── Book.java
│       │               │
│       │               ├── repository
│       │               │     └── BookRepository.java
│       │               │
│       │               ├── service
│       │               │     └── BookService.java
│       │               │
│       │               ├── exception
│       │               │     ├── BookNotFoundException.java
│       │               │     └── GlobalExceptionHandler.java
│       │               │
│       │               └── BookmanagementapiApplication.java
│       │
│       └── resources
│             └── application.properties
│
├── pom.xml
└── README.md
```

---

## 📖 Book Fields

| Field | Type |
|-------|------|
| id | Long |
| isbn | String |
| title | String |
| author | String |
| pages | Integer |

---

## 📌 REST API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/books` | Create a new Book |
| GET | `/books` | Retrieve all Books |
| GET | `/books/{id}` | Retrieve Book by ID |
| PUT | `/books/{id}` | Update an existing Book |
| DELETE | `/books/{id}` | Delete a Book |

---

## 📥 Sample Request (POST)

**POST** `/books`

```json
{
    "isbn": "9780134685991",
    "title": "Effective Java",
    "author": "Joshua Bloch",
    "pages": 416
}
```

---

## 📤 Sample Response

```json
{
    "id": 1,
    "isbn": "9780134685991",
    "title": "Effective Java",
    "author": "Joshua Bloch",
    "pages": 416
}
```

---

## ⚙️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE book_db;
```

Configure your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/book_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## ▶️ Running the Project

1. Clone the repository

```bash
git clone https://github.com/your-username/book-management-rest-api.git
```

2. Open the project in IntelliJ IDEA.

3. Configure MySQL credentials in `application.properties`.

4. Build the project using Maven.

5. Run:

```
BookmanagementapiApplication.java
```

6. Test the endpoints using Postman.

---

## 🧪 Testing

The API was tested using **Postman** for all CRUD operations.

- Create Book
- Get All Books
- Get Book by ID
- Update Book
- Delete Book

---

## 📚 Concepts Demonstrated

- RESTful API Development
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate ORM
- MySQL Database Integration
- DTO Pattern
- Dependency Injection
- CRUD Operations
- Bean Validation
- Exception Handling
- Layered Architecture
- HTTP Status Codes

---

## 👨‍💻 Author

**Shashank Kumar**

B.Tech CSE (AI & ML)

Spring Boot REST API Internship Project
