package editMenu;

import java.lang.*;
import java.math.BigDecimal;
import java.net.URL;
import java.util.*;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class checkOut implements Initializable{
	
	static volatile ArrayList<Item> menu = new ArrayList<Item>();
	static volatile ArrayList<Integer> quantity = new ArrayList<Integer>();
	
	ObservableList List = FXCollections.observableArrayList();
	
	static volatile ArrayList<Double> price = new ArrayList<Double>();
	
	
	public checkOut(ArrayList<Item> menu, ArrayList<Integer> quantity) {
		this.menu = menu;
		this.quantity = quantity;
	}
	
    @FXML private Button Exit;
    @FXML private Label Label1;
    @FXML private Label Label2;
    @FXML private Label Label3;
    @FXML private Button checkOut;
    @FXML private Label checkOutLbl;
    @FXML private ListView<String> itemDisplay;
    @FXML private ImageView itemImg;



    private Stage stage = new Stage();
    private Scene scene;
    private Parent root;

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
    	displayItems();
    	finalPrice();
    	// TODO Auto-generated method stub
		
	}
    
    
    public void loadNextScreen(ActionEvent event) throws IOException{
       
    	
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("EnterInformation.fxml"));
        root = loader.load();
        
		 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	     scene = new Scene(root);
	     stage.setScene(scene);
	     stage.show();
    }
    
    public void finalPrice(){
        
    	double beforeTax = 0;
    	
    	for (int i = 0; i < price.size(); i++) {
    		
    		beforeTax += price.get(i);
    	}
    	double discountRate = 0;
        double tax = 0.084 * beforeTax;
        double totalPrice = beforeTax + tax;
        
        String taxVal = String.valueOf(new BigDecimal(tax).setScale(2, BigDecimal.ROUND_HALF_UP));
        String totalpriceVal = String.valueOf(new BigDecimal(totalPrice).setScale(2, BigDecimal.ROUND_HALF_UP));
        
        Label1.setText("Tax: " + taxVal);
        Label2.setText("Discount: " + Double.toString(discountRate));
        Label3.setText("Total Bill: " + totalpriceVal);
    }
    
    public void displayItems(){
        
		List.removeAll(List);
		price.removeAll(price);
    	
    	for (int i = 0; i < quantity.size(); i++) {
    		if (quantity.get(i) == 0 || quantity.get(i) == null) {
    		} else {
    			String name = "x" + quantity.get(i) + "   " + menu.get(i).getItemName();
    			double price = (quantity.get(i) * menu.get(i).getItemPrice());
    			
    			this.price.add(price);
    			List.add(name);
    		}
    	}
    	itemDisplay.getItems().addAll(List);
    }

    
    public void exitScreen(ActionEvent event) throws IOException{
    	
    	itemDisplay.getItems().clear();
    	Label1.setText("");
    	Label2.setText("");
    	Label3.setText("");
    	System.out.print(Label1);
    	final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
    
    
    @FXML
    void openItemImg(MouseEvent event) {
    	
    	String selection = itemDisplay.getSelectionModel().getSelectedItem();
    	
    			
		if (selection == null || selection.isEmpty()) {
			
			String img_addr = "placeholder.jpg";
			javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(img_addr).toExternalForm());
	    	itemImg.setImage(image);
			

		} else {
	    		    
	    	String[] sel = selection.split("   ");

	    	
	    	for (int i = 0; i < menu.size(); i++) {
	    		
	    		if (sel[1].equalsIgnoreCase(menu.get(i).getItemName())) {
	    			
	    			String img_addr = menu.get(i).getItemPictureAddress();
	    			javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(img_addr).toExternalForm());
	    			itemImg.setPreserveRatio(false);
	    	    	itemImg.setImage(image);
	    		}
	    	}

		}
    }

	
}