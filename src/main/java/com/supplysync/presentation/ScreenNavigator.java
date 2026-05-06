package com.supplysync.presentation;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public final class ScreenNavigator {
    private static final double DEFAULT_WIDTH = 1200;
    private static final double DEFAULT_HEIGHT = 760;

    private ScreenNavigator() {
    }

    public static void open(ActionEvent event, String fxmlPath, String title) throws IOException {
        Parent root = FXMLLoader.load(ScreenNavigator.class.getResource(fxmlPath));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        double width = stage.getScene() != null ? stage.getScene().getWidth() : DEFAULT_WIDTH;
        double height = stage.getScene() != null ? stage.getScene().getHeight() : DEFAULT_HEIGHT;
        stage.setTitle(title);
        stage.setScene(new Scene(root, width, height));
        stage.setResizable(true);
        stage.show();
    }
}
