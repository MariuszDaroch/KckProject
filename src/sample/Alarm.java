package sample;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Alarm implements Initializable {
    public boolean status=false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SecondStage.setAlarm(this);
    }
}
