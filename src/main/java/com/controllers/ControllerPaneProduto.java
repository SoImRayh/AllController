package com.controllers;

import com.dao.ProdutoDao;
import com.objects.Produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ControllerPaneProduto {

    @FXML
    private Button buttonAtualizar;

    @FXML
    private Button buttonCadastrar;

    @FXML
    private Button buttonExclrui;

    @FXML
    private TextField fieldCliente;

    @FXML
    private TextField fieldCodAtualizar;

    @FXML
    private TextField fieldCodAtualizarFinal;

    @FXML
    private TextField fieldCodExcluir;

    @FXML
    private TextField fieldCodigo;

    @FXML
    private TextField fieldEmpresaAtualizarFinal;

    @FXML
    private TextField fieldNome;

    @FXML
    private TextField fieldNomeAtualizarFinal;

    @FXML
    private Label labelCodExcluir;

    @FXML
    private Label labelCodExcluir1;

    @FXML
    private Label labelEmpresaExcluir;

    @FXML
    private Label labelEmpresaExcluir1;

    @FXML
    private Label labelNomeExcluir;

    @FXML
    private Label labelNomeExcluir1;

    @FXML
    void atualizarPane(ActionEvent event) {

    }

    @FXML
    void atualizarProduto(ActionEvent event) {

    }

    @FXML
    void cadastrar(){
        ProdutoDao dao = new ProdutoDao();
        if (fieldNome.getText() != "" && fieldCodigo.getText() != "" && fieldCliente.getText() !=""){
            Produto p = new Produto(fieldNome.getText(), fieldCliente.getText(), fieldCodigo.getText());
            dao.salvar(p);
        }else{
            System.out.println("preecha todos os campos corretamente");
        }
    }

    @FXML
    void excluirPane(ActionEvent event) {

    }

    @FXML
    void excluirProduto(ActionEvent event) {
        ProdutoDao dao = new ProdutoDao();
        Produto produto = new Produto();
        Optional<Produto> p;

        p = dao.pesquisarPorCodigo(fieldCodExcluir.getText());

        dao.deletar(produto);
    }

}
