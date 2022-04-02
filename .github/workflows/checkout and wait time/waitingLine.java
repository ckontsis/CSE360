package RestaurantGUI;
import java.lang.*;
import java.util.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class waitingLine implements Initializable {

    @FXML
    private Label Label1;

    @FXML
    private Label Label2;

    @FXML
    private Label Label3;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        setText();
        //updateScreen();
    }

    public void setText() {
        int peopleInLine = (int)(Math.random() * 20);
        int rand = (int) (Math.random() * 20);
        Label3.setText("                                                                 Approximate Wait Time: " + String.valueOf(rand));
        Label1.setText("                                                                You are behind: " + String.valueOf(peopleInLine));
    }

    /*public void updateScreen(){

    }*/
}

