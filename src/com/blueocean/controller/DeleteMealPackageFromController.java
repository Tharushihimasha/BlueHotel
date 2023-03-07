package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteMealPackageFromController {
    public ImageView deletemealContext;
    public ComboBox cmbDeleteMeal;

    public void initialize() {
        cmbDeleteMeal.getItems().add("Local Meals");
        cmbDeleteMeal.getItems().add("Chinese Meals");
        cmbDeleteMeal.getItems().add("French Meals");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MealPackageFrom");
    }

    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) deletemealContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
