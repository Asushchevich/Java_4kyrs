package com.example.idz_12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SecondController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField ConsumableCosts;

    @FXML
    private TextField Month;

    @FXML
    private Button sendButton;

    @FXML
    void initialize(ActionEvent event) {

        sendButton.setOnAction((actionEvent -> {
            String ConsumableCostsText = ConsumableCosts.getText();
            String MonthText = Month.getText();

            if(!ConsumableCostsText.equals("") && !MonthText.equals(""))
                secondpage(ConsumableCostsText, MonthText);
                else
                    System.out.println("Заполните поля");

        }));

        DatabaseHandler dbHandler = new DatabaseHandler();

        sendButton.setOnAction(actionEvent -> {
           dbHandler.collectsData(ConsumableCosts.getText(), Month.getText());
        });
    }

    private void secondpage(String consumableCostsText, String monthText) {
    }

    @FXML
    void initialize() {
//         DatabaseHandler dbHandler = new DatabaseHandler();
//
//        sendButton.setOnAction(actionEvent -> {
//            dbHandler.collectsData(ConsumableCosts.getText(), Mounth.getText());
//        });
    }

}

