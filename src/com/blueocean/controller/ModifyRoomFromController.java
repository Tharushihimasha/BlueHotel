package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ModifyRoomFromController {
    public ImageView modifyroomContext;
    public ComboBox cmbModifyRoom;
    public ComboBox cmbRoomCap;

    public void initialize() {

        cmbModifyRoom .getItems().add("Single");
        cmbModifyRoom .getItems().add("Double");
        cmbModifyRoom.getItems().add("Triple");
        cmbModifyRoom .getItems().add("Quad");


        cmbRoomCap .getItems().add("AC Room");
        cmbRoomCap.getItems().add("Non AC Room");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("RoomFrom");
    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) modifyroomContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }

}
