package com.example.vaibhavap;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Ebbs {
    private AnchorPane anchorPane; // Added AnchorPane field

    private Rectangle base;
    private Label messageLabel;
    private Label yesLabel;
    private Label noLabel;
    private Button yesButton;
    private Button noButton;

    public Ebbs() {
        this.anchorPane = anchorPane;
        initializeUI();
        setupButtonActions();
    }

    private void initializeUI() {
        base = createRectangle();
        messageLabel = createMessageLabel();
        yesLabel = createLabel("Yes", 215, 490);
        noLabel = createLabel("No", 495, 490);
        yesButton = createButton(210);
        noButton = createButton(495);
    }

    private Rectangle createRectangle() {
        Rectangle rectangle = new Rectangle(145, 290, 410, 265);
        rectangle.setFill(Color.rgb(96, 196, 191));
        rectangle.setArcHeight(150);
        rectangle.setArcWidth(150);
        return rectangle;
    }

    private Label createMessageLabel() {
        Label label = new Label("Press yes for revive");
        label.setFont(javafx.scene.text.Font.font("System", 30));
        label.setTextFill(Color.WHITE);
        label.setPrefWidth(400);
        label.setPrefHeight(65);
        label.setLayoutX(145);
        label.setLayoutY(350);
        return label;
    }

    private Label createLabel(String text, double layoutX, double layoutY) {
        Label label = new Label(text);
        label.setFont(javafx.scene.text.Font.font("System", 20));
        label.setTextFill(Color.WHITE);
        label.setPrefWidth(50);
        label.setPrefHeight(25);
        label.setLayoutX(layoutX);
        label.setLayoutY(layoutY);
        return label;
    }

    private Button createButton(double layoutX) {
        Button button = new Button();
        button.setOpacity(0.33);
        button.setPrefWidth(50);
        button.setPrefHeight(25);
        button.setLayoutX(layoutX);
        return button;
    }

    private void setupButtonActions() {
        yesButton.setOnAction(event -> handleYesButtonAction());
        noButton.setOnAction(event -> handleNoButtonAction());
    }

    private void handleYesButtonAction() {
        removeEndPopUp();
        if (Player.getCherrycount() < 2) {
            Player.setCurrScore(0);
            Player.getScoreKeeper().updateScoreCount();
        } else {
            Player.setCherrycount(Player.getCherrycount() - 2);
            Player.getScoreKeeper().updateCherryCount();
        }
        Mapped.getInstance().beginMap(anchorPane);
    }

    private void handleNoButtonAction() {
        removeEndPopUp();
        Player.setCherrycount(0);
        Player.setCurrScore(0);
        Player.getScoreKeeper().updateCherryCount();
        Player.getScoreKeeper().updateScoreCount();
        Mapped.getInstance().beginMap(anchorPane);
    }

    public void removeEndPopUp() {
        anchorPane.getChildren().removeAll(base, messageLabel, yesLabel, noLabel, yesButton, noButton);
    }

    public void addEndPopUp(AnchorPane anchorPane) {
        this.anchorPane.getChildren().addAll(base, messageLabel, yesLabel, noLabel, yesButton, noButton);
    }
}
