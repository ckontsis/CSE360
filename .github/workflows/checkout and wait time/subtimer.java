package editMenu;

import java.util.TimerTask;

import javafx.application.Platform;
import javafx.scene.control.Alert;

public class subtimer extends TimerTask {

    //run method
    @Override
    public void run() {
        //method
        Platform.runLater(() -> {
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
        });
    }
}