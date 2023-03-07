package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class AddNewMealPackageFromController {
    public ImageView addnewmealContext;
    public ComboBox cmbAddNewMeal;

    public void initialize() {
        cmbAddNewMeal.getItems().add("Local Meals");
        cmbAddNewMeal.getItems().add("Chinese Meals");
        cmbAddNewMeal.getItems().add("French Meals");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MealPackageFrom");
    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) addnewmealContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
