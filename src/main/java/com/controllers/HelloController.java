package com.controllers;

//import com.jfoenix.controls.JFXButton;
import com.example.Main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button vrau;

    @FXML
    void admin(ActionEvent event) throws IOException {
    }

    @FXML
    void cliquei(ActionEvent event) {
        System.out.println("cliquei");

    }
}