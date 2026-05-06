package com.supplysync.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private Marketer marketer;
    private final List<Product> products = new ArrayList<>();

    public Order() {
    }

    public Order(String id, Marketer marketer) {
        this.id = id;
        this.marketer = marketer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Marketer getMarketer() {
        return marketer;
    }

    public void setMarketer(Marketer marketer) {
        this.marketer = marketer;
    }

    public List<Product> getProducts() {
        return products;
    }
}
