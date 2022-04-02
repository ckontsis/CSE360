package RestaurantGUI;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;

import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

public class RestaurantGUI extends Application {

    @Override
    public void start(Stage primaryStage){
        try {
            //Scene scene = new Scene(root, 1055, 755);
            Parent root = FXMLLoader.load(getClass().getResource("CheckOutScreen.fxml"));
            primaryStage.setScene(new Scene(root, 1055, 755););
            primaryStage.show();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void passCheckOut(ArrayList <Item> menu, int[] array){
        displayItems(menu, array);
    }
}
