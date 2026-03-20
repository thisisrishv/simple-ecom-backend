package com.rishv.ecom.proj.controller;

import com.rishv.ecom.proj.model.Product;
import com.rishv.ecom.proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;


    @RequestMapping("/")
    public String greet(){
        return "Hi there";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

}
