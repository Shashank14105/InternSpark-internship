# 📚 Book Management API – Unit Testing & Logging

## 📌 Internship Project

This project is developed as part of the **InternSpark AICTE-listed Java Internship Program**.

The project demonstrates:

* REST API development using Spring Boot
* MySQL database integration
* Unit testing using JUnit 5 & Mockito
* Logging using SLF4J and Logback
* Test coverage report using JaCoCo
* API testing using Postman

---

# 🚀 Tech Stack

* Java 17
* Spring Boot 3
* Spring Data JPA
* MySQL
* Maven
* JUnit 5
* Mockito
* JaCoCo
* SLF4J
* Logback
* Lombok
* Postman
* IntelliJ IDEA

---

# 📂 Project Structure

```
bookmanagementapi
│
├── screenshots
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.shashank.bookmanagementapi
│   │   │       ├── controller
│   │   │       ├── dto
│   │   │       ├── entity
│   │   │       ├── exception
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── BookmanagementapiApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│       └── java
│           └── com.shashank.bookmanagementapi
│               └── service
│                   └── BookServiceTest.java
│
├── target
│   └── site
│       └── jacoco
│
├── pom.xml
└── README.md
```

---

# ⚙️ Database Configuration

Database used:

```
book_db
```

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/book_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# 🌐 REST API Endpoints

| Method | Endpoint      | Description             |
| ------ | ------------- | ----------------------- |
| POST   | `/books`      | Add a new book          |
| GET    | `/books`      | Retrieve all books      |
| GET    | `/books/{id}` | Retrieve a book by ID   |
| PUT    | `/books/{id}` | Update an existing book |
| DELETE | `/books/{id}` | Delete a book           |

---

# 📥 Sample Request Body

```json
{
  "isbn": "9780134685991",
  "title": "Effective Java",
  "author": "Joshua Bloch",
  "pages": 416
}
```

---

# 🧪 Unit Testing

The service layer is tested using **JUnit 5** and **Mockito**.

### Test Class

```
BookServiceTest.java
```

### Test Cases Covered

* Create Book
* Get All Books
* Get Book By ID
* Update Book
* Delete Book
* Book Not Found Exception

---

# 📊 Code Coverage

JaCoCo is used to generate the code coverage report.

### Coverage Summary

* Overall Project Coverage: **65%**
* Service Layer Coverage: **92%**

Coverage reports are generated automatically under:

```
target/site/jacoco/index.html
```

---

# 📝 Logging

SLF4J and Logback are used to log important application events.

### Sample Logs

```
INFO  POST request received to create book: Effective Java

INFO  Creating a new book: Effective Java

INFO  Book created successfully with title: Effective Java

INFO  GET request received to fetch all books

INFO  Fetching all books

INFO  PUT request received to update book ID: 1

INFO  Updating book with ID: 1

INFO  DELETE request received to delete book ID: 1

INFO  Book deleted successfully
```

---

# 📮 API Testing

All REST APIs were successfully tested using **Postman**.

---

# 📸 Screenshots

Include screenshots of:

* Project Structure
* pom.xml
* application.properties
* BookController.java
* BookService.java
* BookServiceTest.java
* JaCoCo Coverage Report
* Console Logs
* POST API Testing
* GET API Testing
* PUT API Testing
* DELETE API Testing
* Passed Unit Tests
* MySQL Database Table

---

# ▶️ How to Run the Project

### 1. Clone the Repository

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

### 3. Create Database

```sql
CREATE DATABASE book_db;
```

### 4. Configure Database

Update your MySQL username and password in:

```
application.properties
```

### 5. Run the Application

Run:

```
BookmanagementapiApplication.java
```

### 6. Test APIs

Use Postman to test all CRUD endpoints.

### 7. Execute Unit Tests

Run:

```
BookServiceTest.java
```

### 8. Generate Coverage Report

Run:

```bash
mvn clean verify
```

Open:

```
target/site/jacoco/index.html
```

---

# ✅ Features Implemented

* Spring Boot REST API
* MySQL Integration
* DTO-based Request Handling
* Service Layer Architecture
* Exception Handling
* CRUD Operations
* Unit Testing using JUnit 5
* Mockito-based Repository Mocking
* Logging using SLF4J & Logback
* JaCoCo Code Coverage
* Postman API Testing

---

# 👨‍💻 Developed By

**Shashank Kumar**

B.Tech CSE (Artificial Intelligence & Machine Learning)

GitHub:
(Add your GitHub profile link here)
