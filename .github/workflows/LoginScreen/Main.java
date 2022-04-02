package sample.cse360project;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.*;
import javafx.fxml.*;
import javafx.fxml.*;

import java.net.URL;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        URL url = getClass().getResource("hello-view.fxml");
        FXMLLoader loader = new FXMLLoader(url);

        System.out.print("here");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
