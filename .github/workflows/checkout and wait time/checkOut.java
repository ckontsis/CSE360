package RestaurantGUI;
import java.lang.*;
import java.util.*;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//import com.sun.javafx.fxml.FXMLLoaderHelper;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class checkOut implements Initializable{
    @FXML
    private Label Label1;

    @FXML
    private Label Label2;

    @FXML
    private Label Label3;

    @FXML
    private Button checkOut;

    @FXML
    private Button Exit;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        finalPrice(beforeTax, discount);
    }

    public void loadNextScreen(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResources("waitingLine.fxml"));
        root = loader.load();

        waitingLine WaitingLine = loader.getController();
        WaitingLine.setText();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void finalPrice(double beforeTax, boolean discount){
        double discountRate = 0;
        if(discount == true) {
            discountRate = Math.random() * beforeTax;
            beforeTax = beforeTax - discountRate;
        }
        double tax = Math.random() * beforeTax;
        double totalPrice = beforeTax + tax;
        Label1.setText("Tax: " + Double.toString(tax));
        Label2.setText("Discount: " + Double.toString(discountRate));
        Label3.setText("Total Bill: " + Double.toString(totalPrice));
    }

    public void displayItems(ArrayList <Item> menu, int[] array){
        string foodName = "";
        int Price = 0;
        string imgaddr = "";
        editController EditController = loader.getController();
        for(int i = 0; i < menu.size(); i++){
            foodName = EditController.get(i).getItemName();
            price = EditController.get(i).getItemPrice();
            imgaddr = EditController.get(i).getItemPictureAddress();
            javafx.scene.image.Image image = new javafx.scene.image.Image(getClass().getResource(imgaddr).toExternalForm());
            itemImg.setImage(image);
        }
    }

    public void exitScreen(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResources("MainScreen.fxml"));
        root = loader.load();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

