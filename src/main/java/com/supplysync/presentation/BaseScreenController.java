package com.supplysync.presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public abstract class BaseScreenController {
    @FXML
    protected void openDashboard(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/dashboard-view.fxml", "SupplySync Dashboard");
    }

    @FXML
    protected void openProducts(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/products-management-view.fxml", "SupplySync Products Management");
    }

    @FXML
    protected void openOrders(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/orders-management-view.fxml", "SupplySync Orders Management");
    }

    @FXML
    protected void openMarketers(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/marketers-view.fxml", "SupplySync Marketers");
    }

    @FXML
    protected void openReports(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/notifications-view.fxml", "SupplySync Reports");
    }

    @FXML
    protected void openSupport(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/notifications-view.fxml", "SupplySync Support");
    }

    @FXML
    protected void openMarketingDashboard(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/marketing-dashboard-view.fxml", "SupplySync Marketing Dashboard");
    }

    @FXML
    protected void openProductCatalog(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/product-catalog-view.fxml", "SupplySync Product Catalog");
    }

    @FXML
    protected void openMyOrders(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/order-placement-view.fxml", "SupplySync My Orders");
    }

    @FXML
    protected void openSettings(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/registration-view.fxml", "SupplySync Settings");
    }

    @FXML
    protected void logout(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/login-view.fxml", "SupplySync Login");
    }
}
