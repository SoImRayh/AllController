package com.controllers;
import com.dao.BlanquetaDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Locale;

public class ControllerPaneBlanquetaExcluir {
    @FXML
    private TextField blanquetaExcluirLocalização;

    @FXML
    private Button buttonBlanquetaExcluir;

    @FXML
    private void excluir(ActionEvent event){
        BlanquetaDao dao =  new BlanquetaDao();
        dao.deletar(blanquetaExcluirLocalização.getText().toUpperCase(Locale.ROOT));
    }

}
