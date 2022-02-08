package com.controllers;

import com.dao.UsuarioDao;
import com.model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.Objects;

public class ControllerPaneUsuario {
    @FXML
    private CheckBox checkBoxAdmin;

    @FXML
    private TextField fieldCPF;

    @FXML
    private PasswordField fieldConfirmarSenha;

    @FXML
    private TextField fieldNome;

    @FXML
    private PasswordField fieldSenha;

    @FXML
    void cadastrar(ActionEvent event) {
        User user = new User();
        UsuarioDao userDao = new UsuarioDao();

        if(Objects.equals(fieldSenha.getText(), fieldConfirmarSenha.getText()))
            user.setSenha(fieldSenha.getText());
        else
            System.out.println("senhas nao iguais");
        user.setCpf((fieldCPF.getText()));
        user.setNome(fieldNome.getText());
        user.setAdminstrador(checkBoxAdmin.isSelected());

        userDao.cadastrar(user);
    }
}
