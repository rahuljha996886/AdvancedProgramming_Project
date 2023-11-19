package Code_Part;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player extends GameManager implements   Serializable {
    private static  int currentLevel = 0;
    private int coins;
    private boolean respawned = false;
    private boolean isEliminated = false;
    private String game;
    private int totalPoints;
    private int totalCherry;
    private double stickLength;
    private boolean isRevived;
    private String move;

    // High score list
    private List<Integer> highscore;

    // Constructor
    public Player(boolean respawned, Object o) {
        super(currentLevel); // Assuming you have a GameManager constructor that takes parameters
        this.coins = 0;
        this.respawned = respawned;
        this.isEliminated = false;
        this.totalPoints = 0;
        this.totalCherry = 0;
        this.stickLength = 0.0;
        this.isRevived = false;
        this.move = "";
        this.highscore = new ArrayList<>(); // Initialize with an empty mutable list
    }

    // Getter for location
    public int getLocation() {
        // Implementation details for getting player's location.
        return 0; // Placeholder, replace with actual implementation
    }

    // Getter for stick length
    public double getStickLength() {
        // Implementation details for getting stick length.
        return stickLength;
    }

    // Getter for total points
    public int getTotalPoints() {
        // Implementation details for getting total points.
        return totalPoints;
    }

    // Getter for total cherry
    public int getTotalCherry() {
        // Implementation details for getting total cherry.
        return totalCherry;
    }

    // Method to initialize stick
    private void initializeStick() {

    }

    // Method to move upside
    public void moveUpside() {
        // Implementation details for moving upside.
        System.out.println("Moving upside");
    }

    // Method to move downside
    private void moveDownside() {
        // Implementation details for moving downside.
        System.out.println("Moving downside");
    }

    // Method to try to revive
    public boolean tryToRevive() {
        // Implementation details for trying to revive.

        return false;
    }

    // Method to update cherry count
    public void updateCherry() {
        // Implementation details for updating cherry count.

    }

    // Method to update total points
    public void updateTotalPoints() {

    }

    // Method to update high score
    public void updateHighScore() {

    }

    // Method to sort the high score
    public void sortScore() {
        // Implementation details for sorting the high score.

    }
}
