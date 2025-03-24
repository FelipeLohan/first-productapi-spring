package com.felipelohan.productapi.controller;

import com.felipelohan.productapi.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @PostMapping
    public Product save(@RequestBody Product prod){
        System.out.println("Saved new Product: " + prod.toString());
        return prod;
    }

}
