package com.tuyen.demo.ordermanagement.dao;

import com.tuyen.demo.ordermanagement.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
}
