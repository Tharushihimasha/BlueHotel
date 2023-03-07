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

public class ReceptionistFromController {
    public Label wrongDetails;
    public Button admLogin;
    public PasswordField admPassword;
    public TextField adminUserName;
    public AnchorPane receptionistloginContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MainFrom");
    }

    public void ReceLoginOnAction(ActionEvent actionEvent) throws IOException {
       if (actionEvent.getSource() == admLogin) {
            String username = adminUserName.getText();
            String password = admPassword.getText();
            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
                System.out.println("login success");
                Stage window = (Stage) receptionistloginContext.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomManageFrom.fxml"))));


            } else if
            (adminUserName.getText().isEmpty() && admPassword.getText().isEmpty()) {
                wrongDetails.setText("Please enter your data.");


            } else {
                wrongDetails.setText("Wrong username or password!");
            }

        }


    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) receptionistloginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}