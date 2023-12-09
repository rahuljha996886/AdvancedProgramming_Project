package com.example.vaibhavap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class FXMLLoaderHelper {
    public static Parent loadFXML(String fxmlFileName) {
        try {
            return new FXMLLoader(FXMLLoaderHelper.class.getResource(fxmlFileName)).load();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load FXML file: " + fxmlFileName, e);
        }
    }
}

