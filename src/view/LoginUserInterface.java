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
		Label lb2 = new Label("User_ID");
		Label lb3 = new Label("Password");
		TextField text1=new TextField();
		TextField text2=new TextField();
		Button but1=new Button("Login");
		Button but2=new Button("Register");
		text1.setPromptText("User_id");
		text2.setPromptText("password");
		setupTextUI(text1, "Calibri",20 , 400,Pos.BASELINE_LEFT , 140, 100);
		setupTextUI(text2, "Calibri",20 , 400,Pos.BASELINE_LEFT , 140, 150);
		setupLabelUI(lbl, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 50, "BLUE");
		setupLabelUI(lb2, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 100, "BLUE");
		setupLabelUI(lb3, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 150, "BLUE");
		setupButtonUI(but1, "Calibri", 20, 50, Pos.BASELINE_CENTER, 150, 200);
		setupButtonUI(but2, "Calibri", 20, 50, Pos.BASELINE_CENTER, 150, 250);
		p.getChildren().addAll(lbl);
		p.getChildren().addAll(lb2);
		p.getChildren().addAll(lb3);
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
		Label lbl = new Label("Welcom To JU Page");
		Label lb2 = new Label("Name");
		Label lb3 = new Label("Company_Name");
		Label lb4 = new Label("Email_id");
		Label lb5 = new Label("Pasword");
		Label lb6 = new Label("Con_Password");
		TextField text1=new TextField();
		TextField text2=new TextField();
		TextField text3=new TextField();
		TextField text4=new TextField();
		TextField text5=new TextField()
		Button but1=new Button("Register");
		text1.setPromptText("Name");
		text2.setPromptText("Company-name");
		text3.setPromptText("Email_id");
		text4.setPromptText("password");
		text5.setPromptText("Con_password");
		setupTextUI(text1, "Calibri",20 , 400,Pos.BASELINE_LEFT , 140, 100);
		setupTextUI(text2, "Calibri",20 , 400,Pos.BASELINE_LEFT , 140, 150);
		setupTextUI(text3, "Calibri",20 , 400,Pos.BASELINE_LEFT , 140, 200);
		setupTextUI(text4, "Calibri",20 , 400,Pos.BASELINE_LEFT , 140, 250);
		setupTextUI(text5, "Calibri",20 , 400,Pos.BASELINE_LEFT , 140, 300);
		setupLabelUI(lbl, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 50, "BLUE");
		setupLabelUI(lb2, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 100, "BLUE");
		setupLabelUI(lb3, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 150, "BLUE");
		setupLabelUI(lb4, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 200, "BLUE");
		setupLabelUI(lb5, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 250, "BLUE");
		setupLabelUI(lb6, "Calibri", 20, 50, Pos.BASELINE_CENTER, 50, 300, "BLUE");
		setupButtonUI(but1, "Calibri", 20, 50, Pos.BASELINE_CENTER, 150, 500);
		p.getChildren().addAll(lbl);
		p.getChildren().addAll(lb2);
		p.getChildren().addAll(lb3);
		p.getChildren().addAll(lb4);
		p.getChildren().addAll(lb5);
		p.getChildren().addAll(lb6);
		p.getChildren().addAll(text1);
		p.getChildren().addAll(text2);
		p.getChildren().addAll(text3);
		p.getChildren().addAll(text4);
		p.getChildren().addAll(text5);
		p.getChildren().addAll(but1);
		Scene scn = new Scene(p,1200,1200);
		theStage.setTitle("Register Page");
		theStage.setScene(scn);
	
	}

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
