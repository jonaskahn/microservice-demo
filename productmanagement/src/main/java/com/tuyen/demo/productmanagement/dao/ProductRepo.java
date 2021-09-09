package com.tuyen.demo.productmanagement.dao;

import com.tuyen.demo.productmanagement.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
