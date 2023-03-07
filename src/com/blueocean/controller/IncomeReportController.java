package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class IncomeReportController {

    public ImageView incomeReportsContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelPackageFrom");
    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) incomeReportsContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }

    public void viewAnnualyOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ViewAnnuallyFrom");
    }

    public void viewMonthlyOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ViewMonthlyFrom");
    }

}
