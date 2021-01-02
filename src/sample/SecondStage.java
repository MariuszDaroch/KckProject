package sample;

import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SecondStage extends Stage {
    private static TurnOffAlarm tOffA;
    private static TurnOnAlarm tOnA;
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

    public static void setTOffA(TurnOffAlarm tOffA_val){
        tOffA=tOffA_val;
    }
    public static TurnOffAlarm getTOffA(){
        return SecondStage.tOffA;
    }

    public static void setTOnA(TurnOnAlarm tOnA_val){
        tOnA=tOnA_val;
    }
    public static TurnOnAlarm getTOnA(){
        return SecondStage.tOnA;
    }
}
