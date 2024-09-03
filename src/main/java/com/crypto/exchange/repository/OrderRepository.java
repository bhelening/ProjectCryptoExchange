package com.crypto.exchange.repository;

import com.crypto.exchange.model.Order;

public interface OrderRepository {
    void createOrder(Order order);
    Order getOrder(long id);
    void updateOrder(Order order);
    void deleteOrder(long id);
}