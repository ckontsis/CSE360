package application;


import java.net.URL;

import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Controller implements Initializable {
	
	
	
    //abstract class extends_item
	void addMeun() 
	{
		//Food a = new Food(itemName, itemPrice, itemDescription, itemCalories, itemPictureAddress)
	}
	
    
    Food alaskanSalmon = new Food("Alaskan Salmon", 6.99, "Ingredients: Freshly caught Alaskan Salmon fillet, olive oil,garlic, fresh chopped parsley and thyme, lemon,salt and fresh ground black pepper.",296, "Main");
    Food caesarSalad = new Food("Ceasar Salad", 3.99, "Ingredients: French Baguette, olive oil, garlic, parmesan cheese,\nromaine, Ceasar Dressing (garlic, Worcestershire, lemon,red wine vinegar)salt and freshly grounded pepper.",289, "Appetizers");
    Food filetMignon = new Food("Filet Mignon", 20.99, "Ingredients: 16oz USDA prime Filet Mignon, kosher salt, freshly grounded pepper, in-house made butter, garlic, rosemary and thyme.", 789, "Main");        
    Food lambChops = new Food("Lamb Chops", 10.99, "Ingredients: USDA Grass-Fed lamb loin chops, kosher salt, freshly grounded pepper, in-house made butter,garlic and thyme.", 265, "Main");
    Food mashedPotatoes = new Food("Mashed Potatoes", 4.99, "Ingredients: freshly picked Yukon Gold potatoes, garlic, sea salt, in-house made butter, whole milk, chives and freshly grounded black pepper", 214, "Side");
    Item[] menu = {alaskanSalmon, caesarSalad, filetMignon, lambChops, mashedPotatoes};
    
    
    @FXML
    private Hyperlink About;

    @FXML
    private Label Alaska;

    @FXML
    private AnchorPane Anchor;

    @FXML
    private Hyperlink Appetizers;

    @FXML
    private Label Cesar;

    @FXML
    private Label Filet;

    @FXML
    private Button Filter;

    @FXML
    private Label Ingredient1;

    @FXML
    private Label Ingredient2;

    @FXML
    private Label Ingredient3;

    @FXML
    private Label Ingredient4;

    @FXML
    private Label Ingredient5;

    @FXML
    private Label Lamb;
    

    @FXML
    private ListView<?> Listview;

    @FXML
    private Hyperlink Log;

    @FXML
    private Hyperlink Main;

    @FXML
    private Label Mashed;

    @FXML
    private Label Menu;

    @FXML
    private Label Price1;

    @FXML
    private Label Price2;

    @FXML
    private Label Price3;

    @FXML
    private Label Price4;

    @FXML
    private Label Price5;

    @FXML
    private Hyperlink Side;
    
    @FXML
    private Button Buttom;
    
    //MessageBox.showOkMessage(TEXTS.get("MessageBoxTitle"), TEXTS.get("MessageBoxHeader"), TEXTS.get("MessageBoxInfo"));
    

    //@FXML
    //private Spinner<?> Spiiner4;

  //  @FXML
//    private Spinner<?> Spinner1;

    //@FXML
    //private Spinner<?> Spinner2;

    //@FXML
    //private Spinner<?> Spinner5;

    @FXML
    private VBox abc;

    @FXML
    private Label Cata1;
    
    @FXML
    private Label Cata2;

    @FXML
    private Label Cata3;

    @FXML
    private Label Cata4;

    @FXML
    private Label Cata5;
    
    @FXML
    private Label pic1;

    @FXML
    private Label pic2;

    @FXML
    private Label pic3;

    @FXML
    private Label pic4;

    @FXML
    private Label pic5;
    

    @FXML
    private Label Cata51;

    @FXML
    private Label Cata511;

    @FXML
    private Label Cata512;

    @FXML
    private Label Cata513;

    @FXML
    private Label Cata514;
    
  
    
    

    
    
    	
    
    @FXML
    
    void ClickedMouse(MouseEvent event) {
    	
    
    	
    }
    
    @FXML
	public void loadData() {
	 //TODO Auto-generated metho	d stub
    	
				
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Cesar.setText(menu[1].getItemName());
    	Alaska.setText(menu[0].getItemName());
    	Filet.setText(menu[2].getItemName());
    	Mashed.setText(menu[4].getItemName());
    	Lamb.setText(menu[3].getItemName());
    	Price1.setText("Price: " + Double.toString(menu[1].getItemPrice()));
    	Price2.setText("Price: " + Double.toString(menu[0].getItemPrice()));
    	Price3.setText("Price: " + Double.toString(menu[2].getItemPrice()));
    	Price4.setText("Price: " + Double.toString(menu[4].getItemPrice()));
    	Price5.setText("Price: " + Double.toString(menu[3].getItemPrice()));
    	Ingredient1.setText(menu[1].getItemDescription());
    	Ingredient2.setText(menu[0].getItemDescription());
    	Ingredient3.setText(menu[2].getItemDescription());
    	Ingredient4.setText(menu[4].getItemDescription());
    	Ingredient5.setText(menu[3].getItemDescription());
    	
    	Ingredient1.setWrapText(true);
    	Ingredient2.setWrapText(true);
    	Ingredient3.setWrapText(true);
    	Ingredient4.setWrapText(true);
    	Ingredient5.setWrapText(true);
    	
    	//the picture address issue. 
    	/*pic1.setText(menu[1].getItemPictureAddress());
    	pic2.setText(menu[0].getItemPictureAddress());
    	pic3.setText(menu[2].getItemPictureAddress());
    	pic4.setText(menu[4].getItemPictureAddress());
    	pic5.setText(menu[3].getItemPictureAddress());*/
    	
    	Cata1.setText("Calories: " + Integer.toString(menu[1].getItemCalories()));
    	Cata2.setText("Calories: " + Integer.toString(menu[0].getItemCalories()));
    	Cata3.setText("Calories: " + Integer.toString(menu[2].getItemCalories()));
    	Cata4.setText("Calories: " + Integer.toString(menu[4].getItemCalories()));
    	Cata5.setText("Calories: " + Integer.toString(menu[3].getItemCalories()));
    
	}

}

