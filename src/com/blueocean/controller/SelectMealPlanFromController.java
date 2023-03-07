package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class SelectMealPlanFromController {
    public ComboBox cmbSelectMeal;
    public ComboBox cmbTime;
    public ImageView selectmealplanContext;

    public void initialize() {
        cmbSelectMeal.getItems().add("Local Meals");
        cmbSelectMeal.getItems().add("Chinese Meals");
        cmbSelectMeal.getItems().add("French Meals");

        cmbTime.getItems().add("Breakfast");
        cmbTime.getItems().add("Lunch");
        cmbTime.getItems().add("Dinner");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ReserveFrom");
    }

    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) selectmealplanContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
