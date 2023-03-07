package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class MaintenanceController {
    public ImageView mainatenceContext;
    public ComboBox cmbError;

    public void initialize() {
        cmbError.getItems().add("Electricity Supply");
        cmbError.getItems().add("Water Supply");
        cmbError.getItems().add("Internet Connection");
        cmbError.getItems().add("Cleaning");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("RoomManageFrom");
    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) mainatenceContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
