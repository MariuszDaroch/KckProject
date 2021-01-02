package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {


    @FXML

    public TextField tf;
    Boolean windAlarm=false;
    public int windSpeed;
    public void setWindSpeed(){
        windSpeed=Integer.parseInt(tf.textProperty().toString());
        if(windSpeed >= 50) {
            windAlarm=true;
            SecondStage.getTOnA();
        }
        else if(windAlarm && windSpeed<50){
            SecondStage.getTOffA();
            windAlarm=false;
        }

    }



}
