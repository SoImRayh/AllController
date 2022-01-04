package com.controllers;

import com.dao.BlanquetaDao;
import com.objects.Blanqueta;
import com.objects.Maquina;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPaneBlanqueta implements Initializable {

    @FXML
    private TextField fieldFaca;

    @FXML
    private ChoiceBox<Maquina> choiseBox;
    private Maquina[] maquinas = {Maquina.CD,Maquina.XL,Maquina.KBA};

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
        choiseBox.getItems().addAll(maquinas);
    }
    @FXML
    private void inserir(){
        Blanqueta b = new Blanqueta();
        b.setLocalizacao(fieldPosicao.getText());
        b.setMaquina(choiseBox.getValue());
        b.setFaca((fieldFaca.getText()));
        b.setRepeticoes( Integer.parseInt(fieldRepeticoes.getText()));
    }
}
