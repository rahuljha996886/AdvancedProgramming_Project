module com.example.new5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.new5 to javafx.fxml;
    exports com.example.new5;
}