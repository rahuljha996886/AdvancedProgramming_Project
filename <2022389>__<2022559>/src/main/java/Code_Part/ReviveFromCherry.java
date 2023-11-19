package Code_Part;
public class ReviveFromCherry extends Player {
    // Attributes
    private int requiredCherryForRevive;
    private boolean isDie;

    // Constructor
    public ReviveFromCherry(int requiredCherry) {
        super(false, null); // Assuming you have a Player constructor that takes parameters
        this.requiredCherryForRevive = requiredCherry;
        this.isDie = false; // Assuming the default state is not dead
    }

    // Getter for isDie
    public boolean isDie() {
        return isDie;
    }

    // Methods
    public void revivePlayer() {

    }
}
