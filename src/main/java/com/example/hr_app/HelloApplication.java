package com.example.hr_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

import org.json.simple.parser.ParseException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("HR_Application");
        stage.setScene(scene);
        stage.show();


    }


    public static void main(String[] args) throws IOException, ParseException, NullPointerException {


        launch();


    }
}
