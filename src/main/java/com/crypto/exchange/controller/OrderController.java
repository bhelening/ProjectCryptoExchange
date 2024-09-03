package com.crypto.exchange.controller;

import com.crypto.exchange.model.Order;
import com.crypto.exchange.repository.OrderRepository;

public class OrderController {
    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(Order order) {
        orderRepository.createOrder(order);
    }

    public Order getOrder(long id) {
        return orderRepository.getOrder(id);
    }

    public void updateOrder(Order order) {
        orderRepository.updateOrder(order);
    }

    public void deleteOrder(long id) {
        orderRepository.deleteOrder(id);
    }
}