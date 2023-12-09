package com.example.vaibhavap;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.vaibhavap.FXMLLoaderHelper.loadFXML;

public class Drives extends Application {
    private static final String MENU_FXML = "menuScreen.fxml";
    private static final String PLAY_FXML = "playScreen.fxml";
    private static Parent menuRoot;
    private static Parent playRoot;

    private  void initialize(AnchorPane anchorPane){
        Mapped mapController = Mapped.getInstance();
        mapController.beginMap(anchorPane);
    }
    private void afterInitialize(){
        Player.rotateStick();
    }
    static {
        menuRoot = loadFXML(MENU_FXML);
        playRoot = loadFXML(PLAY_FXML);
    }



    static {
        try {
            playRoot = new FXMLLoader(Drives.class.getResource("playScreen.fxml")).load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Parent getMenuRoot() {
        return menuRoot;
    }

    public static Parent getPlayRoot() {
        return playRoot;
    }
    public static AnchorPane Playscreen(){
        Parent root = getPlayRoot();
        return (AnchorPane) root;
    }


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Drives.class.getResource("menuScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPlayscreen(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene playscene = ((Node) event.getSource()).getScene();
        playscene.setRoot(Drives.getPlayRoot());
        playscene.setOnKeyPressed(new Works());
        playscene.setOnKeyReleased(e->{if(e.getCode()== KeyCode.S){afterInitialize();}});
        stage.setScene(playscene);
        initialize(Drives.Playscreen());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
