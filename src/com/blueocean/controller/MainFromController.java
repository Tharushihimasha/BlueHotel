package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainFromController {
    public AnchorPane MainFromContext;

    public void AdminOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminFrom");
    }

    public void ReceptionOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReceptionistFrom");

    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) MainFromContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
