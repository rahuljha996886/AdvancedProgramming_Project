package com.example.vaibhavap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class playController {
    @FXML
    private Button homeScreenSwitcher;
    public void switchToHomescreen(ActionEvent event){
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene menuScene = ((Node)event.getSource()).getScene();
        menuScene.setRoot(Drives.getMenuRoot());
        stage.setScene(menuScene);
        stage.show();
    }
}
