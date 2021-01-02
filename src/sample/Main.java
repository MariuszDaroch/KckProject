package sample;

import javafx.application.Application;

import javafx.stage.Stage;


public class Main extends Application{

    public void start(Stage primaryStage) throws Exception{
       new SecondStage();
       new FirstStage();

    }


    public static void main(String[] args) {
        launch(args);
    }


}
