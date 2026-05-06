package com.supplysync.presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class RegistrationController {
    @FXML
    private void createAccount(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/dashboard-view.fxml", "SupplySync Dashboard");
    }

    @FXML
    private void openLogin(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/login-view.fxml", "SupplySync Login");
    }
}
