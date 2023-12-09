package com.example.vaibhavap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class menuController {
    @FXML
    private Button playScreenSwitcher;
    public void initialize(AnchorPane anchorPane){
        Mapped mapController = Mapped.getInstance();
        mapController.beginMap(anchorPane);
    }
    public void afterInitialize(){
        Player.rotateStick();
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
}
