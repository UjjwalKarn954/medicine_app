package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import view.LoginUserInterface;
import view.RegisterInterface;

public class Main extends Application {
public static void main(String[] args) {
   Application.launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception {
	
	Pane p = new Pane();
	LoginUserInterface lui = new LoginUserInterface();
	p = lui.constructLoginUI(p);
	Scene s = new Scene(p,800,600);
	primaryStage.setTitle("Login_page");
	primaryStage.setScene(s);
	primaryStage.show();
	
}

}
