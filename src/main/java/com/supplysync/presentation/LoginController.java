package com.supplysync.presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LoginController {
    @FXML
    private void signIn(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/dashboard-view.fxml", "SupplySync Dashboard");
    }

    @FXML
    private void openRegistration(ActionEvent event) throws IOException {
        ScreenNavigator.open(event, "/com/supplysync/presentation/registration-view.fxml", "SupplySync Registration");
    }
}
