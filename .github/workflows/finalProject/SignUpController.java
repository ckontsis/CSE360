package sample.cse360project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    private Button button_signup;
    @FXML
    private Button button_login;

    @FXML
    private RadioButton rb_admin;
    @FXML
    private  RadioButton rb_user;

    @FXML
    private TextField tf_email;
    @FXML
    private TextField tf_username;
    @FXML
    private TextField tf_password;

    static volatile  String userType;
    static volatile String homeAddress;
    static volatile String userName;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ToggleGroup toggleGroup = new ToggleGroup();
        rb_admin.setToggleGroup(toggleGroup);
        rb_user.setToggleGroup((toggleGroup));
        rb_user.setSelected(true);

        button_signup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String toggleName = ((RadioButton) toggleGroup.getSelectedToggle()).getText();
                userType = ((RadioButton) toggleGroup.getSelectedToggle()).getText();
                System.out.println(userType);
                homeAddress = tf_email.getText();
                userName = tf_username.getText();
                System.out.println(homeAddress);

                if(!tf_username.getText().trim().isEmpty() && !tf_password.getText().trim().isEmpty()) {
                    DBUtils.signUpUser(actionEvent,tf_username.getText(),tf_password.getText(),toggleName);
                    AlertBox.display("Login Successful", "You successfully logged in");
                    final Node source = (Node) actionEvent.getSource();
                    final Stage stage = (Stage) source.getScene().getWindow();
                    stage.close();
                } else {
                    System.out.println("Please fill in all information");
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please fill in all information to sign up");
                    alert.show();
                }
            }
        });

        button_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                DBUtils.changeScence(actionEvent, "hello-view.fxml","Log In", null, null);
            }
        });
    }

    public String getAddress() {
        return homeAddress;
    }
    public String getUser() {
        return userType;
    }
    public String getUserName(){
        return userName;
    }
}

