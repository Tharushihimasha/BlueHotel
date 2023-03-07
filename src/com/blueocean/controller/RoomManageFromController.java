package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomManageFromController {
    public ImageView roommanageContext;

    public void reserveOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReserveFrom");
    }

    public void markOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MaintenanceFrom");
    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) roommanageContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionistFrom");
    }
}
