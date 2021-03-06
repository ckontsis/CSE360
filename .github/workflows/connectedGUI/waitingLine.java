package editMenu;
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
    private int peopleInLine;
    private int rand;


    
    public void setText() {
        int peopleInLine = (int)(Math.random() * 20);
        int rand = (int) (Math.random() * 20);
        Label3.setText("                                                                 Approximate Wait Time: " + String.valueOf(rand));
        Label1.setText("                                                                You are behind: " + String.valueOf(peopleInLine));
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		setText();

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            public void setText(){
                //determine if we should re-generate numbers or just stick with our old ones
                if(holder == 0) {
                    peopleInLine = (int) (Math.random() * 20);
                    rand = (int) (Math.random() * 100000);
                }
                else{
                    //if we stick with out old ones, we then subtract a certain amount from them
                    peopleInLine = peopleInLine - 2;
                    rand = rand - 20;
                }
                if(rand <= 0)
                    rand = 0;
                if(peopleInLine <= 0)
                    peopleInLine = 0;
                holder++;
                Label3.setText("                                                                 Approximate Wait Time: " + String.valueOf(rand) + "seconds");
                Label1.setText("                                                                You are behind: " + String.valueOf(peopleInLine) + "people");
            }

			@Override
			public void run() {
				// TODO Auto-generated method stub
				setText();
			}
        };
        timer.schedule(task, 2000);
		
	}
}