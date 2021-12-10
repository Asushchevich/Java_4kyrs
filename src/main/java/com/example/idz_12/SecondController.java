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
    private TextField сonsumablesCosts;

    @FXML
    private TextField Month;

    @FXML
    private Button sendButton1;

    @FXML
    void initialize(ActionEvent event) {

//        sendButton1.setOnAction((actionEvent -> {
//            String сonsumableCostsText = сonsumablesCosts.getText();
//            String MonthText = Month.getText();
//
//            if(!сonsumableCostsText.equals("") && !MonthText.equals(""))
//                secondpage(сonsumableCostsText, MonthText);
//                else
//                    System.out.println("сonsumablesCosts.getText()");
//
//        }));

        DatabaseHandler dbHandler = new DatabaseHandler();

        sendButton1.setOnAction(actionEvent -> {
            try {

                dbHandler.signUpUser(сonsumablesCosts.getText(), Month.getText());
                System.out.println(сonsumablesCosts.getText());
                System.out.println(Month.getText());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

//    private void secondpage(String consumableCostsText, String monthText) {
//    }

    @FXML
    void initialize() {
//         DatabaseHandler dbHandler = new DatabaseHandler();
//
//        sendButton.setOnAction(actionEvent -> {
//            dbHandler.collectsData(ConsumableCosts.getText(), Mounth.getText());
//        });
    }

}

