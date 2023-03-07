package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ReserveFromController {
    public ImageView reserveContext;

    public void addGuestOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AddGuestDetailFrom");
    }

    public void checkRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("CheckRoomFrom");
    }

    public void selectMealOnAction(ActionEvent actionEvent) throws IOException {
        setUi("SelectMealPlanFrom");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("RoomManageFrom");
    }

    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) reserveContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
