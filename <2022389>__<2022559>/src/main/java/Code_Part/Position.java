package Code_Part;
import java.io.Serializable;

public class Position implements Serializable {
    private int x;
    private int y;
    private int delta_x;
    private int delta_y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        this.delta_x = 0;
        this.delta_y = 0;
    }

    // Method to move the position upside
    public void moveUpside() {
        delta_y = -1;
    }

    // Method to move the position downside
    public void moveDownside() {
        delta_y = 1;
    }

    // Method to update the position based on delta values
    public void updatePosition() {

    }

    // Method to check collision (placeholder implementation)
    public boolean checkCollision() {
        // Placeholder implementation, actual collision logic needs to be implemented.
        return true;
    }

    // Getters and setters for x, y, delta_x, and delta_y
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDelta_x() {
        return delta_x;
    }

    public void setDelta_x(int delta_x) {
        this.delta_x = delta_x;
    }

    public int getDelta_y() {
        return delta_y;
    }

    public void setDelta_y(int delta_y) {

    }
}
