package sample.cse360project;
 
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
 
public class editMenu extends Application {
   
	static volatile ArrayList<Item> menu = new ArrayList<Item>();
	
	Food alaskanSalmon = new Food("Alaskan Salmon", 6.99, "Ingredients: Freshly caught Alaskan Salmon fillet, olive oil, garlic, fresh chopped parsley and thyme, lemon, salt and fresh ground black pepper.", 
		296, "Main", "alasa.jpg");

	Food caesarSalad = new Food("Caesar Salad", 3.99, "Ingredients: French Baguette, olive oil, garlic, parmesan cheese, romaine, Ceasar Dressing (garlic, Worcestershire, lemon, red wine vinegar), salt and freshly grounded pepper.",
		289, "Appetizers", "caesar.jpg");

	Food filetMignon = new Food("Filet Mignon", 20.99, "Ingredients: 16oz USDA prime Filet Mignon, kosher salt, freshly grounded pepper, in-house made butter, garlic, rosemary and thyme.",
		789, "Main", "filet.jpg");

	Food lambChops = new Food("Lamb Chops", 10.99, "Ingredients: USDA Grass-Fed lamb loin chops, kosher salt, freshly grounded pepper, in-house made butter,garlic and thyme.", 
		265, "Main", "Lamb_Chops.jpg");

	Food mashedPotatoes = new Food("Mashed Potatoes", 4.99, "Ingredients: freshly picked Yukon Gold potatoes, garlic, sea salt, in-house made butter, whole milk, chives and freshly grounded black pepper.",
		214, "Side", "mashed.jpg");
	
	
	public static void main(String[] args) {
		launch(args);		
	}
    	
    	@Override
    	public void start(Stage primaryStage) throws Exception {
    		
    		menu.add(alaskanSalmon);
    		menu.add(caesarSalad);
    		menu.add(filetMignon);
    		menu.add(lambChops);
    		menu.add(mashedPotatoes);	
    		
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("GUI.fxml"));
    			
    		editController controller = new editController(menu);
    			
    		loader.setController(controller);
    			
    		AnchorPane anchor = loader.load();
    		Scene scene = new Scene(anchor, 1055, 755);
    			    			
    		primaryStage.setTitle("Edit Menu");

    		primaryStage.setScene(scene);
    		primaryStage.showAndWait();
    			
    		this.menu = controller.getNewMenu();
    			
    		
    		}
    	
    	public ArrayList<Item> getEditedMenu(){
    		return this.menu;
    	}
    	
}