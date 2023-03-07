package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HotelPackageFromController {
    public ImageView hotelPackageContext;

    public void roomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("RoomFrom");
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MealPackageFrom");
    }

    public void incomeReportsOnAction(ActionEvent actionEvent) throws IOException {
        setUi("IncomeReport");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AdminFrom");
    }
    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) hotelPackageContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
