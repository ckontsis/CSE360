package editMenu;

import java.io.IOException;
import java.lang.*;
import java.net.URL;
import java.util.*;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EnterInformation implements Initializable {
    
	@FXML private RadioButton cashRdButton;
    @FXML private RadioButton creditRdButton;
    @FXML private Label enterAddressLabel;
    @FXML private Label enterInfoLabel;
    @FXML private VBox firstVbox;
    @FXML private Label paymentLabel;
    @FXML private Button proccedButton;
    @FXML private VBox secondVBox;
    @FXML private AnchorPane startAnch;
    @FXML private VBox thirdVBox;
    @FXML private TextField userAddressTxT;

    private String userAddress;
    private String paymentType;
    private Parent root;
    private Stage stage;
    private Scene scene;



    public void waitingScreen(ActionEvent event) throws IOException{
        
    	if (userAddressTxT.getText().isEmpty()) {
    		AlertBox.display("Error", "No Address Entered.");
    	} else if (!cashRdButton.isSelected() && !creditRdButton.isSelected()) {
    		AlertBox.display("Error", "Please Select a Payment Type.");
    	} else if (cashRdButton.isSelected() && creditRdButton.isSelected()) {
    		AlertBox.display("Error", "Error two Payment have been selected.");
    	} else {
    		
    		this.userAddress = userAddressTxT.getText();
    		if (cashRdButton.isSelected()) {
    			this.paymentType = "Cash";
    		} else {
    			this.paymentType = "Credit";
    		}
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("waitingLine.fxml"));
            root = loader.load();

            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    		
    	}
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
	}
}