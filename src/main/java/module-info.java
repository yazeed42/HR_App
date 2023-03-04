module com.example.hr_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    requires jackson.databind;
    requires jackson.core;


    opens com.example.hr_app to javafx.fxml;
    exports com.example.hr_app;
}