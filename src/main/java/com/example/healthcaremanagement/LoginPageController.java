package com.example.healthcaremanagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class LoginPageController { // Ensure this matches the FXML's fx:controller
    @FXML
    private PasswordField password; // Changed to PasswordField

    @FXML
    private Button submit_login; // Changed to Button

    @FXML
    private TextField username;

    @FXML
    void LoginButton(ActionEvent event) {
        // Implement login logic here
        String user = username.getText();
        String pass = password.getText();
        // Add authentication logic
        System.out.println("Username: " + user);
        System.out.println("Password: " + pass);
    }
}
