package com.example.tuitionmanagerfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TuitionManagerMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TuitionManagerMain.class.getResource("TuitionManagerFXML.fxml"));
        stage.setTitle("Tuition Manager");
        stage.setScene(new Scene(fxmlLoader.load(), 300, 275));
        stage.show();
    }

    public static void main(String[] args) {
            launch();
    }
}