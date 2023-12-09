module com.example.vaibhavap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vaibhavap to javafx.fxml;
    exports com.example.vaibhavap;
}