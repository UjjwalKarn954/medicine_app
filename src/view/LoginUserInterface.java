package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginUserInterface {
    public void constructLoginUI(Stage theStage) {
	
		Pane p = new Pane();
		Label lbl = new Label("Welcom To JU Page");
		TextField text1=new TextField();
		TextField text2=new TextField();
		Button but1=new Button("Login");
		Button but2=new Button("Register");
		text1.setPromptText("User_id");
		setupTextUI(text1, "Calibri",20 , 400,Pos.BASELINE_LEFT , 100, 100);
		setupTextUI(text2, "Calibri",20 , 400,Pos.BASELINE_LEFT , 100, 150);
		setupLabelUI(lbl, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 50, "BLUE");
		setupButtonUI(but1, "Calibri", 20, 50, Pos.BASELINE_CENTER, 150, 200);
		setupButtonUI(but2, "Calibri", 20, 50, Pos.BASELINE_CENTER, 150, 250);
		p.getChildren().addAll(lbl);
		p.getChildren().addAll(text1);
		p.getChildren().addAll(text2);
		p.getChildren().addAll(but1);
		p.getChildren().addAll(but2);
		but2.setOnAction(e->{
			constructRegisterUI(theStage);
		});
		Scene scn = new Scene(p, 1200, 720);
		theStage.setScene(scn);
		theStage.setTitle("Login Page");
		theStage.show();
	} 
	public void constructRegisterUI(Stage theStage) {
		Pane p = new Pane();
		Label lbl = new Label("This is the register page");
		setupLabelUI(lbl, "Algerian", 72, 100, Pos.BASELINE_CENTER, 200, 250, "RED");
		p.getChildren().add(lbl);
		Scene scn = new Scene(p,1200,1200);
		theStage.setTitle("Register Page");
		theStage.setScene(scn);
	}
	// public Pane constructRrgisterUI(Pane p1) {
	// 	Label lbl = new Label("Welcom To JU Page");
	// 	TextField text1=new TextField("Text_1");
	// 	TextField text2=new TextField("Text_2");
	// 	Button but1=new Button("Login");
	// 	Button but2=new Button("Register");
	// 	setupTextUI(text1, "Calibri",20 , 30,Pos.BASELINE_LEFT , 100, 100);
	// 	setupTextUI(text2, "Calibri",20 , 30,Pos.BASELINE_LEFT , 100, 150);
	// 	setupLabelUI(lbl, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 50, "BLUE");
	// 	setupButtonUI(but1, "Calibri", 20, 50, Pos.BASELINE_CENTER, 150, 200);
	// 	setupButtonUI(but2, "Calibri", 20, 50, Pos.BASELINE_CENTER, 150, 250);
	// 	p1.getChildren().addAll(lbl);
	// 	p1.getChildren().addAll(text1);
	// 	p1.getChildren().addAll(text2);
	// 	p1.getChildren().addAll(but1);
	// 	p1.getChildren().addAll(but2);
    //     return p1;
	// } 

    public void setupButtonUI(Button b, String ff, double f, double w, Pos p, double x, double y){
		b.setFont(Font.font(ff, f));
		b.setMinWidth(w);
		b.setAlignment(p);
		b.setLayoutX(x);
		b.setLayoutY(y);		
	}
    public void setupLabelUI(Label l, String ff, double f, double w, Pos p, double x, double y, String c){
		l.setFont(Font.font(ff, f));
		l.setMinWidth(w);
		l.setAlignment(p);
		l.setLayoutX(x);
		l.setLayoutY(y);
		l.setTextFill(Color.web(c));
    }
    public void setupTextUI(TextField t, String ff, double f, double w, Pos p, double x, double y){
		t.setFont(Font.font(ff, f));
		t.setMinWidth(w);
		t.setMaxWidth(w);
		t.setAlignment(p);
		t.setLayoutX(x);
		t.setLayoutY(y);		
	}
	public void setupTextAreaUI(TextArea t, String ff,double f, int s, double w, Pos p, double x, double y){
		t.setFont(Font.font(ff, f));
		t.setMinWidth(w);
		t.setMaxWidth(w);
		t.setPrefRowCount(s);
		t.setLayoutX(x);
		t.setLayoutY(y);		
	}
	public static void setupComboBoxUI(ComboBox<String> cb,double w, double x, double y) {

		cb.setMinWidth(w);
		cb.setLayoutX(x);
		cb.setLayoutY(y);
	}
}
