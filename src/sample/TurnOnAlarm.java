package sample;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class TurnOnAlarm implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SecondStage.setTOnA(this);
    }
}
