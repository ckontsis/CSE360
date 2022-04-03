package sample.cse360project;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AddBeverage {
	
	static volatile Drink beverage;
		
	public static Drink display(String title) {
		
		
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(800);
		window.setHeight(500);
		
		Label info = new Label("Notice: Type is defined as 1 being non-alcoholic and 2 alcoholic. If any fields are left empty, default values are assumed. \nExit has been disabled on this window, please click Save button when done.");
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

		TextField beverageName = new TextField();
		TextField beveragePrice = new TextField();
		TextField beverageCalories = new TextField();
		TextField beverageDescription = new TextField();
		TextField beverageImg = new TextField();
				
		RadioButton type1 = new RadioButton("1");
		RadioButton type2 = new RadioButton("2");
		
		type1.setSelected(true);
		
		HBox typeSel = new HBox(10);
		typeSel.setAlignment(Pos.CENTER);
		typeSel.getChildren().addAll(type1, type2);

		beverageName.setPrefColumnCount(20);
		beveragePrice.setPrefColumnCount(14);
		beverageCalories.setPrefColumnCount(14);
		beverageDescription.setPrefColumnCount(14);
		beverageImg.setPrefColumnCount(14);


		pane.add(info, 1, 0);
		pane.add(itemName, 0, 1);
		pane.add(beverageName, 1, 1);
		pane.add(itemPrice, 0, 2);
		pane.add(beveragePrice, 1, 2);
		pane.add(itemCalories, 0, 3);
		pane.add(beverageCalories, 1, 3);
		pane.add(itemDescription, 0, 4);
		pane.add(beverageDescription, 1, 4);
		pane.add(itemImg, 0, 5);
		pane.add(beverageImg, 1, 5);
		pane.add(itemType, 0, 6);
		pane.add(typeSel, 1, 6);
		
		Button save_button = new Button("Save!");
		

		save_button.setOnAction(e -> {

			String name, price, calories, description, img, type;
			
			if (beverageName.getText().isBlank()) {
				
				name = "Default";
				
			} else {
				name = beverageName.getText();
			}
			
			if (beveragePrice.getText().isBlank()) {
				price = "2.99";
			} else {
				price = beveragePrice.getText();
			}
			
			if (beverageCalories.getText().isBlank()) {
				calories = "100";
			} else {
				calories = beverageCalories.getText();
			}
			
			if (beverageDescription.getText().isBlank()) {
				
				description = "item Description";
				
			} else {
				description = beverageDescription.getText();
			}

			if (beverageImg.getText().isBlank()) {
				img = "unknown.jpg";
			} else {
				img = beverageImg.getText();
			}
			
			if (type1.isSelected() && !type2.isSelected()) {
				type = "1";
			} else if (type2.isSelected() && !type1.isSelected()){
				type = "2";
			} else {
				type = "1";
				AlertBox.display("Error", "Two Radio buttons have been selected. Defaulted to Type 1.");
			}
			
			beverage = new Drink(name, Double.parseDouble(price),description, Integer.parseInt(calories), Integer.parseInt(type), img);
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
		
		return beverage;
		
	}
		
		public static Drink editItem(String title, Item item) {
			
			Drink tempbeverage = (Drink) item;
			
			Stage window = new Stage();
			
			window.initModality(Modality.APPLICATION_MODAL);
			window.setTitle(title);
			window.setMinWidth(800);
			window.setHeight(500);
			
			Label info = new Label("Notice: Type is defined as 1 being non-alcoholic and 2 alcoholic. If any fields are left empty, previous values are assumed. \nExit has been disabled on this window, please click Save button when done.");
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

			TextField beverageName = new TextField(item.getItemName());
			TextField beveragePrice = new TextField(Double.toString(item.getItemPrice()));
			TextField beverageCalories = new TextField(Integer.toString(item.getItemCalories()));
			TextField beverageDescription = new TextField(item.getItemDescription());
			TextField beverageImg = new TextField(item.getItemPictureAddress());
					
			RadioButton type1 = new RadioButton("1");
			RadioButton type2 = new RadioButton("2");
			
			if (tempbeverage.drinkType == 1) {
				type1.setSelected(true);
			} else {
				type2.setSelected(true);
			}
			
			HBox typeSel = new HBox(10);
			typeSel.setAlignment(Pos.CENTER);
			typeSel.getChildren().addAll(type1, type2);

			beverageName.setPrefColumnCount(20);
			beveragePrice.setPrefColumnCount(14);
			beverageCalories.setPrefColumnCount(14);
			beverageDescription.setPrefColumnCount(14);
			beverageImg.setPrefColumnCount(14);


			pane.add(info, 1, 0);
			pane.add(itemName, 0, 1);
			pane.add(beverageName, 1, 1);
			pane.add(itemPrice, 0, 2);
			pane.add(beveragePrice, 1, 2);
			pane.add(itemCalories, 0, 3);
			pane.add(beverageCalories, 1, 3);
			pane.add(itemDescription, 0, 4);
			pane.add(beverageDescription, 1, 4);
			pane.add(itemImg, 0, 5);
			pane.add(beverageImg, 1, 5);
			pane.add(itemType, 0, 6);
			pane.add(typeSel, 1, 6);
			
			Button save_button = new Button("Save!");
			

			save_button.setOnAction(e -> {

				String name, price, calories, description, img, type;
				
				if (beverageName.getText().isBlank()) {
					
					name = "Default";
					
				} else {
					name = beverageName.getText();
				}
				
				if (beveragePrice.getText().isBlank()) {
					price = "2.99";
				} else {
					price = beveragePrice.getText();
				}
				
				if (beverageCalories.getText().isBlank()) {
					calories = "100";
				} else {
					calories = beverageCalories.getText();
				}
				
				if (beverageDescription.getText().isBlank()) {
					
					description = "item Description";
					
				} else {
					description = beverageDescription.getText();
				}

				if (beverageImg.getText().isBlank()) {
					img = "unknown.jpg";
				} else {
					img = beverageImg.getText();
				}
				
				if (type1.isSelected() && !type2.isSelected()) {
					type = "1";
				} else if (type2.isSelected() && !type1.isSelected()){
					type = "2";
				} else {
					type = "1";
					AlertBox.display("Error", "Two Radio buttons have been selected. Defaulted to Type 1.");
				}
				
				beverage = new Drink(name, Double.parseDouble(price),description, Integer.parseInt(calories), Integer.parseInt(type), img);
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
			
			return beverage;
		}
	}
	
