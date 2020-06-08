package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import view.LoginUserInterface;
import view.RegisterInterface;

public class RegMain extends Application {
    public static void main(String[] args) {
       Application.launch(args);
    }
    @Override
     public void start(Stage stage2) throws Exception { 
	 Pane p1 =new Pane();
     LoginUserInterface lui = new LoginUserInterface();
	 p1= rui.constructRegisterUI(p1);
	 Scene s2=new Scene(p1,800,600)
	 stage2.setTitle("Register_page");
	 stage2.setScene(s2);
	 stage2.show();
	}
    
}