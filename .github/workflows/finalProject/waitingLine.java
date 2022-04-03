package sample.cse360project;
import java.lang.*;
import java.net.URL;
import java.util.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class waitingLine implements Initializable {

    @FXML
    private Label Label1;

    @FXML
    private Label Label2;

    @FXML
    private Label Label3;

    private int holder = 0;
    private int peopleInLine = (int)(Math.random() * 20);
    private int rand = (int) (Math.random() * 20);


    
    public void setText() {

        Label3.setText("                                                                 Approximate Wait Time: " + String.valueOf(rand));
        Label1.setText("                                                                You are behind: " + String.valueOf(peopleInLine));
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setText();

        Timer timer = new java.util.Timer();
        timer.schedule(new subtimer(), rand * 1000);
            

			
		
	}
}