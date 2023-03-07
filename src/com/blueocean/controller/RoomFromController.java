package com.blueocean.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class RoomFromController {
    public ImageView roomfromContext;

    public void addNewRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("AddRoomFrom");
    }

    public void modifyRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("ModifyRoomFrom");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        setUi("HotelPackageFrom");
    }

    public void deleteRoomOnAction(ActionEvent actionEvent) throws IOException {
        setUi("DeleteRoomFrom");
    }

    public void setUi(String ui) throws IOException {
        Stage stage = (Stage) roomfromContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+ui+".fxml"))));
        stage.centerOnScreen();
    }
}
