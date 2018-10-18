package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button infoButton;

    @FXML
    private Button testButton;





    @FXML
    void initialize() {
        testButton.setOnAction(event -> {
            testButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("test.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        infoButton.setOnAction(event -> {
            Alert dialog = new Alert  (Alert.AlertType.INFORMATION);
            dialog.setTitle("О программе");
            dialog.setContentText("Обучающая программа выполненнная в форме теста по определению правильного типа папиллярного узора");
            dialog.show();

        });


    }
}
