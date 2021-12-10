package com.example.idz_12;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ServiceCostsButton;

    @FXML
    private Button dataRequest;

    @FXML
    private Button maintenanceSpendingButton;

    public void switchWindow(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/idz_12/app.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }
    public void switchWindow2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/idz_12/app_2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }
//    void initialize() {
//        ServiceCostsButton.setOnAction(actionEvent -> {
//            ServiceCostsButton.getScene().getWindow().hide();
//
//
////            FXMLLoader loader = new FXMLLoader();
////            loader.setLocation(getClass().getResource("com/example/idz_12/app.fxml"));
////
////            try {
////                loader.load();
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////
////            Parent root = loader.getRoot();
////            Stage stage = new Stage();
////            stage.setScene(new Scene(root));
////            stage.showAndWait();
////        });
////    }

}



