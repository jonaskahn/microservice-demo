package com.tuyen.demo.ordermanagement.controller;

import com.tuyen.demo.ordermanagement.domain.Order;
import com.tuyen.demo.ordermanagement.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public void create(@RequestBody Order order) {
        orderService.add(order);
    }

    @GetMapping
    public List<Order> find() {
        return orderService.find();
    }
}
