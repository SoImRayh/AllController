
package com.controllers;

import com.dao.BlanquetaDao;
import com.dao.ProdutoDao;
import com.example.Main.HelloApplication;
import com.model.Blanqueta;
import com.model.Maquina;
import com.model.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerAdminWelcome implements Initializable {

    @FXML
    private TableView<Blanqueta> tableBlanqueta;

    @FXML
    private Label labelTest;

    @FXML
    private TableColumn<String, Blanqueta> columnFacaBlanqueta;

    @FXML
    private TableColumn<Integer, Blanqueta> columnIdBlanqueta;

    @FXML
    private TableColumn<String, Blanqueta> columnLovalizacaoBlanqueta;

    @FXML
    private TableColumn<Maquina, Blanqueta> columnMaquinaBlanqueta;

    @FXML
    private TableColumn<String, Blanqueta> columnObsBlanqueta;

    @FXML
    private TableColumn<Integer, Blanqueta> columnReoeticoesBlanqueta;

    @FXML
    private TableView<Produto> tableProduto;

    @FXML
    private TableColumn<Produto, String> colCodgoProduto;

    @FXML
    private TableColumn<Produto, String> colEmpresaProduto;

    @FXML
    private TableColumn<Produto, String> colNomeProduto;

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
    private AnchorPane anchorMenu;

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

        BlanquetaDao dao = new BlanquetaDao();
        List<Blanqueta> lista;
        lista = dao.todas();
        System.out.println(lista);
        ObservableList<Blanqueta> observableList = FXCollections.observableArrayList(lista);

        tableBlanqueta.setItems(observableList);

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
    protected void cadastroUsuario(ActionEvent event) {
        HelloApplication.panescontrol(4);
    }

    @FXML
    protected void cadastrarEmpresa(ActionEvent event) {
        HelloApplication.panescontrol(5);
    }

    @FXML
    protected void pesquisar(ActionEvent e) {
        ProdutoDao dao = new ProdutoDao();
        List<Produto> li = dao.todos();
        ObservableList<Produto> list = FXCollections.observableArrayList(li);
        tableProduto.setItems(list);
    }
    @FXML
    void abrirManutencao(ActionEvent event) {
        if(anchorMenu.isVisible() == true)
        {
            anchorMenu.setVisible(false);
        }else
        {
            anchorMenu.setVisible(true);
        }
    }

    @FXML
    void adicionarBlanqueta(ActionEvent event) {
        HelloApplication.panescontrol(1);

    }

    @FXML
    void adicionarEmpresa(ActionEvent event) {
        HelloApplication.panescontrol(4);
    }

    @FXML
    void adicionarProcesso(ActionEvent event) {

    }

    @FXML
    void adicionarProduto(ActionEvent event) {

    }

    @FXML
    void adicionarUsuario(ActionEvent event) {

    }
    @FXML
    void editarBlanqueta(ActionEvent event) {
        HelloApplication.panescontrol(3);
    }

    @FXML
    void editarEmpresa(ActionEvent event) {

    }

    @FXML
    void editarProduto(ActionEvent event) {

    }
    @FXML
    void removerBlanqueta(ActionEvent event) {
        HelloApplication.panescontrol(2);
    }

    @FXML
    void removerEmpresa(ActionEvent event) {

    }

    @FXML
    void removerProcesso(ActionEvent event) {

    }

    @FXML
    void removerProduto(ActionEvent event) {

    }

    @FXML
    void removerUsuario(ActionEvent event) {

    }

    private void esconderlabels() {

        labelBemvindo.setVisible(false);
        labelNomeUsuario.setVisible(false);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        paneBlanquetas.setVisible(false);
        paneProcessos.setVisible(false);
        paneProdutos.setVisible(false);

        anchorMenu.setVisible(false);

        //========================================

//        configuração para as colunas da table views
        colNomeProduto.setCellValueFactory(new PropertyValueFactory<Produto, String>("name"));
        colEmpresaProduto.setCellValueFactory(new PropertyValueFactory<Produto, String>("empresa"));
        colCodgoProduto.setCellValueFactory(new PropertyValueFactory<Produto, String>("code"));

        columnFacaBlanqueta.setCellValueFactory(new PropertyValueFactory<String, Blanqueta>("faca"));
        columnIdBlanqueta.setCellValueFactory(new PropertyValueFactory<Integer, Blanqueta>("ID"));
        columnLovalizacaoBlanqueta.setCellValueFactory(new PropertyValueFactory<String, Blanqueta>("localização"));
        columnMaquinaBlanqueta.setCellValueFactory(new PropertyValueFactory<Maquina, Blanqueta>("Maquina"));
        columnReoeticoesBlanqueta.setCellValueFactory(new PropertyValueFactory<Integer, Blanqueta>("Repetições"));
        columnObsBlanqueta.setCellValueFactory(new PropertyValueFactory<String, Blanqueta>("Observações"));

    }
}


