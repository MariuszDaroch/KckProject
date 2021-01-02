package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstStage extends Stage {

    FirstStage(Stage secondStage){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.setTitle("ControlPanel");
        this.setScene(new Scene(root, 600, 600));
        this.show();
    }



}
