
package com.controllers;


import com.dao.BlanquetaDao;
import com.dao.ProcessoDao;
import com.dao.ProdutoDao;
import com.example.Main.HelloApplication;
import com.model.*;
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
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControllerAdminWelcome implements Initializable {

    @FXML
    private TableView<ProcessoAbstrato> tableProcesso;

    @FXML
    private TableColumn<?,?> colDataProcesso;

    @FXML
    private TableColumn<?,?> colBlanquetaProcesso;

    @FXML
    private TableColumn<?,?> colCodProdProcesso;

    @FXML
    private TableColumn<?,?> colNomeProdProcesso;

    @FXML
    private Button buttonFiltrar;

    @FXML
    private TextField fieldFiltroProcesso;

    @FXML
    private ChoiceBox<?> choiceFilterProcesso;

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
        columnIdBlanqueta.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnFacaBlanqueta.setCellValueFactory(new PropertyValueFactory<>("faca"));
        columnLovalizacaoBlanqueta.setCellValueFactory(new PropertyValueFactory<>("localizacao"));
        columnMaquinaBlanqueta.setCellValueFactory(new PropertyValueFactory<>("Maquina"));
        columnReoeticoesBlanqueta.setCellValueFactory(new PropertyValueFactory<>("repeticoes"));
        columnObsBlanqueta.setCellValueFactory(new PropertyValueFactory<>("obs"));
        
        esconderlabels();
        paneProcessos.setVisible(false);
        paneProdutos.setVisible(false);
        paneBlanquetas.setVisible(true);

    }

    @FXML
    protected void processosTable(ActionEvent event) {
        colDataProcesso.setCellValueFactory(new PropertyValueFactory<>("data"));
        colBlanquetaProcesso.setCellValueFactory(new PropertyValueFactory<>("blanqueta"));
        colCodProdProcesso.setCellValueFactory(new PropertyValueFactory<>("codProduto"));
        colNomeProdProcesso.setCellValueFactory(new PropertyValueFactory<>("nomeProduto"));

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
    void editarEmpresa(ActionEvent event) { HelloApplication.panescontrol(4);}

    @FXML
    void editarProduto(ActionEvent event) {
        HelloApplication.panescontrol(7);
    }
    @FXML
    void removerBlanqueta(ActionEvent event) {
        HelloApplication.panescontrol(2);
    }

    @FXML
    void removerEmpresa(ActionEvent event) { HelloApplication.panescontrol(4);}

    @FXML
    void removerProcesso(ActionEvent event) { HelloApplication.panescontrol(10);}

    @FXML
    void removerProduto(ActionEvent event) {
        HelloApplication.panescontrol(6);
    }

    @FXML
    void removerUsuario(ActionEvent event) { HelloApplication.panescontrol(11);}

    private void esconderlabels() {

        labelBemvindo.setVisible(false);
        labelNomeUsuario.setVisible(false);

    }

    @FXML
    protected void filtrarProceso(ActionEvent e ){
        ProcessoDao dao = new ProcessoDao();
        List<Processo> lista= new ArrayList<>();
        if(fieldFiltroProcesso.getText().isBlank())
            lista = dao.filtros(1);

        ObservableList<ProcessoAbstrato> observableList= FXCollections.observableArrayList(ProcessoAbstrato.toProcessoAbstrato(lista));

        tableProcesso.setItems(observableList);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        paneBlanquetas.setVisible(false);
        paneProcessos.setVisible(false);
        paneProdutos.setVisible(false);

        anchorMenu.setVisible(false);

        //========================================

//        configuração para as colunas da table views
        colNomeProduto.setCellValueFactory(new PropertyValueFactory<>("name"));
        colEmpresaProduto.setCellValueFactory(new PropertyValueFactory<>("empresa"));
        colCodgoProduto.setCellValueFactory(new PropertyValueFactory<>("code"));



    }
}


