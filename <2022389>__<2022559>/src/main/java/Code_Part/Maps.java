package Code_Part;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Maps  extends  GameManager{
    private static final int currentLevel =0 ;
    // Attributes
    // using multithreading we are trying to switch between maps for bonus parts
    private ExecutorService executorService;
    private String Map1;
    private String Map2;
    private String Map3;

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    // Constructor
    public Maps() {
        // Initialize the executor service with a fixed thread pool
        super(currentLevel);
        this.executorService = Executors.newFixedThreadPool(3);
        // Initialize maps (assuming default values or provide specific values)
        this.Map1 = "Map1";
        this.Map2 = "Map2";
        this.Map3 = "Map3";
    }

    // Method to start maps
    public void StartMaps() {
        // Assuming some logic to start maps

    }

    // Method to update maps
    public void Update() {
        // Assuming some logic to update maps

    }

    // Method to check the score to determine if maps should be switched
    public boolean checkScoreToSwitch() {
        // Assuming some logic to check the score
        // Example: return true if the score meets a certain condition, otherwise false
        return true;
    }

    // Method to switch maps
    public void switchMaps() {
        // Assuming some logic to switch maps
        System.out.println("Switching maps!");
    }


    public void shutdownExecutorService() {
        executorService.shutdown();
    }
}
