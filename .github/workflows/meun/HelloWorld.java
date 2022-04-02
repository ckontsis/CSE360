package editMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class HelloWorld extends Application {
	
	static volatile ArrayList<Item> menu = new ArrayList<Item>();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
	
		
		//Parent root = FXMLLoader.load(getClass().getResource("Test.fxml"));

		//primaryStage.setTitle("abc");

		//primaryStage.setScene(new Scene(root1, 1055, 755));
//		primaryStage.setScene(new Scene(root, 1055, 755));
//		primaryStage.show();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Test.fxml"));
		
		mainController controller = new mainController();
		
		loader.setController(controller);
		
		AnchorPane start = loader.load();
		
		    			    					
		primaryStage.setTitle("abc");
		
		primaryStage.setScene(new Scene(start, 1055, 755));
		primaryStage.show();
		
	}
	
	

}
