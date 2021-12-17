package com.example.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    {

    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("screen-Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("AllController");
        stage.setScene(scene);
        stage.show();
    }

    public void cadastroUser(){

    }
    public static void main(String[] args) {
        launch();
    }

    public void ConectarBD(){

    }
    public void DesconectarBD(){

    }
}