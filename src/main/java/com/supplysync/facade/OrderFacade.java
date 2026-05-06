package com.supplysync.facade;

import com.supplysync.models.Order;
import com.supplysync.services.delivery.DeliveryService;
import com.supplysync.services.inventory.InventoryService;
import com.supplysync.services.notification.NotificationService;
import com.supplysync.services.order.OrderService;

public class OrderFacade {
    private final OrderService orderService;
    private final InventoryService inventoryService;
    private final DeliveryService deliveryService;
    private final NotificationService notificationService;

    public OrderFacade(
            OrderService orderService,
            InventoryService inventoryService,
            DeliveryService deliveryService,
            NotificationService notificationService
    ) {
        this.orderService = orderService;
        this.inventoryService = inventoryService;
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        orderService.createOrder(order);
        inventoryService.reserveInventory(order);
        deliveryService.schedule(order);
        notificationService.notifyOrderUpdate(order);
    }
}
