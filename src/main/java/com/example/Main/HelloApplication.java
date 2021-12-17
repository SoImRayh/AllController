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
    public void telawelcome()throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("screen-AdminWelcome.fxml"));
        String vu = "blabdjkaf";
        System.out.println("cliquei");

        Stage teste = new Stage();
        Group bla = new Group();
        Scene telinha = new Scene(loader.load());


        teste.setScene(telinha);
        teste.setTitle(vu);
        teste.show();

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