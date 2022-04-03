package sample.cse360project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import java.util.ArrayList;

import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import java.io.IOException;

public class RestaurantGUI extends Application {

	static volatile ArrayList<Item> menu = new ArrayList<Item>();
	static volatile ArrayList<Integer> quantity = new ArrayList<Integer>();
	
    @Override
    public void start(Stage primaryStage){
        try {
            
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("checkOutScreen.fxml"));
			
    		checkOut controller = new checkOut(this.menu, this.quantity);
    			
    		loader.setController(controller);
    			
    		AnchorPane anchor = loader.load();
    		Scene scene = new Scene(anchor, 668, 522);
    		
            primaryStage.setScene(scene);
            primaryStage.showAndWait();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void passCheckOut(ArrayList <Item> menu, ArrayList<Integer> array){
    	this.menu = menu;
    	this.quantity = array;
    }
}