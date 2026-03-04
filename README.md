# Spring-Boot-Greeting-API
A simple Spring Boot REST API demonstrating basic endpoints using @GetMapping, @PathVariable, and @RequestParam.

This project is a simple Spring Boot REST API that demonstrates how to create basic REST endpoints using Spring Boot. It includes examples of handling HTTP GET requests, using path variables, and optional query parameters.

The application provides endpoints to return greeting messages such as:

A basic Hello World endpoint

A general greeting endpoint

A personalized greeting endpoint using a path variable

An optional custom message using a request parameter

This project is useful for beginners learning:

Spring Boot REST controllers

@GetMapping

@PathVariable

@RequestParam

Basic API endpoint creation

Example endpoints:

/hello → Returns "Hello world!"

/greet → Returns a welcome message

/greet/{name} → Returns a personalized greeting

/greet/{name}?message=YourMessage → Returns a personalized greeting with a custom message
