package com.controllers;

//import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ControllerLogin {
    private Stage stage1;
    private Scene scene;
    private Parent root;

    @FXML
    private Button buttonEntrar;

    @FXML
    private PasswordField labelSenha;

    @FXML
    private TextField labelUsuario;

    @FXML
    public void fazerLogin(ActionEvent e)throws IOException{
        try {
            if(labelSenha.getText() != null && labelUsuario.getText() != null){
                stage1 = new Stage();
                scene = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("screen-AdminWelcome.fxml")));
                stage1.setScene(scene);
                stage1.show();
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}