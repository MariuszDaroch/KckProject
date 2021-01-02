package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    Alarm alarm =SecondStage.getAlarm();
    @FXML

    public TextField tf;
    public int windSpeed;
    public void setWindSpeed(){
        windSpeed=Integer.parseInt(tf.textProperty().toString());
        if(windSpeed >= 50) {
            alarm.status=true;

        }
        else if(alarm.status && windSpeed<50){
            alarm.status=false;
        }

    }



}
