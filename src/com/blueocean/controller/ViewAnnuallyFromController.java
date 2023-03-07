package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewAnnuallyFromController {
    public AnchorPane viewannuallyContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("IncomeReport");
    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) viewannuallyContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
