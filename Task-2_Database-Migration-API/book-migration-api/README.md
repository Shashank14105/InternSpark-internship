# 📚 Book Migration API

A Spring Boot REST API developed as part of the **InternSpark AICTE-listed Java Internship Program**. This project demonstrates **Database Integration using MySQL**, **Spring Data JPA**, and **Flyway Database Migrations** with a complete Book Management System.

---

# 🚀 Tech Stack

* Java 17
* Spring Boot 3
* Spring Data JPA
* MySQL
* Flyway Migration
* Maven
* Lombok
* Postman
* IntelliJ IDEA

---

# 📂 Project Structure

```text
book-migration-api
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.shashank.bookmigrationapi
│   │   │       ├── controller
│   │   │       │     └── BookController.java
│   │   │       │
│   │   │       ├── entity
│   │   │       │     └── Book.java
│   │   │       │
│   │   │       ├── repository
│   │   │       │     └── BookRepository.java
│   │   │       │
│   │   │       ├── service
│   │   │       │     └── BookService.java
│   │   │       │
│   │   │       └── BookMigrationApiApplication.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── db
│   │           └── migration
│   │               ├── V1__create_books_table.sql
│   │               ├── V2__insert_sample_books.sql
│   │               ├── V3__add_author_column.sql
│   │               └── V4__add_price_column.sql
│
├── pom.xml
├── README.md
└── screenshots
```

---

# 📖 Project Overview

The application manages book records using a MySQL database. Flyway is used to version and automate database schema changes while Spring Data JPA provides seamless interaction between Java objects and database tables.

The project demonstrates:

* Database Integration with MySQL
* Spring Data JPA Repository
* Flyway Database Versioning
* Automatic Database Migration
* Sample Data Seeding
* RESTful CRUD Operations

---

# ⚙️ Database Configuration

## Database Name

```text
book_db_flyway
```

## application.properties

```properties
spring.application.name=BookMigrationAPI

spring.datasource.url=jdbc:mysql://localhost:3306/book_db_flyway
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=none
spring.jpa.show-sql=true

spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration
```

---

# 🔄 Flyway Migration Files

## V1 - Create Books Table

```sql
CREATE TABLE books (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) UNIQUE,
    published_year INT
);
```

Purpose

* Creates the books table.
* Defines primary key and constraints.

---

## V2 - Insert Sample Books

```sql
INSERT INTO books (title, isbn, published_year)
VALUES
('Atomic Habits','9780735211292',2018),
('Can''t Hurt Me','9780132350884',2008),
('Balidan','9780135957059',2019);
```

Purpose

* Inserts sample records automatically.
* Demonstrates Flyway data seeding.

---

## V3 - Add Author Column

```sql
ALTER TABLE books
ADD author VARCHAR(100);
```

Purpose

* Demonstrates schema evolution.
* Adds a new author field.

---

## V4 - Add Price Column

```sql
ALTER TABLE books
ADD price DECIMAL(10,2);
```

Purpose

* Adds book pricing information.
* Demonstrates version-controlled schema updates.

---

# 🗄️ Database Schema

| Column         | Type          |
| -------------- | ------------- |
| id             | BIGINT        |
| title          | VARCHAR(255)  |
| isbn           | VARCHAR(20)   |
| published_year | INT           |
| author         | VARCHAR(100)  |
| price          | DECIMAL(10,2) |

---

# 🌐 REST API Endpoints

## Get All Books

```http
GET /books
```

Example

```
http://localhost:8080/books
```

---

## Get Book By ID

```http
GET /books/{id}
```

Example

```
http://localhost:8080/books/1
```

---

## Add Book

```http
POST /books
```

Example Body

```json
{
    "title":"Spring in Action",
    "isbn":"9781617297571",
    "publishedYear":2021,
    "author":"Craig Walls",
    "price":899
}
```

---

## Update Book

```http
PUT /books/{id}
```

Example

```
http://localhost:8080/books/2
```

Body

```json
{
    "title":"Can't Hurt Me",
    "isbn":"9781544512273",
    "publishedYear":2018,
    "author":"David Goggins",
    "price":799
}
```

---

## Delete Book

```http
DELETE /books/{id}
```

Example

```
http://localhost:8080/books/4
```

---

# 📮 Sample Response

```json
[
  {
    "id": 1,
    "title": "Atomic Habits",
    "isbn": "9780735211292",
    "publishedYear": 2018,
    "author": "James Clear",
    "price": 499.0
  },
  {
    "id": 2,
    "title": "Can't Hurt Me",
    "isbn": "9781544512273",
    "publishedYear": 2018,
    "author": "David Goggins",
    "price": 699.0
  }
]
```

---

# ✨ Features Implemented

* Spring Boot REST API
* MySQL Database Integration
* Spring Data JPA Repository
* Flyway Database Migration
* Version Controlled Database Schema
* Automatic Sample Data Seeding
* Complete CRUD Operations
* RESTful API Architecture
* Layered Architecture (Controller-Service-Repository)
* Postman API Testing

---

# 🧪 API Methods Included

| Method | Endpoint    | Description             |
| ------ | ----------- | ----------------------- |
| GET    | /books      | Retrieve all books      |
| GET    | /books/{id} | Retrieve a book by ID   |
| POST   | /books      | Add a new book          |
| PUT    | /books/{id} | Update an existing book |
| DELETE | /books/{id} | Delete a book           |

---

# 📸 Screenshots Included

* Project Structure
* application.properties
* Flyway Migration Files
* MySQL Database
* books Table
* flyway_schema_history Table
* REST API Testing using Postman
* Console Output
* CRUD API Responses

---

# ▶️ How to Run the Project

### 1. Clone the Repository

```bash
git clone <repository-url>
```

---

### 2. Open the Project

Open the project in **IntelliJ IDEA**.

---

### 3. Create Database

```sql
CREATE DATABASE book_db_flyway;
```

---

### 4. Configure Database

Update the following in `application.properties`:

* MySQL Username
* MySQL Password

---

### 5. Run the Application

Run

```
BookMigrationApiApplication.java
```

Flyway will automatically:

* Create the database schema
* Execute all migration scripts
* Seed sample data
* Maintain migration history

---

# 📚 Key Concepts Demonstrated

* Spring Boot REST API Development
* Database Integration with MySQL
* Object Relational Mapping using Spring Data JPA
* Flyway Database Versioning
* Schema Evolution
* Data Seeding
* Layered Architecture
* RESTful Web Services
* CRUD Operations

---

# 👨‍💻 Developed By

**Shashank Kumar**

InternSpark AICTE Listed Java Internship Project
