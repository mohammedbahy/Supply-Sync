package com.supplysync.services.inventory;

import com.supplysync.models.Order;

public interface InventoryService {
    void reserveInventory(Order order);
}
