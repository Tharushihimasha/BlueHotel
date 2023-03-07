package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminFromController {
    public AnchorPane AdminFromContext;
    public Label wrongDetails;
    public Button admLogin;
    public PasswordField admPassword;
    public TextField adminUsername;


    public void AdminBackOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MainFrom");
    }

    public void AdminOnAction(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource()==admLogin) {
            String username = adminUsername.getText();
            String password = admPassword.getText();
            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
                System.out.println("login success");
                Stage window = (Stage) AdminFromContext.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HotelPackageFrom.fxml"))));


            } else if
            (adminUsername.getText().isEmpty() && admPassword.getText().isEmpty()) {
                wrongDetails.setText("Please enter your data.");


            } else {
                wrongDetails.setText("Wrong username or password!");
            }

        }

    }


    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) AdminFromContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
