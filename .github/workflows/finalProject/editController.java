package sample.cse360project;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.TextAlignment;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class editController implements Initializable {
	
	ArrayList <Item> menu = new ArrayList<Item>();

	public editController(ArrayList<Item> menu) {
		this.menu = menu;
	}
	
	ObservableList foodList = FXCollections.observableArrayList();
	ObservableList beveragesList = FXCollections.observableArrayList();

    @FXML private Button addNewItem_Button;
    @FXML private Button addNewItem_Button1;
    @FXML private ListView<String> beveragesLIst;
    @FXML private Tab beveragesTab;
    @FXML private Button deleteItem_Button;
    @FXML private Button deleteItem_Button1;
    @FXML private Button editItem_Button;
	@FXML private TabPane categoryType;
    @FXML private SplitPane doubleDivider;
    @FXML private ListView<String> entreeList;
    @FXML private Tab entreesTab;
    @FXML private Label header_Label;
    @FXML private AnchorPane startUp;
    @FXML private Label foodCaloriesLabel;
    @FXML private Label foodImgAddress;
    @FXML private Label foodIngredientsLabel;
    @FXML private Label foodLabel;
    @FXML private Label foodNameLabel;
    @FXML private Label foodPriceLabel;
    @FXML private Label foodNameText;
    @FXML private Label foodCaloriesText;
    @FXML private Label foodPriceText;
    @FXML private Label foodIngredientsText;
    @FXML private Label foodImgText;
    @FXML private ImageView itemImg;
    
    
    //Main method basically
    private void loadData() {
    	
    	String itemName;
    	
    	javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource("placeholder.jpg").toExternalForm());
    	itemImg.setImage(image);
    	itemImg.setPreserveRatio(false);

    	
    	
    	foodList.removeAll(foodList);
    	beveragesList.removeAll(beveragesList);
    	

    	for(int index = 0; index < menu.size(); index++) {
    		
    		itemName = menu.get(index).getItemName();
    		
    		if (menu.get(index) instanceof Food) {
    			foodList.add(itemName);
    		} else {	
    			beveragesList.add(itemName);
    		}
    	}
    	
    	entreeList.getItems().addAll(foodList);
    	beveragesLIst.getItems().addAll(beveragesList);
    }
    

	    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	loadData();// TODO Auto-generated method stub

	}
	
    
	public void openItemInfo(MouseEvent event) {
	
    	/* Text wrapping for Labels*/
    	foodIngredientsText.setWrapText(true);
    	foodIngredientsText.setPadding(new Insets(0,50,0,10));
    	foodIngredientsText.setTextAlignment(TextAlignment.CENTER);

    	String name , ingredients, img_addr;
    	int calories;
    	double price;    	
		String selection = entreeList.getSelectionModel().getSelectedItem();
		
		if (selection == null || selection.isEmpty()) {

    		editItem_Button.setDisable(true);


		} else {
	    	
			/* Visual Enabling of Labels */
			foodNameText.setDisable(false);
	    	foodCaloriesText.setDisable(false);
	    	foodPriceText.setDisable(false);
	    	foodIngredientsText.setDisable(false);
	    	foodImgText.setDisable(false);
    		editItem_Button.setDisable(false);
	    	deleteItem_Button.setDisable(false);
	    	
	    	for (int i = 0; i < menu.size(); i++) {
	    		
	    		if (selection == menu.get(i).getItemName()) {
	    			
	    			name = menu.get(i).getItemName();
	    			price = menu.get(i).getItemPrice();
	    			ingredients = menu.get(i).getItemDescription();
	    			calories = menu.get(i).getItemCalories();
	    			img_addr = menu.get(i).getItemPictureAddress();
	    			
	    			javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(img_addr).toExternalForm());
	    	    	itemImg.setImage(image);
	    	    	
	    	    	foodNameText.setText(name);
	    	    	foodPriceText.setText("$ " + Double.toString(price));
	    	    	foodCaloriesText.setText(Integer.toString(calories) + " cal");
	    	    	foodIngredientsText.setText(ingredients);
	    	    	foodImgText.setText(img_addr);
	    	    	
	    		}
	    	}
		}
    }
	
	
	
	
	@FXML
    void addBeverageItem(ActionEvent event) {
		
		menu.add(AddBeverage.display("Add a Beverage"));
    	entreeList.getItems().clear();
		beveragesLIst.getItems().clear();
		this.loadData();
    }

	
    @FXML
    void addItemList(ActionEvent event) {
    	
    	menu.add(AddFood.display("Add Food Item"));
    	entreeList.getItems().clear();
		beveragesLIst.getItems().clear();
    	this.loadData();
    }

    
    @FXML
    void deleteBeverage(ActionEvent event) {
    	
    	String name;

    	if (menu.size() > 5) {
    		
    		int index = beveragesLIst.getSelectionModel().getSelectedIndex();
    		
    		for (int i = 0; i < menu.size(); i++) {
    			
    			name = menu.get(i).getItemName();
    			
    			if (name.equals(beveragesList.get(index))) {
    				
    				index = i;
    				
    			}
    			
    		}
    	
    		menu.remove(index);
    		entreeList.getItems().clear();
    		beveragesLIst.getItems().clear();
    		this.loadData();
   	
    	} else {
    		
    		AlertBox.display("Error", "Menu contains only 5 items in total, unable to delete this item.");
    	}

    }

    @FXML
    void deleteItemList(ActionEvent event) {

    	String name;
    	
    	if (menu.size() > 5) {
    		
    		
    		int index = entreeList.getSelectionModel().getSelectedIndex();
    		
    		for (int i = 0; i < menu.size(); i++) {
    			
    			name = menu.get(i).getItemName();
    			
    			if (name.equals(foodList.get(index))) {
    				
    				index = i;
    				
    			}
    			
    		}
    		
    		menu.remove(index);
    		entreeList.getItems().clear();
    		beveragesLIst.getItems().clear();
    		this.loadData();
    		
    		
    	} else {
    		
    		AlertBox.display("Error", "Menu contains only 5 items in total, unable to delete this item.");
    	}
    	
    }

    @FXML
    void editThisItem(ActionEvent event) {
    	
    	String name;
    	
    	if (entreeList.getSelectionModel().getSelectedIndex() != -1) {
    		
    		int index = entreeList.getSelectionModel().getSelectedIndex();
    		
    		for (int i = 0; i < menu.size(); i++) {
    			
    			name = menu.get(i).getItemName();
    			
    			if (name.equals(foodList.get(index))) {
    				
    				index = i;
    				
    			}
    			
    		}
    			
    		
    		menu.set(index, AddFood.editItem("Edit a Food Item", menu.get(index)));
    		entreeList.getItems().clear();
    		beveragesLIst.getItems().clear();
    		this.loadData();
    		
    		
    	} else if (beveragesLIst.getSelectionModel().getSelectedIndex() != 1) {
    	
    		int index = beveragesLIst.getSelectionModel().getSelectedIndex();
    		
    		for (int i = 0; i < menu.size(); i++) {
    			
    			name = menu.get(i).getItemName();
    			
    			if (name.equals(beveragesList.get(index))) {
    				
    				index = i;
    				
    			}
    			
    		}
    		
    		menu.set(index, AddBeverage.editItem("Edit a Beverage Item", menu.get(index)));
    		entreeList.getItems().clear();
    		beveragesLIst.getItems().clear();
    		this.loadData();
    	} 

    }
    

    @FXML
    void openBeverageInfo(MouseEvent event) {

    	/* Text wrapping for Labels*/
    	foodIngredientsText.setWrapText(true);
    	foodIngredientsText.setPadding(new Insets(0,50,0,10));
    	foodIngredientsText.setTextAlignment(TextAlignment.CENTER);

    	String name , ingredients, img_addr;
    	int calories;
    	double price;
		
    	
		String selection = beveragesLIst.getSelectionModel().getSelectedItem();
		
		if (selection == null || selection.isEmpty()) {

			

		} else {
	    	
			/* Visual Enabling of Labels */
			foodNameText.setDisable(false);
	    	foodCaloriesText.setDisable(false);
	    	foodPriceText.setDisable(false);
	    	foodIngredientsText.setDisable(false);
	    	foodImgText.setDisable(false);
    		editItem_Button.setDisable(false);
	    	
	    	deleteItem_Button1.setDisable(false);
	    	
	    	
	    	for (int i = 0; i < menu.size(); i++) {
	    		
	    		if (selection == menu.get(i).getItemName()) {
	    			
	    			name = menu.get(i).getItemName();
	    			price = menu.get(i).getItemPrice();
	    			ingredients = menu.get(i).getItemDescription();
	    			calories = menu.get(i).getItemCalories();
	    			img_addr = menu.get(i).getItemPictureAddress();
	    			
	    			javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(img_addr).toExternalForm());
	    	    	itemImg.setImage(image);
	    	    	
	    	    	foodNameText.setText(name);
	    	    	foodPriceText.setText("$ " + Double.toString(price));
	    	    	foodCaloriesText.setText(Integer.toString(calories) + " cal");
	    	    	foodIngredientsText.setText(ingredients);
	    	    	foodImgText.setText(img_addr);
	    	    	
	    		}
	    	}
			
			
			
		}
    }
	
    public ArrayList<Item> getNewMenu(){
    	return this.menu;
    }

}
