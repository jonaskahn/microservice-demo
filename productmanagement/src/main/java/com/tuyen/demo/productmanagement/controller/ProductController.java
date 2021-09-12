package com.tuyen.demo.productmanagement.controller;

import com.tuyen.demo.productmanagement.domain.Product;
import com.tuyen.demo.productmanagement.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void create(@RequestBody Product product) {
        productService.add(product);
    }

    @GetMapping
    public List<Product> find() {
        return productService.find();
    }
}
