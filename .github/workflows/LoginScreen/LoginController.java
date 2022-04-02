package sample.cse360project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;


import java.net.URL;
import java.util.ResourceBundle;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class LoginController implements Initializable {

    @FXML
    private Button button_logout;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        button_logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScence(actionEvent, "hello-view.fxml", "Log In", null, null);
            }
        });
    }

    public void setUserInfo(String username, String password, String accountType) {
    }
}