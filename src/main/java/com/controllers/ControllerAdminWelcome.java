
package com.controllers;

import com.dao.ProdutoDao;
import com.example.Main.HelloApplication;
import com.objects.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerAdminWelcome implements Initializable {


    @FXML
    private TableView<Produto> tableProduto;

    @FXML
    private TableColumn<Produto , String> colCodgoProduto;

    @FXML
    private TableColumn<Produto , String> colEmpresaProduto;

    @FXML
    private TableColumn<Produto , String> colNomeProduto;

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
    protected void blanquetasTable(ActionEvent event) {
        esconderlabels();
        paneProcessos.setVisible(false);
        paneProdutos.setVisible(false);
        paneBlanquetas.setVisible(true);

    }

    @FXML
    protected void processosTable(ActionEvent event) {
        esconderlabels();
        paneBlanquetas.setVisible(false);
        paneProdutos.setVisible(false);
        paneProcessos.setVisible(true);
    }

    @FXML
    protected void produtosTable(ActionEvent event) {
        esconderlabels();
        paneProcessos.setVisible(false);
        paneBlanquetas.setVisible(false);
        paneProdutos.setVisible(true);
    }
    @FXML
    protected void screenMain(MouseEvent event) {
        paneBlanquetas.setVisible(false);
        paneProdutos.setVisible(false);
        paneProcessos.setVisible(false);
        labelBemvindo.setVisible(true);
        labelNomeUsuario.setVisible(true);
    }

    @FXML
    protected void cadastroBlanquetas(ActionEvent event) {
        HelloApplication.panescontrol(1);
    }

    @FXML
    protected void cadastroProcessos(ActionEvent event) {
        HelloApplication.panescontrol(2);
    }

    @FXML
    protected void cadastroProdutos(ActionEvent event) {
        HelloApplication.panescontrol(3);
    }
    @FXML
    protected void cadastroUsuario(ActionEvent event){
        HelloApplication.panescontrol(4);
    }
    @FXML
    protected void pesquisar(ActionEvent e){
        ProdutoDao dao = new ProdutoDao();
        List<Produto> li = dao.todos();
        ObservableList<Produto> list = FXCollections.observableArrayList(li);
        System.out.println(li);
        tableProduto.setItems(list);
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
        //========================================


        colNomeProduto.setCellValueFactory(new PropertyValueFactory<Produto, String>("name"));
        colEmpresaProduto.setCellValueFactory(new PropertyValueFactory<Produto, String>("empresa"));
        colCodgoProduto.setCellValueFactory(new PropertyValueFactory<Produto, String>("code"));

    }
    }



