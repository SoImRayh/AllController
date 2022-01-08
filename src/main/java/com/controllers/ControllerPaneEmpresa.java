package com.controllers;

import com.dao.EmpresaDao;
import com.objects.Empresa;
import com.objects.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ControllerPaneEmpresa implements Initializable {
    @FXML
    private TableColumn<Integer, Empresa> idCollum;

    @FXML
    private TextField labelAdicionar;

    @FXML
    private TextField labelRemover;

    @FXML
    private TableColumn<String, Empresa> nomeCollum;

    @FXML
    private AnchorPane paneAdicionar;

    @FXML
    private AnchorPane paneListar;

    @FXML
    private AnchorPane paneRemover;

    @FXML
    private TableView<Empresa> tableEmpresa;

    @FXML
    protected void excluir(ActionEvent event) {
        EmpresaDao dao = new EmpresaDao();
        dao.excluir(Integer.parseInt(labelRemover.getText()));
        labelRemover.clear();

    }
    @FXML
    protected void paneListar(ActionEvent event){
        paneListar.setVisible(true);
        paneRemover.setVisible(false);
        paneAdicionar.setVisible(false);

        EmpresaDao dao =new EmpresaDao();
        List<Empresa> lista = new ArrayList<>(dao.pesquisarTodas());

        ObservableList observableList = FXCollections.observableArrayList(lista);

        tableEmpresa.setItems(observableList);


    }

    @FXML
    protected void paneAdicionar(ActionEvent event) {
        paneAdicionar.setVisible(true);
        paneRemover.setVisible(false);
        paneListar.setVisible(false);
    }

    @FXML
    void paneRemover(ActionEvent event) {
        paneRemover.setVisible(true);
        paneAdicionar.setVisible(false);
        paneListar.setVisible(false);

    }

    @FXML
    void salvar(ActionEvent event){
        Empresa empresa = new Empresa(labelAdicionar.getText());
        EmpresaDao dao = new EmpresaDao();
        dao.salvar(empresa);
        labelAdicionar.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        paneRemover.setVisible(false);
        paneAdicionar.setVisible(false);


        nomeCollum.setCellValueFactory(new PropertyValueFactory<String, Empresa>("nome"));
        idCollum.setCellValueFactory(new PropertyValueFactory<Integer, Empresa>("id"));

    }
}
