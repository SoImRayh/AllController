package com.example.Main;

import com.dao.BlanquetaDao;
import com.objects.Blanqueta;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stage;
    private static Scene loginScene,adminScene,paneBlanqueta,paneProcesso,paneProduto,paneUsuario;
    public static Image icon;



    @Override
    public void start(Stage primarystage) throws Exception {


        stage = primarystage;

        //--------------------------* criando um cache de telas *-----------------------------------

        //(login)
        Parent fxmllogin = FXMLLoader.load(HelloApplication.class.getResource("screen-Login.fxml"));
        loginScene= new Scene(fxmllogin);
        //loginScene.setFill(Color.TRANSPARENT);

        //(tela do administrador)
        Parent fxmladm =FXMLLoader.load(HelloApplication.class.getResource("screen-AdminWelcome.fxml"));
        adminScene = new Scene(fxmladm);

        //--------------------------* criando cache de panes de cadastro *----------------------------
        Parent fxmlBlanqueta = FXMLLoader.load(HelloApplication.class.getResource("pane-Blanqueta.fxml"));
        paneBlanqueta = new Scene(fxmlBlanqueta);

        Parent fxmlProcesso = FXMLLoader.load(HelloApplication.class.getResource("pane-Processo.fxml"));
        paneProcesso = new Scene(fxmlProcesso);

        Parent fxmlProdudo = FXMLLoader.load(HelloApplication.class.getResource("pane-Produto.fxml"));
        paneProduto = new Scene(fxmlProdudo);

        Parent fxmlUsuario = FXMLLoader.load(HelloApplication.class.getResource("pane-Usuario.fxml"));
        paneUsuario = new Scene(fxmlUsuario);

        //configurações do stage
        icon = new Image("icon.png");
        stage.setTitle("AllController");
        stage.setScene(loginScene);
        stage.setResizable(false);
        stage.initStyle(StageStyle.DECORATED);
        stage.getIcons().add(icon);
        stage.show();
    }

    public static void trocarTela(int tela){
        switch (tela){
            case 1 -> {
                stage.setScene(loginScene);
                }
            case 2-> {
                stage.setScene(adminScene);
                stage.setResizable(true);
                stage.setMaximized(true);
                }
        }
    }
    public static void panescontrol(int pane){
        Stage panes = new Stage();
        panes.getIcons().add(icon);
        switch (pane) {
            case 1 -> {
                panes.setScene(paneBlanqueta);
                panes.setTitle("gerenciar Blanquetas");
                panes.show();
            }
            case 2 -> {
                panes.setScene(paneProcesso);
                panes.setTitle("gerenciar Processos");
                panes.show();
            }
            case 3 -> {
                panes.setScene(paneProduto);
                panes.setTitle("gerenciar Produtos");
                panes.show();
            }
            case 4 -> {
                panes.setScene(paneUsuario);
                panes.setTitle("gerenciar Usuarios");
                panes.show();
            }
        }

    }
    public static void main(String[] args) {
        launch();
    }
}
