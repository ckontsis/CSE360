package sample.cse360project;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
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
	public volatile String username, address, userType;
    
	TextField inputGatherer = new TextField("0");
	TextField inputGatherer1 = new TextField("0");
	TextField inputGatherer2 = new TextField("0");
	TextField inputGatherer3 = new TextField("0");
	TextField inputGatherer4 = new TextField("0");
	TextField inputGatherer5 = new TextField("0");
	TextField inputGatherer6 = new TextField("0");
	TextField inputGatherer7 = new TextField("0");
	TextField inputGatherer8 = new TextField("0");
	TextField inputGatherer9 = new TextField("0");

    
    public void loadData() {
   	 
    	mainScreen.getChildren().clear();
    	
    	for(int i = 0; i < menu.size(); i++) { 
    		
    		Label itemName = new Label(menu.get(i).getItemName());
    		Label itemPrice = new Label("$" + menu.get(i).getItemPrice());
    		HBox formatter = new HBox(5); 
    		
        	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
        	ImageView img = new ImageView();
    		
    		
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
    			
    		    			
    		} else if (i == 1){
   
    			Label itemName1 = new Label(menu.get(i).getItemName());
        		Label itemPrice1 = new Label("$" + menu.get(i).getItemPrice());
        		HBox formatter1 = new HBox(5); 
        		
            	javafx.scene.image.Image image1 = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
            	ImageView img1 = new ImageView();
        		
            	
            	Label itemDescription1 = new Label(menu.get(i).getItemDescription());
    			formatter1.getChildren().addAll(itemName1, itemPrice1);
    			itemDescription1.setWrapText(true);
    			itemDescription1.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter1, 1, 0);
    			img1.setImage(image1); 
    			img1.setFitHeight(180);
    			img1.setFitWidth(150);
   
    			mainScreen.add(img1, 1, 1);
    			mainScreen.add(itemDescription1, 1 ,2);
    			inputGatherer1.setMaxWidth(50);
    			mainScreen.add(inputGatherer1, 1, 3);
    			mainScreen.setHalignment(inputGatherer1, HPos.CENTER);
    			

    		} else if (i == 2) {
    			
    			Label itemName2 = new Label(menu.get(i).getItemName());
        		Label itemPrice2 = new Label("$" + menu.get(i).getItemPrice());
        		HBox formatter2 = new HBox(5); 
        		
            	javafx.scene.image.Image image2 = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
            	ImageView img2 = new ImageView();
        		
            	
            	Label itemDescription2 = new Label(menu.get(i).getItemDescription());
    			formatter2.getChildren().addAll(itemName2, itemPrice2);
    			itemDescription2.setWrapText(true);
    			itemDescription2.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter2, 2, 0);
    			img2.setImage(image2); 
    			img2.setFitHeight(180);
    			img2.setFitWidth(150);

    			mainScreen.add(img2, 2, 1);
    			mainScreen.add(itemDescription2, 2 ,2);
    			inputGatherer2.setMaxWidth(50);
    			mainScreen.add(inputGatherer2, 2, 3);
    			mainScreen.setHalignment(inputGatherer2, HPos.CENTER);
    			
    		} else if (i == 3) {
    			
    			Label itemName3 = new Label(menu.get(i).getItemName());
    			Label itemPrice3 = new Label("$" + menu.get(i).getItemPrice());
    			HBox formatter3 = new HBox(5); 
    			
    			javafx.scene.image.Image image3 = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
    			ImageView img3 = new ImageView();
    			
    			
    			Label itemDescription3 = new Label(menu.get(i).getItemDescription());
    			formatter3.getChildren().addAll(itemName3, itemPrice3);
    			itemDescription3.setWrapText(true);
    			itemDescription3.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter3, 3, 0);
    			img3.setImage(image3); 
    			img3.setFitHeight(180);
    			img3.setFitWidth(150);

    			mainScreen.add(img3, 3, 1);
    			mainScreen.add(itemDescription3, 3 ,2);
    			inputGatherer3.setMaxWidth(50);
    			mainScreen.add(inputGatherer3, 3, 3);
    			mainScreen.setHalignment(inputGatherer3, HPos.CENTER);
    			
    		} else if (i == 4) {
    			
    			Label itemName4 = new Label(menu.get(i).getItemName());
    			Label itemPrice4 = new Label("$" + menu.get(i).getItemPrice());
    			HBox formatter4 = new HBox(5); 
    			
    			javafx.scene.image.Image image4 = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
    			ImageView img4 = new ImageView();
    			
    			
    			Label itemDescription4 = new Label(menu.get(i).getItemDescription());
    			formatter4.getChildren().addAll(itemName4, itemPrice4);
    			itemDescription4.setWrapText(true);
    			itemDescription4.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter4, 4, 0);
    			img4.setImage(image4); 
    			img4.setFitHeight(180);
    			img4.setFitWidth(150);

    			mainScreen.add(img4, 4, 1);
    			mainScreen.add(itemDescription4, 4 ,2);
    			inputGatherer4.setMaxWidth(50);
    			mainScreen.add(inputGatherer4, 4, 3);
    			mainScreen.setHalignment(inputGatherer4, HPos.CENTER);
    			
    			
    		} else if(i == 5) {
    			
    			Label itemName5 = new Label(menu.get(i).getItemName());
    			Label itemPrice5 = new Label("$" + menu.get(i).getItemPrice());
    			HBox formatter5 = new HBox(5); 
    			
    			javafx.scene.image.Image image5 = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
    			ImageView img5 = new ImageView();
    			
    			
    			Label itemDescription5 = new Label(menu.get(i).getItemDescription());
    			formatter5.getChildren().addAll(itemName5, itemPrice5);
    			itemDescription5.setWrapText(true);
    			itemDescription5.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter5, 0, 5);
    			img5.setImage(image5); 
    			img5.setFitHeight(180);
    			img5.setFitWidth(150);

    			mainScreen.add(img5, 0, 6);
    			mainScreen.add(itemDescription5, 0 ,7);
    			inputGatherer5.setMaxWidth(50);
    			mainScreen.add(inputGatherer5, 0, 8);
    			mainScreen.setHalignment(inputGatherer5, HPos.CENTER);
    			
    		} else if (i == 6) {
    			
    			Label itemName6 = new Label(menu.get(i).getItemName());
    			Label itemPrice6 = new Label("$" + menu.get(i).getItemPrice());
    			HBox formatter6 = new HBox(5); 
    			
    			javafx.scene.image.Image image6 = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
    			ImageView img6 = new ImageView();
    			
    			
    			Label itemDescription6 = new Label(menu.get(i).getItemDescription());
    			formatter6.getChildren().addAll(itemName6, itemPrice6);
    			itemDescription6.setWrapText(true);
    			itemDescription6.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter6, 1, 5);
    			img6.setImage(image6); //copy and paste
    			img6.setFitHeight(180);
    			img6.setFitWidth(150);

    			mainScreen.add(img6, 1, 6);
    			mainScreen.add(itemDescription6, 1 ,7);
    			inputGatherer6.setMaxWidth(50);
    			mainScreen.add(inputGatherer6, 1, 8);
    			mainScreen.setHalignment(inputGatherer6, HPos.CENTER);
    			
    		} else if (i == 7) {
    			
    			Label itemName7 = new Label(menu.get(i).getItemName());
    			Label itemPrice7 = new Label("$" + menu.get(i).getItemPrice());
    			HBox formatter7 = new HBox(5); //name and price into HBOX
    			
    			javafx.scene.image.Image image7 = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
    			ImageView img7 = new ImageView();
    			
    			
    			Label itemDescription7 = new Label(menu.get(i).getItemDescription());
    			formatter7.getChildren().addAll(itemName7, itemPrice7);
    			itemDescription7.setWrapText(true);
    			itemDescription7.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter7, 2, 5);
    			img7.setImage(image7); //copy and paste
    			img7.setFitHeight(180);
    			img7.setFitWidth(150);

    			mainScreen.add(img7, 2, 6);
    			mainScreen.add(itemDescription7, 2 ,7);
    			inputGatherer7.setMaxWidth(50);
    			mainScreen.add(inputGatherer7, 2, 8);
    			mainScreen.setHalignment(inputGatherer7, HPos.CENTER);
    			
    		} else if (i == 8) {
    			
    			Label itemName8 = new Label(menu.get(i).getItemName());
    			Label itemPrice8 = new Label("$" + menu.get(i).getItemPrice());
    			HBox formatter8 = new HBox(5); //name and price into HBOX
    			
    			javafx.scene.image.Image image8 = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
    			ImageView img8 = new ImageView();
    			
    			
    			Label itemDescription8 = new Label(menu.get(i).getItemDescription());
    			formatter8.getChildren().addAll(itemName8, itemPrice8);
    			itemDescription8.setWrapText(true);
    			itemDescription8.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter8, 3, 5);
    			img8.setImage(image8); //copy and paste
    			img8.setFitHeight(180);
    			img8.setFitWidth(150);

    			mainScreen.add(img8, 3, 6);
    			mainScreen.add(itemDescription8, 3 ,7);
    			inputGatherer8.setMaxWidth(50);
    			mainScreen.add(inputGatherer8, 3, 8);
    			mainScreen.setHalignment(inputGatherer8, HPos.CENTER);
    			
    		} else if (i == 9) {
    			
    			Label itemName9 = new Label(menu.get(i).getItemName());
    			Label itemPrice9 = new Label("$" + menu.get(i).getItemPrice());
    			HBox formatter9 = new HBox(5); //name and price into HBOX
    			
    			javafx.scene.image.Image image9 = new javafx.scene.image.Image(getClass().getResource(menu.get(i).getItemPictureAddress()).toExternalForm());
    			ImageView img9 = new ImageView();
    			
    			
    			Label itemDescription9 = new Label(menu.get(i).getItemDescription());
    			formatter9.getChildren().addAll(itemName9, itemPrice9);
    			itemDescription9.setWrapText(true);
    			itemDescription9.setTextAlignment(TextAlignment.CENTER);
    			mainScreen.add(formatter9, 4, 5);
    			img9.setImage(image9); //copy and paste
    			img9.setFitHeight(180);
    			img9.setFitWidth(150);
    			//img.setPreserveRatio(true);
    			mainScreen.add(img9, 4, 6);
    			mainScreen.add(itemDescription9, 4 ,7);
    			inputGatherer9.setMaxWidth(50);
    			mainScreen.add(inputGatherer9, 4, 8);
    			mainScreen.setHalignment(inputGatherer9, HPos.CENTER);
    			
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
					menu = newMenu.getEditedMenu();
					editMenuButton.setDisable(true);
					
					System.out.print(menu.size());
					loadData();
				});
				
				if (!secondStage.isShowing()) {
					ArrayList<Item> temp = new ArrayList<Item>(newMenu.getEditedMenu());
					menu.clear();
					menu = newMenu.getEditedMenu();
					editMenuButton.setDisable(true);					
					loadData();
				}
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		RestaurantGUI test = new RestaurantGUI();
		
		ArrayList<Integer> quantity = new ArrayList<Integer>();
		
		shoppingCartButton.setOnAction(e -> {
			
			try {
				
				quantity.add(Integer.parseInt(inputGatherer.getText()));
				quantity.add(Integer.parseInt(inputGatherer1.getText()));
				quantity.add(Integer.parseInt(inputGatherer2.getText()));
				quantity.add(Integer.parseInt(inputGatherer3.getText()));
				quantity.add(Integer.parseInt(inputGatherer4.getText()));
				quantity.add(Integer.parseInt(inputGatherer5.getText()));
				quantity.add(Integer.parseInt(inputGatherer6.getText()));
				quantity.add(Integer.parseInt(inputGatherer7.getText()));
				quantity.add(Integer.parseInt(inputGatherer8.getText()));
				quantity.add(Integer.parseInt(inputGatherer9.getText()));
				
				Stage secondStage = new Stage();
				secondStage.initModality(Modality.APPLICATION_MODAL);
				
				test.passCheckOut(menu, quantity);

				test.start(secondStage);
				
				 
				
				if (!secondStage.isShowing()) {
					quantity.clear();
				}
				
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
		});
		
		
		logInButton.setOnAction(e ->{
			
			try {

				Stage newstage = new Stage();
				newstage.initModality(Modality.APPLICATION_MODAL);
				HelloApplication loginscreen = new HelloApplication();
				loginscreen.start(newstage);

			}catch (Exception e1) {
				e1.printStackTrace();
			}
		});


    
	}
	
	
	

}