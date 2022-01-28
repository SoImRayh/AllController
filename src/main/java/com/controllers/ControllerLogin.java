package com.controllers;

//import com.jfoenix.controls.JFXButton;

import com.example.Main.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerLogin {

    @FXML
    private Button buttonEntrar;

    @FXML
    private PasswordField labelSenha;

    @FXML
    private TextField labelUsuario;

    @FXML
    protected void fazerLogin(ActionEvent e){

        HelloApplication.trocarTela(2);
    }

}