package com.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerUserWelcome implements Initializable {

    @FXML
    private Label labelBemvindo;

    @FXML
    private Label labelNomeUsuario;

    @FXML
    private Button buttonMain;

    @FXML
    private Pane paneBlanquetas;

    @FXML
    private Pane paneProcessos;

    @FXML
    private Pane paneProdutos;

    @FXML
    private Label userLogoLabel;

    @FXML
    private Label userTypeLabelLogo;

    @FXML
    private ImageView logo;

    @FXML
    void blanquetasTable(ActionEvent event) {
        esconderlabels();
        paneProcessos.setVisible(false);
        paneProdutos.setVisible(false);
        paneBlanquetas.setVisible(true);

    }

    @FXML
    void processosTable(ActionEvent event) {
        esconderlabels();
        paneBlanquetas.setVisible(false);
        paneProdutos.setVisible(false);
        paneProcessos.setVisible(true);
    }

    @FXML
    void produtosTable(ActionEvent event) {
        esconderlabels();
        paneProcessos.setVisible(false);
        paneBlanquetas.setVisible(false);
        paneProdutos.setVisible(true);
    }
    @FXML
    void screenMain(MouseEvent event) {
        paneBlanquetas.setVisible(false);
        paneProdutos.setVisible(false);
        paneProcessos.setVisible(false);
        labelBemvindo.setVisible(true);
        labelNomeUsuario.setVisible(true);
    }

    private void esconderlabels(){

        labelBemvindo.setVisible(false);
        labelNomeUsuario.setVisible(false);

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        paneBlanquetas.setVisible(false);
        paneProcessos.setVisible(false);
        paneProdutos.setVisible(false);
    }

}
