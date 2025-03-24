package com.felipelohan.productapi.controller;

import com.felipelohan.productapi.model.Product;
import com.felipelohan.productapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product prod){
        String id = UUID.randomUUID().toString();
        prod.setId(id);

        productRepository.save(prod);
        return prod;
    }

}
