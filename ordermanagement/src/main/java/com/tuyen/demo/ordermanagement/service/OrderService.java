package com.tuyen.demo.ordermanagement.service;

import com.tuyen.demo.ordermanagement.domain.Order;

import java.util.List;

public interface OrderService {

    void add(Order order);

    List<Order> find();
}
