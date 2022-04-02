package RestaurantGUI;
import java.lang.*;
import java.util.*;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class EnterInformation implements Initializable {
    @FXML
    private PasswordField Address;

    @FXML
    private Label Label1;

    @FXML
    private Label Label11;

    @FXML
    private Label Label12;

    @FXML
    private RadioButton radioButton1;

    @FXML
    private RadioButton radioButton2;

    private string userAddress;
    private string paymentType;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //preloaded function
    }

    public void setAddress(string Address1) {
        userAddress = Address1;
    }

    Address.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void setAddress(ActionEvent e) {
            userAddress = Address.getText();
        }
    });

    public string getAddress(){
        return userAddress;
    }

    public RadioButton getRadioButton1() {
        return radioButton1;
    }

    public void setPaymentType(string payment){
        paymentType = payment;
    }

    radioButton1.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void setPaymentType(ActionEvent e) {
            paymentType = "Card";
        }
    });

    radioButton2.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void setPaymentType(ActionEvent e) {
            paymentType = "Cash";
        }
    });

    public string getPaymentType(){
        return paymentType;
    }


    public void waitingScreen(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResources("waitingLine.fxml"));
        root = loader.load();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}