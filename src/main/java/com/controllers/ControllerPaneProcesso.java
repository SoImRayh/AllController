package com.controllers;

import com.dao.BlanquetaDao;
import com.dao.ProdutoDao;
import com.model.Processo;
import com.model.Produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class ControllerPaneProcesso {

    @FXML
    private DatePicker datapicker;

    @FXML
    private TextField fieldBlanqueta;

    @FXML
    private TextField fieldCodigo;

    @FXML
    private AnchorPane paneCadastrar;

    @FXML
    protected void cadastrar(ActionEvent actionEvent){
        Processo processo = new Processo();
        ProcessoDao dao = new ProcessoDao();
        BlanquetaDao bdao = new BlanquetaDao();
        ProdutoDao pdao = new ProdutoDao();
        processo.setBlanqueta(bdao.acharPorPosicao(fieldBlanqueta.getText().toUpperCase(Locale.ROOT)));
        processo.setProduto(pdao.pesquisarPorCodigo(fieldCodigo.getText().toUpperCase(Locale.ROOT)));
        processo.setData(datapicker.getValue());
        dao.salvar(processo);

    }

}

