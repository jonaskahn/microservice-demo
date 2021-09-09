package com.tuyen.demo.ordermanagement.service;

import com.tuyen.demo.ordermanagement.dao.OrderRepo;
import com.tuyen.demo.ordermanagement.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepo repo;

    public OrderServiceImpl(OrderRepo repo) {
        this.repo = repo;
    }

    @Override
    public void add(Order order) {
        repo.save(order);
    }

    @Override
    public List<Order> find() {
        return repo.findAll();
    }
}
