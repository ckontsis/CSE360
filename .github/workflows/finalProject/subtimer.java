package sample.cse360project;

import java.util.TimerTask;

import javafx.application.Platform;
import javafx.scene.control.Alert;

public class subtimer extends TimerTask {

	//run method
	@Override
	public void run() {
	//method
	Platform.runLater(() -> {
	//create object for Alert class
	Alert al = new Alert(Alert.AlertType.INFORMATION);
	//set the title
	al.setTitle("Dialog box");
	//set the header text
	al.setHeaderText("Oh oh.. Time elapsed");
	//create a string
	String c;
	int del = 100;
	//check the condition of delay
	if (del  == 1) {
	// display one second is elapsed
	c = "1 sec elapsed";
	} else
	{
	c = String.format("%d sec elapsed",
	del);
	}
	al.setContentText(c);
	al.showAndWait();
	});
	}

}
