package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class AddGuestDetailFromController {
    public ComboBox cmbaddGuestDetail;
    public ImageView addguestContext;

    public void initialize(){
        cmbaddGuestDetail.getItems().add("Single");
        cmbaddGuestDetail.getItems().add("Double");
        cmbaddGuestDetail.getItems().add("Triple");
        cmbaddGuestDetail.getItems().add("Quad");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReserveFrom");
    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) addguestContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
