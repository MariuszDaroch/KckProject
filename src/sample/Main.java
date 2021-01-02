package sample;

import javafx.application.Application;

import javafx.stage.Stage;


public class Main extends Application{

    public void start(Stage primaryStage) throws Exception{
       SecondStage secondStage= new SecondStage();
       new FirstStage(secondStage);

    }


    public static void main(String[] args) {
        launch(args);
    }


}
