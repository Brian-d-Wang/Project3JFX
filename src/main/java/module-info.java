module com.example.project3jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project3jfx to javafx.fxml;
    exports com.example.project3jfx;
}