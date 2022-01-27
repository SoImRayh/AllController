
package com.controllers;


import com.dao.BlanquetaDao;
import com.dao.ProdutoDao;
import com.example.Main.HelloApplication;
import com.model.Blanqueta;
import com.model.Maquina;
import com.model.Produto;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerAdminWelcome implements Initializable {
    @FXML
    private ChoiceBox choiceBoxMaquina;

    @FXML
    private TableView<Blanqueta> tableBlanqueta;

    @FXML
    private Label labelTest;

    @FXML
    private TableColumn<Blanqueta, String> columnFacaBlanqueta;

    @FXML
    private TableColumn<Blanqueta, Integer> columnIdBlanqueta;

    @FXML
    private TableColumn<Blanqueta, String> columnLovalizacaoBlanqueta;

    @FXML
    private TableColumn<Blanqueta, Maquina> columnMaquinaBlanqueta;

    @FXML
    private TableColumn<Blanqueta, String> columnObsBlanqueta;

    @FXML
    private TableColumn<Blanqueta, Integer> columnReoeticoesBlanqueta;

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
    private Button blanquetasButton;

    @FXML
    private Button manutecaoButton;

    @FXML
    private Button processosButton;

    @FXML
    private Button produtosButton;

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
    protected void pesquisarBlanqueta(ActionEvent e){
        BlanquetaDao dao = new BlanquetaDao();
        List<Blanqueta> li = dao.todas();

        ObservableList<Blanqueta> list = FXCollections.observableArrayList(li);
        tableBlanqueta.setItems(list);
    }
    @FXML
    void abrirManutencao(ActionEvent event) {

        if(anchorMenu.isVisible())
        {

            // Transicao de Opacidade
            FadeTransition ft = new FadeTransition(Duration.seconds(0.3),anchorMenu);
            ft.setFromValue(0.0);
            ft.setToValue(1.0);
            ft.play();

            // Transicao de Translacao
            TranslateTransition closeSlide = new TranslateTransition(Duration.seconds(0.2), anchorMenu);

            closeSlide.setToX(-100);
            closeSlide.setNode(anchorMenu);
            closeSlide.play();

            anchorMenu.setVisible(false);

        }else
        {
            // Transicao de Opacidade
            FadeTransition ft = new FadeTransition(Duration.seconds(0.3),anchorMenu);
            ft.setFromValue(0.0);
            ft.setToValue(1.0);
            ft.play();

            // Transicao de Translacao
            TranslateTransition openSlide = new TranslateTransition(Duration.seconds(0.2),anchorMenu);
            openSlide.setToX(0);
            openSlide.setNode(anchorMenu);
            openSlide.play();

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
        HelloApplication.panescontrol(8);
    }

    @FXML
    void adicionarProduto(ActionEvent event) {
        HelloApplication.panescontrol(5);
    }

    @FXML
    void adicionarUsuario(ActionEvent event) {
        HelloApplication.panescontrol(9);
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
        HelloApplication.panescontrol(7);
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
        HelloApplication.panescontrol(6);
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

        columnIdBlanqueta.setCellValueFactory(new PropertyValueFactory<Blanqueta, Integer>("ID"));
        columnFacaBlanqueta.setCellValueFactory(new PropertyValueFactory<Blanqueta, String>("faca"));
        columnLovalizacaoBlanqueta.setCellValueFactory(new PropertyValueFactory<Blanqueta, String>("localização"));
        columnMaquinaBlanqueta.setCellValueFactory(new PropertyValueFactory<Blanqueta, Maquina>("Maquina"));
        columnReoeticoesBlanqueta.setCellValueFactory(new PropertyValueFactory<Blanqueta, Integer>("Repetições"));
        columnObsBlanqueta.setCellValueFactory(new PropertyValueFactory<Blanqueta, String>("Observações"));

    }
}


