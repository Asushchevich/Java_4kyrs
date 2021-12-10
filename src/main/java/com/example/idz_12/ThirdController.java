package com.example.idz_12;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ThirdController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField GasolineSpending;

    @FXML
    private Button SendButton;

    @FXML
    private TextField month;

    @FXML
    void initialize(ActionEvent event) {

        SendButton.setOnAction((actionEvent -> {
            String GasolineSpendingText = GasolineSpending.getText();
            String monthText = month.getText();

            if(!GasolineSpendingText.equals("") && !monthText.equals(""))
                thridpage(GasolineSpendingText, monthText);
            else
                System.out.println("Заполните поля");

        }));

    }

    private void thridpage(String gasolineSpendingText, String monthText) {
    }

    @FXML
    void initialize() {
     
    }

}

    
