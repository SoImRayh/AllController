package com.controllers;

import com.dao.BlanquetaDao;
import com.dao.ProcessoDao;
import com.dao.ProdutoDao;
import com.model.Blanqueta;
import com.model.Processo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.Locale;

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
        ProcessoDao processoDao = new ProcessoDao();
        BlanquetaDao blanquetaDao = new BlanquetaDao();
        ProdutoDao produtoDao = new ProdutoDao();

        Blanqueta blanqueta = blanquetaDao.acharPorPosicao("a25").orElseThrow();

        System.out.println(blanqueta);


//        processo.setBlanqueta();
        processo.setProduto(produtoDao.pesquisarPorCodigo(fieldCodigo.getText().toUpperCase(Locale.ROOT)).orElseThrow());
        processo.setData(datapicker.getValue());
        System.out.println(processo);
        //processoDao.salvar(processo);//

    }

}

