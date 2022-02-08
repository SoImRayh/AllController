package com.controllers;

import com.dao.UsuarioDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerPaneUsuarioExcluir {

    @FXML
    private TextField fieldCPFExcluir;

    @FXML
    private void remover(ActionEvent e){
        UsuarioDao dao =  new UsuarioDao();
        dao.excluir(fieldCPFExcluir.getText());
    }

}
