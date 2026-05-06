package com.supplysync.repository;

import com.supplysync.models.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryStorage implements Storage {
    private final List<Order> orders = new ArrayList<>();

    @Override
    public void saveOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Optional<Order> findOrderById(String id) {
        return orders.stream()
                .filter(order -> id.equals(order.getId()))
                .findFirst();
    }

    @Override
    public List<Order> findAllOrders() {
        return new ArrayList<>(orders);
    }
}
