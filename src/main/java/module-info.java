module com.example.healthcaremanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.healthcaremanagement to javafx.fxml;
    exports com.example.healthcaremanagement;
}