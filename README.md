# Product Management System

A simple Product Management REST API built with Spring Boot. This project allows you to:

* Add products with images
* Get all products
* Get a product by ID
* Update product details and image
* Delete a product
* Search products by keyword

## Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL / PostgreSQL
* Maven
* Multipart File Upload

## API Endpoints

| Method | Endpoint                             | Description                  |
| ------ | ------------------------------------ | ---------------------------- |
| GET    | `/api/products`                      | Get all products             |
| GET    | `/api/product/{id}`                  | Get product by ID            |
| POST   | `/api/product`                       | Add a new product with image |
| PUT    | `/api/product/{id}`                  | Update a product             |
| DELETE | `/api/product/{id}`                  | Delete a product             |
| GET    | `/api/product/{productId}/image`     | Get product image            |
| GET    | `/api/products/search?keyword=value` | Search products              |


## Author

Created by Rishabh Verma.
