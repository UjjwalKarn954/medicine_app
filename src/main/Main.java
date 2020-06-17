package main;

import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import view.LoginUserInterface;


public class Main extends Application {
public static void main(String[] args) {
   Application.launch(args);
}
public static Stage theStage;

@Override 
public void start(Stage primaryStage) throws Exception {
	
		LoginUserInterface lui = new LoginUserInterface();
	theStage = primaryStage;
	lui.constructLoginUI(theStage);
	
}

}
