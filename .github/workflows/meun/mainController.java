package editMenu;

import java.awt.Rectangle;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class mainController implements Initializable {	
	
	static volatile ArrayList<Item> menu = new ArrayList<Item>();
	editMenu currentMenu = new editMenu();

	
	
	//Initial start up for the menu
	public void addMenu() {

		menu.add(currentMenu.alaskanSalmon);
		menu.add(currentMenu.caesarSalad);
		menu.add(currentMenu.filetMignon);
		menu.add(currentMenu.lambChops);
		menu.add(currentMenu.mashedPotatoes);
		
	}

	//@FXML private Rectangle cosmRect;
    @FXML private SplitPane dividerCosm;
    @FXML private Button editMenuButton;
    @FXML private AnchorPane firstSideDiv;
    @FXML private Button logInButton;
    @FXML private GridPane mainScreen;
    @FXML private Label menuLabel;
    @FXML private AnchorPane secondDiv;
    @FXML private Button shoppingCartButton;
    @FXML private AnchorPane start;
    @FXML private VBox topFormat;
    

	public void loadData() {
	 
    	mainScreen.getChildren().clear();
    	
    	for(int i = 0; i < menu.size(); i++) {
    		
    		Label itemName = new Label(menu.get(i).getItemName());
    		Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
    		HBox formatter = new HBox(5);
    		
        	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
        	ImageView img = new ImageView();
    		
        	TextField inputGatherer = new TextField("0");
    		
    		if (i == 0) {
    			
    			formatter.getChildren().addAll(itemName, itemPrice);
    			mainScreen.add(formatter, 0, 0);
    			img.setImage(image);
    			img.setFitHeight(180);
    			img.setFitWidth(150);
    			//img.setPreserveRatio(true);
    			mainScreen.add(img, 0, 1);
    			mainScreen.add(inputGatherer, 0, 3);
    			mainScreen.add(shoppingCartButton, 4, 7);

    			System.out.println(inputGatherer.getText());
    			//mainScreen.add(inputGatherer, i, i);
    			//mainScreen.add(inputGatherer, i, i);
    			//mainScreen.add(inputGatherer, i, i);
    			//mainScreen.add(inputGatherer, i, i);
    			//mainScreen.add(inputGatherer, i, i);

    			//mainScreen.add(inputGatherer, i, i);

    		} else {
    			formatter.getChildren().addAll(itemName, itemPrice);
    			mainScreen.add(formatter, 1, 0);

    		}
    		
    	}
    	
				
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		addMenu();
		
		loadData();
		
		
		
		editMenu newMenu = new editMenu();

		editMenuButton.setOnAction(e -> {
			try {
				
				Stage secondStage = new Stage();
				secondStage.initModality(Modality.APPLICATION_MODAL);
				newMenu.start(secondStage);
				
				secondStage.setOnCloseRequest(e2 -> {
					ArrayList<Item> temp = new ArrayList<Item>(newMenu.getEditedMenu());
					menu.clear();
					menu = temp;
					editMenuButton.setDisable(true);
				});
				
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		RestaurantGUI test = new RestaurantGUI();
		
		shoppingCartButton.setOnAction(e -> {
			
			Stage secondStage = new Stage();
			test.start(secondStage);
			
			
		});
		
    
	}

}