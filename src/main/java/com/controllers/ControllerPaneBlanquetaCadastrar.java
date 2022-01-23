package com.controllers;
import com.dao.BlanquetaDao;
import com.model.Blanqueta;
import com.model.Maquina;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.Locale;

public class ControllerPaneBlanquetaCadastrar {

    @FXML
    private TextField cadastroBlanquetaFaca;

    @FXML
    private TextField cadastroBlanquetaID;

    @FXML
    private TextField cadastroBlanquetaLocalizaçâo;

    @FXML
    private TextField cadastroBlanquetaMaquina;

    @FXML
    private TextField cadastroBlanquetaObs;

    @FXML
    private AnchorPane paneCadastrarBlanqueta;

    @FXML
    private void cadastrar(ActionEvent e)
    {
        BlanquetaDao blanquetaDao = new BlanquetaDao();
        Blanqueta b = new Blanqueta();

        b.setMaquina(Maquina.valueOf(cadastroBlanquetaMaquina.getText().toUpperCase(Locale.ROOT)));
        b.setLocalizacao(cadastroBlanquetaLocalizaçâo.getText().toUpperCase(Locale.ROOT));
        b.setFaca(cadastroBlanquetaFaca.getText().toUpperCase(Locale.ROOT));
        b.setObs(cadastroBlanquetaObs.getText());
        b.setRepeticoes(Integer.parseInt(cadastroBlanquetaID.getText()));

        blanquetaDao.salvar(b);
    }

}
