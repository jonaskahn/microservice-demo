package com.tuyen.demo.productmanagement.service;

import com.tuyen.demo.productmanagement.dao.ProductRepo;
import com.tuyen.demo.productmanagement.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo repo;

    public ProductServiceImpl(ProductRepo repo) {
        this.repo = repo;
    }

    @Override
    public void add(Product product) {
        repo.save(product);
    }

    @Override
    public List<Product> find() {
        return repo.findAll();
    }
}
