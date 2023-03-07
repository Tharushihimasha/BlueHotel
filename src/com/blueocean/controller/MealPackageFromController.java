package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class MealPackageFromController {
    public ImageView mealPackageContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelPackageFrom");
        }

    public void modifyOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ModifyMealPackageFrom");
    }

    public void deleteMealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DeleteMealPackageFrom");
    }

    public void addMealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AddNewMealPackageFrom");
    }

    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) mealPackageContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
