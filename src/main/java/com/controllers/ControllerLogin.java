package com.controllers;

//import com.jfoenix.controls.JFXButton;
import com.example.Main.HelloApplication;
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
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;
import java.util.Objects;

public class ControllerLogin {

    @FXML
    private Button buttonEntrar;

    @FXML
    private PasswordField labelSenha;

    @FXML
    private TextField labelUsuario;

    @FXML
    protected void fazerLogin(ActionEvent e){
        try{

        }catch(sqlException erro) {

        }
        HelloApplication.trocarTela(2);
    }

}