package application;
//package editMenu;

import javafx.application.Application;


import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import java.io.FileInputStream;
import java.io.InputStream;


public class Main extends Application {
	
	static volatile ArrayList<Item> menu = new ArrayList<Item>();
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//Parent root1 = FXMLLoader.load(getClass().getResource("popup.fxml"));
		
		Parent root = FXMLLoader.load(getClass().getResource("Test.fxml"));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Test.fxml"));
		
		mainController controller = new mainController();
		
		loader.setController(controller);
		
		VBox start = loader.load();
    			    					
		primaryStage.setTitle("abc");
		
		//primaryStage.setScene(new Scene(root1, 1055, 755));
		primaryStage.setScene(new Scene(start, 1055, 755));
		primaryStage.show();
		
	}
	
	

}







