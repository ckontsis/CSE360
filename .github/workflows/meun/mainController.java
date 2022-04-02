package application;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
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
import javafx.scene.text.TextAlignment;
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
    	mainScreen.setAlignment(Pos.CENTER);
    	
    	for(int i = 0; i < menu.size(); i++) { 
    		
    		Label itemName = new Label(menu.get(i).getItemName());
    		Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
    		HBox formatter = new HBox(5); 
    		
        	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
        	ImageView img = new ImageView();
    		
        	TextField inputGatherer = new TextField("0");
    		
    		if (i == 0) {  
    			
    			Label itemDescription = new Label(menu.get(0).getItemDescription());
    			formatter.getChildren().addAll(itemName, itemPrice);
    			itemDescription.setWrapText(true);
    			itemDescription.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter, 0, 0);
    			img.setImage(image); 
    			img.setFitHeight(180);
    			img.setFitWidth(150);

    			mainScreen.add(img, 0, 1);
    			mainScreen.add(itemDescription, 0 ,2);
    			inputGatherer.setMaxWidth(50);
    			mainScreen.add(inputGatherer, 0, 3);
    			mainScreen.setHalignment(inputGatherer, HPos.CENTER);
    			
    			
    			

    			System.out.println(inputGatherer.getText());
    			
    		} else {
   

    		}
    		
    	}
    	
    	for(int i = 0; i < menu.size(); i++) { 
    		
    		Label itemName = new Label(menu.get(i).getItemName());
    		Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
    		HBox formatter = new HBox(5); 
    		
        	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
        	ImageView img = new ImageView();
    		
        	TextField inputGatherer = new TextField("0");
    		
    		if (i == 1) { 
    			
    			Label itemDescription = new Label(menu.get(0).getItemDescription());
    			formatter.getChildren().addAll(itemName, itemPrice);
    			itemDescription.setWrapText(true);
    			itemDescription.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter, 1, 0);
    			img.setImage(image); 
    			img.setFitHeight(180);
    			img.setFitWidth(150);
   
    			mainScreen.add(img, 1, 1);
    			mainScreen.add(itemDescription, 1 ,2);
    			inputGatherer.setMaxWidth(50);
    			mainScreen.add(inputGatherer, 1, 3);
    			mainScreen.setHalignment(inputGatherer, HPos.CENTER);
    			
    			
    	

    			System.out.println(inputGatherer.getText());
    		
    		} else {


    		}
    		
    	}
    	
    	for(int i = 0; i < menu.size(); i++) { 
    		
    		Label itemName = new Label(menu.get(i).getItemName());
    		Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
    		HBox formatter = new HBox(5); 
    		
        	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
        	ImageView img = new ImageView();
    		
        	TextField inputGatherer = new TextField("0");
    		
    		if (i == 2) {  
    			
    			Label itemDescription = new Label(menu.get(0).getItemDescription());
    			formatter.getChildren().addAll(itemName, itemPrice);
    			itemDescription.setWrapText(true);
    			itemDescription.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter, 2, 0);
    			img.setImage(image); 
    			img.setFitHeight(180);
    			img.setFitWidth(150);

    			mainScreen.add(img, 2, 1);
    			mainScreen.add(itemDescription, 2 ,2);
    			inputGatherer.setMaxWidth(50);
    			mainScreen.add(inputGatherer, 2, 3);
    			mainScreen.setHalignment(inputGatherer, HPos.CENTER);
    			
    			

    			System.out.println(inputGatherer.getText());
    	

    		} else {

    		}
    		
    	}


	for(int i = 0; i < menu.size(); i++) { 
	
	Label itemName = new Label(menu.get(i).getItemName());
	Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
	HBox formatter = new HBox(5); 
	
	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
	ImageView img = new ImageView();
	
	TextField inputGatherer = new TextField("0");
	
	if (i == 3) {  
		
		Label itemDescription = new Label(menu.get(0).getItemDescription());
		formatter.getChildren().addAll(itemName, itemPrice);
		itemDescription.setWrapText(true);
		itemDescription.setTextAlignment(TextAlignment.CENTER);
		mainScreen.add(formatter, 3, 0);
		img.setImage(image); 
		img.setFitHeight(180);
		img.setFitWidth(150);

		mainScreen.add(img, 3, 1);
		mainScreen.add(itemDescription, 3 ,2);
		inputGatherer.setMaxWidth(50);
		mainScreen.add(inputGatherer, 3, 3);
		mainScreen.setHalignment(inputGatherer, HPos.CENTER);
		
		
	

		System.out.println(inputGatherer.getText());

	} else {

	}
	
}



	for(int i = 0; i < menu.size(); i++) { 
	
	Label itemName = new Label(menu.get(i).getItemName());
	Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
	HBox formatter = new HBox(5); 
	
	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
	ImageView img = new ImageView();
	
	TextField inputGatherer = new TextField("0");
	
	if (i == 4) { 
		
		Label itemDescription = new Label(menu.get(0).getItemDescription());
		formatter.getChildren().addAll(itemName, itemPrice);
		itemDescription.setWrapText(true);
		itemDescription.setTextAlignment(TextAlignment.CENTER);
		mainScreen.add(formatter, 4, 0);
		img.setImage(image); 
		img.setFitHeight(180);
		img.setFitWidth(150);

		mainScreen.add(img, 4, 1);
		mainScreen.add(itemDescription, 4 ,2);
		inputGatherer.setMaxWidth(50);
		mainScreen.add(inputGatherer, 4, 3);
		mainScreen.setHalignment(inputGatherer, HPos.CENTER);
		
		

		System.out.println(inputGatherer.getText());


	} else {


	}
	
}



	for(int i = 0; i < menu.size(); i++) { 
	
	Label itemName = new Label(menu.get(i).getItemName());
	Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
	HBox formatter = new HBox(5); 
	
	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
	ImageView img = new ImageView();
	
	TextField inputGatherer = new TextField("0");
	
	if (i == 5) { 
		
		Label itemDescription = new Label(menu.get(0).getItemDescription());
		formatter.getChildren().addAll(itemName, itemPrice);
		itemDescription.setWrapText(true);
		itemDescription.setTextAlignment(TextAlignment.CENTER);
		mainScreen.add(formatter, 0, 5);
		img.setImage(image); 
		img.setFitHeight(180);
		img.setFitWidth(150);

		mainScreen.add(img, 0, 6);
		mainScreen.add(itemDescription, 0 ,7);
		inputGatherer.setMaxWidth(50);
		mainScreen.add(inputGatherer, 0, 8);
		mainScreen.setHalignment(inputGatherer, HPos.CENTER);
		


		System.out.println(inputGatherer.getText());


	} else {


	}
	
}



	for(int i = 0; i < menu.size(); i++) { 
	
	Label itemName = new Label(menu.get(i).getItemName());
	Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
	HBox formatter = new HBox(5); 
	
	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
	ImageView img = new ImageView();
	
	TextField inputGatherer = new TextField("0");
	
	if (i == 6) {  //final to 7
		
		Label itemDescription = new Label(menu.get(0).getItemDescription());
		formatter.getChildren().addAll(itemName, itemPrice);
		itemDescription.setWrapText(true);
		itemDescription.setTextAlignment(TextAlignment.CENTER);
		mainScreen.add(formatter, 1, 5);
		img.setImage(image); //copy and paste
		img.setFitHeight(180);
		img.setFitWidth(150);

		mainScreen.add(img, 1, 6);
		mainScreen.add(itemDescription, 1 ,7);
		inputGatherer.setMaxWidth(50);
		mainScreen.add(inputGatherer, 1, 8);
		mainScreen.setHalignment(inputGatherer, HPos.CENTER);
		
		
		


		System.out.println(inputGatherer.getText());

	} else {


	}
	
}



	for(int i = 0; i < menu.size(); i++) { //copy start here and new name ex: itemname1
	
	Label itemName = new Label(menu.get(i).getItemName());
	Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
	HBox formatter = new HBox(5); //name and price into HBOX
	
	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
	ImageView img = new ImageView();
	
	TextField inputGatherer = new TextField("0");
	
	if (i == 7) {  //final to 7
		
		Label itemDescription = new Label(menu.get(0).getItemDescription());
		formatter.getChildren().addAll(itemName, itemPrice);
		itemDescription.setWrapText(true);
		itemDescription.setTextAlignment(TextAlignment.CENTER);
		mainScreen.add(formatter, 2, 5);
		img.setImage(image); //copy and paste
		img.setFitHeight(180);
		img.setFitWidth(150);
		//img.setPreserveRatio(true);
		mainScreen.add(img, 2, 6);
		mainScreen.add(itemDescription, 2 ,7);
		inputGatherer.setMaxWidth(50);
		mainScreen.add(inputGatherer, 2, 8);
		mainScreen.setHalignment(inputGatherer, HPos.CENTER);
		
		

		System.out.println(inputGatherer.getText());
		

	} else {
	
	}
	
}


	for(int i = 0; i < menu.size(); i++) { //copy start here and new name ex: itemname1
	
	Label itemName = new Label(menu.get(i).getItemName());
	Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
	HBox formatter = new HBox(5); //name and price into HBOX
	
	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
	ImageView img = new ImageView();
	
	TextField inputGatherer = new TextField("0");
	
	if (i == 8) {  //final to 7
		
		Label itemDescription = new Label(menu.get(0).getItemDescription());
		formatter.getChildren().addAll(itemName, itemPrice);
		itemDescription.setWrapText(true);
		itemDescription.setTextAlignment(TextAlignment.CENTER);
		mainScreen.add(formatter, 3, 5);
		img.setImage(image); //copy and paste
		img.setFitHeight(180);
		img.setFitWidth(150);
		//img.setPreserveRatio(true);
		mainScreen.add(img, 3, 6);
		mainScreen.add(itemDescription, 3 ,7);
		inputGatherer.setMaxWidth(50);
		mainScreen.add(inputGatherer, 3, 8);
		mainScreen.setHalignment(inputGatherer, HPos.CENTER);
		
		

		System.out.println(inputGatherer.getText());

	} else {
		

	}
	
}
	for(int i = 0; i < menu.size(); i++) { //copy start here and new name ex: itemname1
		
	Label itemName = new Label(menu.get(i).getItemName());
	Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
	HBox formatter = new HBox(5); //name and price into HBOX
	
	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
	ImageView img = new ImageView();
	
	TextField inputGatherer = new TextField("0");
	
	if (i == 9) {  //final to 7
		
		Label itemDescription = new Label(menu.get(0).getItemDescription());
		formatter.getChildren().addAll(itemName, itemPrice);
		itemDescription.setWrapText(true);
		itemDescription.setTextAlignment(TextAlignment.CENTER);
		mainScreen.add(formatter, 4, 5);
		img.setImage(image); //copy and paste
		img.setFitHeight(180);
		img.setFitWidth(150);
		//img.setPreserveRatio(true);
		mainScreen.add(img, 4, 6);
		mainScreen.add(itemDescription, 4 ,7);
		inputGatherer.setMaxWidth(50);
		mainScreen.add(inputGatherer, 4, 8);
		mainScreen.setHalignment(inputGatherer, HPos.CENTER);
		
		

		System.out.println(inputGatherer.getText());

	} else {
		

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
		
		
		/*RestaurantGUI test = new RestaurantGUI();
		
		shoppingCartButton.setOnAction(e -> {
			
			Stage secondStage = new Stage();
			test.start(secondStage);
			
			
		});*/
		
    
	}

}