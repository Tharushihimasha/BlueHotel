package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewMonthlyFromController {
    public AnchorPane viewmonthContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("IncomeReport");
    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) viewmonthContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
