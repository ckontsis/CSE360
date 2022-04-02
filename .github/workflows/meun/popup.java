//no Functionality 

/*package application;

//import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Popup;
import javafx.stage.Stage;



public class popup extends Application {
	
	
	
    public void start(Stage stage) {
        //stage.setTitle("");
        
        //Label label = new Label("Let's Get Started");
        Label label = new Label("Let's Get Started");
        //label.setTextAlignment(TextAlignment.CENTER);
        //label.setHorizontalAlignment(SwingConstants.CENTER);
        //label.setVerticalAlignment(SwingConstants.CENTER);

        Button button = new Button("Click to open a Popup");

        TilePane tilePane = new TilePane();
        //Label label2 = new Label("This is a popup");

        Popup popup = new Popup();

        label.setStyle("-fx-background-color: white;");
        popup.getContent().add(label);
        
        
        //label.setMinWidth(100);
        //label.setMinHeight(80);

        EventHandler<ActionEvent> actionEventHandler =
                et -> {
                    if (!popup.isShowing()) {
                        boolean value = true;
                    	//return value;
                        Platform.exit();
                        
                        
                    } else {
                        popup.hide();
                        //button.setVisible(false);
                        Platform.exit();

                    }
                };

        button.setOnAction(actionEventHandler);
        tilePane.getChildren().add(label);
        tilePane.getChildren().add(button);

        Scene scene = new Scene(tilePane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
    public abstract class Item {
    	public int value = 0;
    public static void main(String[] args) {

        launch(args);

    }
    public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
    
    }
}*/
