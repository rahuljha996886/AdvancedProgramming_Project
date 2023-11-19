package com.example.new5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    //ImageView is a Node used for painting images loaded with Images

    // Image = picture
    // ImageView = picture frame

    @FXML

    ImageView myImageView;


    Image myImage = new Image(getClass().getResourceAsStream("game1.jpeg"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }
}