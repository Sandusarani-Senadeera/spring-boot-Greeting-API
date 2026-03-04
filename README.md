# Spring-Boot-Greeting-API

A simple **Spring Boot REST API** demonstrating basic endpoints using `@GetMapping`, `@PathVariable`, and `@RequestParam`.

## 📌 Project Overview

This project is a simple **Spring Boot REST API** that demonstrates how to create basic REST endpoints using Spring Boot. It includes examples of handling HTTP GET requests, using path variables, and optional query parameters.

The application provides endpoints to return greeting messages such as:

* A basic **Hello World** endpoint
* A **general greeting** endpoint
* A **personalized greeting** using a path variable
* A **custom greeting message** using a request parameter

This project is useful for beginners learning:

* Spring Boot REST Controllers
* `@GetMapping`
* `@PathVariable`
* `@RequestParam`
* Basic API endpoint development

---

## ⚙️ Technologies Used

* Java
* Spring Boot
* Spring Web
* Maven

---

## 🚀 API Endpoints

### 1️⃣ Hello Endpoint

Returns a simple hello message.

```
GET /hello
```

Example response:

```
Hello world!
```

---

### 2️⃣ General Greeting

Returns a welcome greeting.

```
GET /greet
```

Example response:

```
Welcome to Spring Boot!
```

---

### 3️⃣ Personalized Greeting

Returns a greeting using a name from the URL path.

```
GET /greet/{name}
```

Example:

```
GET /greet/John
```

Response:

```
Hello John! Welcome to Spring Boot!
```

---

### 4️⃣ Greeting with Custom Message

Allows passing an optional message using a query parameter.

```
GET /greet/{name}?message=YourMessage
```

Example:

```
GET /greet/John?message=Good%20Morning
```

Response:

```
Hello John! Good Morning
```

---

## ▶️ How to Run the Project

1. Clone the repository

```
git clone https://github.com/your-username/Spring-Boot-Greeting-API.git
```

2. Navigate to the project folder

```
cd Spring-Boot-Greeting-API
```

3. Run the application

```
mvn spring-boot:run
```

4. Open your browser or Postman and test:

```
http://localhost:8080/hello
```

---

## 🎯 Learning Purpose

This project is designed for **beginners learning Spring Boot REST API development** and understanding how to handle path variables and request parameters in web applications.

---

## 📄 License

This project is open-source and available for learning purposes.



