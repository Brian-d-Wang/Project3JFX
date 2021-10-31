module com.example.project3jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens TuitionManagerFX to javafx.fxml;
    exports TuitionManagerFX;
}