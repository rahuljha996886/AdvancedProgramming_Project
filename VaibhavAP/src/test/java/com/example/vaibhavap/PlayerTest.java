package com.example.vaibhavap;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    public void testHandleKeyEvent() {
        KeyEvent eventS = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.S, false, false, false, false);
        KeyEvent eventD = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.D, false, false, false, false);
        KeyEvent eventU = new KeyEvent(KeyEvent.KEY_PRESSED, "", "", KeyCode.U, false, false, false, false);

        // Assuming isWalking is false initially
        assertFalse(Player.isWalking());

        Works works = new Works();
        works.handle(eventS);

        assertTrue(Player.isWalking());


        works.handle(eventD);

        works.handle(eventU);

    }
    @Test
    public void testMakeBridge() {
        AnchorPane anchorPane = new AnchorPane();
        Player.makeBridge(anchorPane);

        assertEquals(1, anchorPane.getChildren().size());
        assertTrue(anchorPane.getChildren().get(0) instanceof Line);
    }
    @Test
    public void testEnlargedStick() {
        // Assuming the initial y-coordinate of myBridge is 650
        double initialY = 650;
        Player.myBridge.setEndY(initialY);

        Player.enlargeStick();

        assertNotEquals(initialY - 5, Player.myBridge.getEndY());
    }

}