package com.example.tuitionmanagerfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TuitionManagerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}