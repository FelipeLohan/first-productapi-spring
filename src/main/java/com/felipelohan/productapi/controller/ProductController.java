package com.felipelohan.productapi.controller;

import com.felipelohan.productapi.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public void save(Product prod){
        System.out.println("Saved new Product: " + prod.toString());
    }

}
