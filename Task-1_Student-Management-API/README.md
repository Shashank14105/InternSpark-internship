# Product Management REST API

A RESTful CRUD API built using **Spring Boot**, **Spring Data JPA**, **MySQL**, **Lombok**, and **Jakarta Validation**. This project demonstrates the implementation of a layered architecture using Controller, Service, Repository, DTO, and Entity classes.

---

## 🚀 Features

* Create a new Product
* Retrieve all Products
* Retrieve a Product by ID
* Update Product details
* Delete a Product
* Input validation using Jakarta Validation
* Custom Exception Handling
* Global Exception Handler
* RESTful API with proper HTTP Status Codes
* MySQL Database Integration
* Layered Architecture following Spring Boot best practices

---

## 🛠️ Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Lombok
* Jakarta Validation
* Maven
* Postman

---

## 📁 Project Structure

```text
src
└── main
    └── java
        └── com
            └── example
                └── productapi
                    ├── controller
                    │   └── ProductController.java
                    │
                    ├── service
                    │   └── ProductService.java
                    │
                    ├── repository
                    │   └── ProductRepository.java
                    │
                    ├── dto
                    │   └── ProductDTO.java
                    │
                    ├── entity
                    │   └── Product.java
                    │
                    ├── exception
                    │   ├── ProductNotFoundException.java
                    │   └── GlobalExceptionHandler.java
                    │
                    └── ProductApiApplication.java
```

---

## 📦 Product Fields

| Field       | Type   | Description               |
| ----------- | ------ | ------------------------- |
| id          | Long   | Auto-generated Product ID |
| name        | String | Product Name              |
| description | String | Product Description       |
| price       | Double | Product Price             |

---

## 🌐 REST API Endpoints

| Method | Endpoint         | Description       | Status Code        |
| ------ | ---------------- | ----------------- | ------------------ |
| POST   | `/products`      | Create a Product  | **201 Created**    |
| GET    | `/products`      | Get All Products  | **200 OK**         |
| GET    | `/products/{id}` | Get Product by ID | **200 OK**         |
| PUT    | `/products/{id}` | Update Product    | **200 OK**         |
| DELETE | `/products/{id}` | Delete Product    | **204 No Content** |

---

## 📥 Sample Request (POST)

**Endpoint**

```http
POST /products
```

**Request Body**

```json
{
    "name": "Laptop",
    "description": "Gaming Laptop",
    "price": 85000.00
}
```

---

## 📤 Sample Response

```json
{
    "id": 1,
    "name": "Laptop",
    "description": "Gaming Laptop",
    "price": 85000.00
}
```

---

## ⚠️ Exception Handling

The application uses custom exception handling to provide meaningful error responses.

Example:

```http
GET /products/100
```

Response:

```http
404 Not Found
```

```text
Product not found
```

---

## 🧪 Testing

The API can be tested using:

* Postman
* cURL
* IntelliJ HTTP Client

---

## ▶️ Running the Project

1. Clone the repository.
2. Configure MySQL database credentials in `application.properties`.
3. Create the required database.
4. Run the Spring Boot application.
5. Test the endpoints using Postman.

---

## 👨‍💻 Author

**Shashank Kumar**

Built as part of a Spring Boot REST API internship project to demonstrate CRUD operations, layered architecture, DTO usage, validation, exception handling, and database integration.
