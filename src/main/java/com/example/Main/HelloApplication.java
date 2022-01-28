package com.example.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HelloApplication extends Application {

    private static Stage stage;
    private static Scene    loginScene,welcomescene,
                            paneAdicionarBlanqueta,paneExcluirBlanqueta,paneAtualizarBlanqueta,
                            paneAdicionarProcesso,paneExcluirProcesso,
                            paneAdicionarProduto,paneExcluirProduto,paneAtualizarProduto,
                            paneAdicionarUsuario,paneExcluirUsuario,paneAtualizarUsuario,
                            paneAdicionarEmpresa,paneExcluirEmpresa,paneAtualizarEmpresa;
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
        welcomescene = new Scene(fxmladm);

        //--------------------------* criando cache dos paineis de manutenção *----------------------------
        //blanqueta
        Parent fxmlAdicionarBlanqueta = FXMLLoader.load(HelloApplication.class.getResource("pane-BlanquetaCadastrar.fxml"));
        Parent fxmlexcluirBlanqueta = FXMLLoader.load(HelloApplication.class.getResource("pane-BlanquetaExcluir.fxml"));
        Parent fxmlAtualizarBlanqueta = FXMLLoader.load(HelloApplication.class.getResource("pane-BlanquetaAtualizar.fxml"));
        paneAdicionarBlanqueta = new Scene(fxmlAdicionarBlanqueta);
        paneExcluirBlanqueta = new Scene(fxmlexcluirBlanqueta);
        paneAtualizarBlanqueta =  new Scene(fxmlAtualizarBlanqueta);


        //Processo
        Parent fxmlAdicionarProcesso = FXMLLoader.load(HelloApplication.class.getResource("pane-Processo.fxml"));
        paneAdicionarProcesso = new Scene(fxmlAdicionarProcesso);

        Parent fxmlExcluirProcesso = FXMLLoader.load(HelloApplication.class.getResource("pane-Processo-Excluir.fxml"));
        paneExcluirProcesso = new Scene(fxmlExcluirProcesso);

        //Produto
        Parent fxmlAdicionarProdudo = FXMLLoader.load(HelloApplication.class.getResource("pane-Produto.fxml"));
        paneAdicionarProduto = new Scene(fxmlAdicionarProdudo);

        Parent fxmlAtualizarProduto = FXMLLoader.load(HelloApplication.class.getResource("Pane-Produto-Atualizar.fxml"));
        paneAtualizarProduto = new Scene(fxmlAtualizarProduto);

        Parent fxmlExcluirProduto = FXMLLoader.load(HelloApplication.class.getResource("pane-Produto-Excluir.fxml"));
        paneExcluirProduto = new Scene(fxmlExcluirProduto);



        //Usuario
        Parent fxmlAdicionarUsuario = FXMLLoader.load(HelloApplication.class.getResource("pane-Usuario.fxml"));
        Parent fxmlExcluirUsuario = FXMLLoader.load(HelloApplication.class.getResource("pane-Usuario-Excluir.fxml"));
        Parent fxmlAtualizarUsuario = FXMLLoader.load(HelloApplication.class.getResource("pane-Usuario.fxml"));
        paneAdicionarUsuario = new Scene(fxmlAdicionarUsuario);
        paneExcluirUsuario = new Scene(fxmlExcluirUsuario);
        paneAtualizarUsuario = new Scene(fxmlAtualizarUsuario);


        //Empresa
        Parent fxmlAdicionarEmpresa = FXMLLoader.load(HelloApplication.class.getResource("pane-Empresa.fxml"));

        paneAdicionarEmpresa = new Scene(fxmlAdicionarEmpresa);



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
                stage.setScene(welcomescene);
                stage.setResizable(true);
                stage.setMaximized(true);
                }
        }
    }
    public static void panescontrol(int pane){
        Stage panes = new Stage();
        panes.getIcons().add(icon);

        switch (pane)
        {
            case 1:
            {
                panes.setScene(paneAdicionarBlanqueta);
                panes.show();
                break;
            }
            case 2:
            {
                panes.setScene(paneExcluirBlanqueta);
                panes.show();
                break;
            }
            case 3:
            {
                panes.setScene(paneAtualizarBlanqueta);
                panes.show();
                break;
            }
            case 4:
            {
                panes.setScene(paneAdicionarEmpresa);
                panes.show();
                break;
            }
            case 5:
            {
                panes.setScene(paneAdicionarProduto);
                panes.show();
                break;
            }
            case 6:
            {
                panes.setScene(paneExcluirProduto);
                panes.show();
                break;
            }
            case 7:
            {
                panes.setScene(paneAtualizarProduto);
                panes.show();
                break;
            }
            case 8:
            {
                panes.setScene(paneAdicionarProcesso);
                panes.show();
                break;
            }
            case 9:
            {
                panes.setScene(paneAdicionarUsuario);
                panes.show();
                break;
            }
            case 10:
            {
                panes.setScene(paneExcluirProcesso);
                panes.show();
                break;
            }
            case 11:
            {
                panes.setScene(paneExcluirUsuario);
                panes.show();
                break;
            }

        }

    }
    public static void main(String[] args) {
        launch();
    }
}
