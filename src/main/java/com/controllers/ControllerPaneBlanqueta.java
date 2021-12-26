package com.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPaneBlanqueta implements Initializable {

    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Button buttonCadastrar;

    @FXML
    private TextField fieldMaquina;

    @FXML
    private TextField fieldObservacoes;

    @FXML
    private TextField fieldPosicao;

    @FXML
    private TextField fieldRepeticoes;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.getItems().add("CD");
        comboBox.getItems().add("KBA");
        comboBox.getItems().add("XL");
    }
}
