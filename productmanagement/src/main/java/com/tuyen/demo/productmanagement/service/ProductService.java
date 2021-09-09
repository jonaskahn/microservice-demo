package com.tuyen.demo.productmanagement.service;

import com.tuyen.demo.productmanagement.domain.Product;

import java.util.List;

public interface ProductService {

    void add(Product order);

    List<Product> find();
}
