package editMenu;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AddFood {
	
	static volatile Food food;
		
	public static Food display(String title) {
		
		
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(780);
		window.setHeight(500);
		
		Label info = new Label("Notice: If any fields are left empty, default values are assumed. \nExit has been disabled on this window, please click Save button when done.");
		info.setWrapText(true);
		info.setTextAlignment(TextAlignment.CENTER);
		
		Label itemName = new Label("Name:");
		Label itemPrice = new Label("Price($):");
		Label itemCalories = new Label("Calories:");
		
		Label itemDescription = new Label("Description:");
		Label itemImg = new Label("Image address:");
		Label itemType = new Label("Type:");
		
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25,25,25,25)); 

		TextField FoodName = new TextField();
		TextField FoodPrice = new TextField();
		TextField FoodCalories = new TextField();
		TextField FoodDescription = new TextField();
		TextField FoodImg = new TextField();
				
		RadioButton type1 = new RadioButton("Main");
		RadioButton type2 = new RadioButton("Appetizers");
		RadioButton type3 = new RadioButton("Side");
		
		type1.setSelected(true);
		
		HBox typeSel = new HBox(10);
		typeSel.setAlignment(Pos.CENTER);
		typeSel.getChildren().addAll(type1, type2, type3);

		FoodName.setPrefColumnCount(20);
		FoodPrice.setPrefColumnCount(14);
		FoodCalories.setPrefColumnCount(14);
		FoodDescription.setPrefColumnCount(14);
		FoodImg.setPrefColumnCount(14);


		pane.add(info, 1, 0);
		pane.add(itemName, 0, 1);
		pane.add(FoodName, 1, 1);
		pane.add(itemPrice, 0, 2);
		pane.add(FoodPrice, 1, 2);
		pane.add(itemCalories, 0, 3);
		pane.add(FoodCalories, 1, 3);
		pane.add(itemDescription, 0, 4);
		pane.add(FoodDescription, 1, 4);
		pane.add(itemImg, 0, 5);
		pane.add(FoodImg, 1, 5);
		pane.add(itemType, 0, 6);
		pane.add(typeSel, 1, 6);
		
		Button save_button = new Button("Save!");
		

		save_button.setOnAction(e -> {

			String name, price, calories, description, img, type;
			
			if (FoodName.getText().isBlank()) {
				
				name = "Default";
				
			} else {
				name = FoodName.getText();
			}
			
			if (FoodPrice.getText().isBlank()) {
				price = "2.99";
			} else {
				price = FoodPrice.getText();
			}
			
			if (FoodCalories.getText().isBlank()) {
				calories = "100";
			} else {
				calories = FoodCalories.getText();
			}
			
			if (FoodDescription.getText().isBlank()) {
				
				description = "item Description";
				
			} else {
				description = FoodDescription.getText();
			}

			if (FoodImg.getText().isBlank()) {
				img = "unknown.jpg";
			} else {
				img = FoodImg.getText();
			}
			
			if (type1.isSelected() && !type2.isSelected() && !type3.isSelected()) {
				type = "Main";
			} else if (type2.isSelected() && !type1.isSelected() && !type3.isSelected()){
				type = "Appetizers";
			} else if (type3.isSelected() && !type1.isSelected() && !type2.isSelected()){
				type = "Side";
			} else {
				type = "Main";
				AlertBox.display("Error", "Invalid Input. Defaulted to Type 1.");
			}
			
			food = new Food(name, Double.parseDouble(price),description, Integer.parseInt(calories), type, img);
			window.close();
		
		}
				 );
		

		pane.add(save_button, 1, 7);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);

		Scene scene = new Scene(borderPane, 770, 500);
		
		window.setOnCloseRequest(e->e.consume());

		window.setScene(scene);
		window.showAndWait();
		
		return food;
	}
	

	public static Food editItem(String title, Item item) {
		
		Food tempfood = (Food) item;
		
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(780);
		window.setHeight(500);
		
		Label info = new Label("Notice: If any fields are left empty, previous values are assumed. \nExit has been disabled on this window, please click Save button when done.");
		info.setWrapText(true);
		info.setTextAlignment(TextAlignment.CENTER);
		
		Label itemName = new Label("Name:");
		Label itemPrice = new Label("Price($):");
		Label itemCalories = new Label("Calories:");
		
		Label itemDescription = new Label("Description:");
		Label itemImg = new Label("Image address:");
		Label itemType = new Label("Type:");
		
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25,25,25,25)); 

		TextField FoodName = new TextField(item.getItemName());
		TextField FoodPrice = new TextField(Double.toString(item.getItemPrice()));
		TextField FoodCalories = new TextField(Integer.toString(item.getItemCalories()));
		TextField FoodDescription = new TextField(item.getItemDescription());
		TextField FoodImg = new TextField(item.getItemPictureAddress());
				
		RadioButton type1 = new RadioButton("Main");
		RadioButton type2 = new RadioButton("Appetizers");
		RadioButton type3 = new RadioButton("Side");
		
		
		
		if (tempfood.foodType.equalsIgnoreCase("Main")) {
			type1.setSelected(true);
		} else if (tempfood.foodType.equalsIgnoreCase("Appetizers")){
			type2.setSelected(true);
		} else {
			type3.setSelected(true);
		}
		
		HBox typeSel = new HBox(10);
		typeSel.setAlignment(Pos.CENTER);
		typeSel.getChildren().addAll(type1, type2, type3);

		FoodName.setPrefColumnCount(20);
		FoodPrice.setPrefColumnCount(14);
		FoodCalories.setPrefColumnCount(14);
		FoodDescription.setPrefColumnCount(14);
		FoodImg.setPrefColumnCount(14);


		pane.add(info, 1, 0);
		pane.add(itemName, 0, 1);
		pane.add(FoodName, 1, 1);
		pane.add(itemPrice, 0, 2);
		pane.add(FoodPrice, 1, 2);
		pane.add(itemCalories, 0, 3);
		pane.add(FoodCalories, 1, 3);
		pane.add(itemDescription, 0, 4);
		pane.add(FoodDescription, 1, 4);
		pane.add(itemImg, 0, 5);
		pane.add(FoodImg, 1, 5);
		pane.add(itemType, 0, 6);
		pane.add(typeSel, 1, 6);
		
		Button save_button = new Button("Save!");
		

		save_button.setOnAction(e -> {

			String name, price, calories, description, img, type;
			
			if (FoodName.getText().isBlank()) {
				
				name = "Default";
				
			} else {
				name = FoodName.getText();
			}
			
			if (FoodPrice.getText().isBlank()) {
				price = "2.99";
			} else {
				price = FoodPrice.getText();
			}
			
			if (FoodCalories.getText().isBlank()) {
				calories = "100";
			} else {
				calories = FoodCalories.getText();
			}
			
			if (FoodDescription.getText().isBlank()) {
				
				description = "item Description";
				
			} else {
				description = FoodDescription.getText();
			}

			if (FoodImg.getText().isBlank()) {
				img = "unknown.jpg";
			} else {
				img = FoodImg.getText();
			}
			
			if (type1.isSelected() && !type2.isSelected() && !type3.isSelected()) {
				type = "Main";
			} else if (type2.isSelected() && !type1.isSelected() && !type3.isSelected()){
				type = "Appetizers";
			} else if (type3.isSelected() && !type1.isSelected() && !type2.isSelected()){
				type = "Side";
			} else {
				type = "Main";
				AlertBox.display("Error", "Invalid Input. Defaulted to Type 1.");
			}
			
			food = new Food(name, Double.parseDouble(price),description, Integer.parseInt(calories), type, img);
			window.close();
		
		}
				 );
		

		pane.add(save_button, 1, 7);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);

		Scene scene = new Scene(borderPane, 770, 500);
		
		window.setOnCloseRequest(e->e.consume());

		window.setScene(scene);
		window.showAndWait();
		
		return food;
	
		
		
	}
	
}
