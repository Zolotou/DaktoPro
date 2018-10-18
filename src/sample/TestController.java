package sample;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TestController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button arcButton;

    @FXML
    private Button curlButton;

    @FXML
    private Label labelScore;

    @FXML
    private Button loopButton;

    @FXML
    private ImageView uzor;

    Image znak = new Image("/sample/zavitok.jpg");


    @FXML
    void initialize() {
        loopButton.setOnAction(event -> {
            Alert dialog = new Alert  (Alert.AlertType.INFORMATION);
            dialog.setTitle("Тип узора");
            dialog.setContentText("Выбранный тип узора оказался верным!");
            dialog.show();

            uzor.setImage(znak);
            labelScore.setText("2/20");


        });
    }

}
