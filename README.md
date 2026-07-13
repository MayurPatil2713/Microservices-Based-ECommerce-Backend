# 🛒 Microservices-Based E-Commerce Backend

A scalable **Microservices-Based E-Commerce Backend** built using **Spring Boot**, **Spring Cloud**, **Eureka Service Registry**, **API Gateway**, **JWT Authentication**, and **MySQL**. This project demonstrates how to design and develop a distributed backend system following the microservices architecture.

---

## 📌 Features

- ✅ Microservices Architecture
- ✅ Service Discovery using Eureka Server
- ✅ API Gateway Routing
- ✅ Product Management (CRUD)
- ✅ User Registration & Login
- ✅ JWT Authentication
- ✅ Order Management
- ✅ MySQL Database Integration
- ✅ RESTful APIs
- ✅ Maven Build System
- ✅ Postman API Testing

---

# 🏗️ Project Architecture

```
                    +----------------+
                    |     Client     |
                    +--------+-------+
                             |
                             |
                    +--------v--------+
                    |   API Gateway   |
                    |      :8080      |
                    +--------+--------+
                             |
        ---------------------------------------------
        |                    |                      |
        |                    |                      |
+-------v-------+    +-------v-------+     +--------v--------+
| Product       |    | User          |     | Order           |
| Service       |    | Service       |     | Service         |
| :8081         |    | :8082         |     | :8083           |
+-------+-------+    +-------+-------+     +--------+--------+
        |                    |                       |
        |                    |                       |
        ---------------------------------------------
                             |
                    +--------v--------+
                    |   MySQL DB      |
                    +-----------------+

               ^
               |
        +------+------+
        | Eureka      |
        | Server      |
        | :8761       |
        +-------------+
```

---

# 📂 Project Structure

```
Microservices-Based-ECommerce-Backend
│
├── service-registry
├── api-gateway
├── product-service
├── user-service
├── order-service
│
├── .gitignore
├── README.md
```

---

# 🚀 Technologies Used

| Technology | Version |
|------------|----------|
| Java | 17 |
| Spring Boot | 3.5.16 |
| Spring Cloud | 2025.0.3 |
| Spring Data JPA | Latest |
| Spring Security | Latest |
| JWT | 0.12.7 |
| Eureka Server | Netflix Eureka |
| Spring Cloud Gateway | Latest |
| Maven | 3.x |
| MySQL | 8.x |
| Postman | API Testing |

---

# 📦 Microservices

## 1️⃣ Eureka Service Registry

**Port:** `8761`

Responsibilities

- Service Registration
- Service Discovery
- Health Monitoring

---

## 2️⃣ API Gateway

**Port:** `8080`

Responsibilities

- Request Routing
- Single Entry Point
- Load Balancing

---

## 3️⃣ Product Service

**Port:** `8081`

Features

- Add Product
- View Products
- Update Product
- Delete Product

---

## 4️⃣ User Service

**Port:** `8082`

Features

- User Registration
- User Login
- JWT Token Generation
- Password Encryption using BCrypt

---

## 5️⃣ Order Service

**Port:** `8083`

Features

- Place Order
- View Orders
- Delete Order

---

# 🗄️ Database

Database Name

```
ecommerce_db
```

Database

- MySQL

ORM

- Spring Data JPA
- Hibernate

---

# 🔐 Authentication

- JWT Authentication
- BCrypt Password Encryption
- Spring Security

---

# 📡 API Endpoints

## Product APIs

| Method | Endpoint |
|----------|----------------|
| GET | /products |
| POST | /products |
| PUT | /products/{id} |
| DELETE | /products/{id} |

---

## User APIs

| Method | Endpoint |
|----------|----------------|
| POST | /users/register |
| POST | /users/login |

---

## Order APIs

| Method | Endpoint |
|----------|----------------|
| GET | /orders |
| POST | /orders |
| GET | /orders/{id} |
| DELETE | /orders/{id} |

---

# ▶️ How to Run

## Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/Microservices-Based-ECommerce-Backend.git
```

---

## Start Services

Run in the following order:

1. Eureka Server
2. Product Service
3. User Service
4. Order Service
5. API Gateway

---

Open

```
http://localhost:8761
```

Verify that all services are registered.

---

# 🧪 Testing

API testing was performed using **Postman**.

Tested Operations

- Product CRUD
- User Registration
- User Login
- JWT Authentication
- Order CRUD

---

# 📈 Future Enhancements

- Payment Service
- Inventory Service
- Notification Service
- Docker
- Kubernetes
- Redis Cache
- RabbitMQ / Kafka
- OpenFeign Communication
- Swagger API Documentation

---

# 👨‍💻 Author

**Mayur**

MCA Student

---

# ⭐ If you like this project

Please give this repository a ⭐ on GitHub.
