package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckRoomFromController {
    public ComboBox<String> cmbCheckRoom;
    public ImageView checkroomContext;

    public void initialize() {
        cmbCheckRoom.getItems().add("Available");
        cmbCheckRoom.getItems().add("Not Available");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReserveFrom");
    }

    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) cmbCheckRoom.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
