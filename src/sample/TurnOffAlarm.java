package sample;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class TurnOffAlarm implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SecondStage.setTOffA(this);
    }
}
