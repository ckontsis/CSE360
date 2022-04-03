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

    private int holder = 0;
    private int peopleInLine;
    private int rand;

    public void setText() {
        int peopleInLine = (int)(Math.random() * 20);
        int rand = (int) (Math.random() * 20);
        Label3.setText("                                                                 Approximate Wait Time: " + String.valueOf(rand));
        Label1.setText("                                                                You are behind: " + String.valueOf(peopleInLine));
        holder++;
    }

    public void constantUpdate(){
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(20), ev -> {
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
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void setText()
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        setText();
        constantUpdate();
    }
}

