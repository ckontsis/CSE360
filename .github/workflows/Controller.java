package sample;
import java.lang.*;
import java.util.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable {
    @FXML
    private Label Label1;

    @FXML
    private Label Label2;

    @FXML
    private Label Label3;

    int peopleInLine = (int)(Math.random() * 20);

    @FXML

    @Override
    public void setText() {
        int rand = (int) (Math.random() * 20);
        Label3.setText("                                                                 Approximate Wait Time: " + String.valueOf(rand));
        Label1.setText("                                                                You are behind: " + String.valueOf(peopleInLine));
    }
}

