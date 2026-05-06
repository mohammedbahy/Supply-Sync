package com.supplysync.repository;

import com.supplysync.models.Order;

import java.util.List;
import java.util.Optional;

public interface Storage {
    void saveOrder(Order order);

    Optional<Order> findOrderById(String id);

    List<Order> findAllOrders();
}
