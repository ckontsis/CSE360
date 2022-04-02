package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;

public class RestaurantGUI extends Application {

    @Override
    public void start(Stage primaryStage){
        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root, 300, 275);
            scene.getStylesheets().add(getClass().getResource("sample.fxml"));
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
