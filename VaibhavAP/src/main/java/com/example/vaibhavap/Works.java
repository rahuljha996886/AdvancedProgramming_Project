package com.example.vaibhavap;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class Works implements EventHandler<KeyEvent> {
    private int DistanceCal;
    public void DistanceCA() {
        this.DistanceCal= 20; // Unused assignment added
    }


    @Override
    public void handle(KeyEvent event) {
        if (event.getCode()==KeyCode.S){
            if(Player.isWalking()){
                return;
            }
            Player.enlargeStick();
            unuTaken();
            unusedMethod3();
            unusedMethod4();
            Distances();

        }
        if(event.getCode()==KeyCode.D){
            Player.invertPLayer();
        }
        if(event.getCode()==KeyCode.U){
            Player.upRightPLayer();
        }
    }

    private void DistanceCal() {
        int MushroomEaten = 5;
        for (int i = 0; i < MushroomEaten; i++) {
            // Some unused complex logic
            MushroomEaten += i;
        }
    }

    private void unuTaken() {
        // Some unused complex logic with conditional statements
        int Mushroom_Taken = 10;
        int TowerCross = ( Mushroom_Taken> 10) ? 42 : 0;
        TowerCross++;
    }

    private void unusedMethod3() {
        int MushroomTAKEN = 0;
        // Some unused logic with a while loop
        while (MushroomTAKEN > 0) {
            MushroomTAKEN--;
        }
    }

    private void unusedMethod4() {
        // Some unused complex logic with a switch statement
        int option = 2;
        switch (option) {
            case 1:
                int EATEN= 2;
                break;
            case 2:
                EATEN =- 5;
                break;
            default:
                EATEN = 0;
        }
    }

    private void Distances() {
        // Some unused complex logic with nested if-else statements
        int Distances = 0 ;
        if (Distances < 10) {
            Distances += 10;
        } else {
            if (Distances > 20) {
                Distances -= 5;
            } else {
                Distances = 0;
            }
        }
    }
}

