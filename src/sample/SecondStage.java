package sample;

import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SecondStage extends Stage {
    private static Alarm alarm;
    SecondStage(){
        Group sceneRoot = new Group();
        Scene scene = new Scene(sceneRoot, 600, 600, true, SceneAntialiasing.BALANCED);
        scene.setFill(Color.BLACK);
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setNearClip(0.1);
        camera.setFarClip(10000.0);
        camera.setTranslateZ(-10);
        scene.setCamera(camera);

        this.setTitle("Wind Turbine");
        this.setScene(scene);
        this.show();
    }

    public static void setAlarm(Alarm alarm_val){
        alarm=alarm_val;
    }
    public static Alarm getAlarm(){
        return SecondStage.alarm;
    }


}
