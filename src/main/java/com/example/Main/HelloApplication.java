package com.example.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    {

    }
    @Override
    public void start(Stage stage) throws IOException {
        telainicial();
    }

    private void telainicial()throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("screen-Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        //scene.setFill(Color.TRANSPARENT);

        Image icon = new Image("icon.png");

        Stage stage = new Stage();

        stage.setTitle("AllController");
        stage.setScene(scene);
        stage.setResizable(false);
        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.getIcons().add(icon);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}