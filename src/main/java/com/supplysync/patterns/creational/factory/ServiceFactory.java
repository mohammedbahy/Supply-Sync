package com.supplysync.patterns.creational.factory;

import com.supplysync.services.delivery.DefaultDeliveryService;
import com.supplysync.services.delivery.DeliveryService;
import com.supplysync.services.inventory.DefaultInventoryService;
import com.supplysync.services.inventory.InventoryService;
import com.supplysync.services.notification.DefaultNotificationService;
import com.supplysync.services.notification.NotificationService;
import com.supplysync.services.order.DefaultOrderService;
import com.supplysync.services.order.OrderService;

public final class ServiceFactory {
    private ServiceFactory() {
    }

    public static OrderService createOrderService() {
        return new DefaultOrderService();
    }

    public static InventoryService createInventoryService() {
        return new DefaultInventoryService();
    }

    public static DeliveryService createDeliveryService() {
        return new DefaultDeliveryService();
    }

    public static NotificationService createNotificationService() {
        return new DefaultNotificationService();
    }
}
