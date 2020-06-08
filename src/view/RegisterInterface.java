package view;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class RegisterInterface {
    public Pane constructRegisterUI(Pane p1){
        Label lbl = new Label("Welcom To JU Page");
		TextField text1=new TextField("Text_1");
		TextField text2=new TextField("Text_2");
		Button but1=new Button("Login");
		Button but2=new Button("Register");
		setupTextUI(text1, "Calibri",20 , 30,Pos.BASELINE_LEFT , 100, 100);
		setupTextUI(text2, "Calibri",20 , 30,Pos.BASELINE_LEFT , 100, 150);
		setupLabelUI(lbl, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 50, "BLUE");
		setupButtonUI(but1, "Calibri", 20, 50, Pos.BASELINE_CENTER, 150, 200);
		setupButtonUI(but2, "Calibri", 20, 50, Pos.BASELINE_CENTER, 150, 250);
		p.getChildren().addAll(lbl);
		p.getChildren().addAll(text1);
		p.getChildren().addAll(text2);
		p.getChildren().addAll(but1);
		p.getChildren().addAll(but2);
        return p;
    

    }
    
}