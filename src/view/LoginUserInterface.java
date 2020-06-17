package view;



import javafx.animation.Animation;
//import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Insets;
//import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

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
		but1.setOnAction(e->{
			constructMainUI(theStage);
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
		TextField text5=new TextField();
		Button but1=new Button("Register");
		text1.setPromptText("Name");
		text2.setPromptText("Company-name");
		text3.setPromptText("Email_id");
		text4.setPromptText("password");
		text5.setPromptText("Con_password");
		setupTextUI(text1, "Calibri",20 , 400,Pos.BASELINE_LEFT , 200, 100);
		setupTextUI(text2, "Calibri",20 , 400,Pos.BASELINE_LEFT , 200, 150);
		setupTextUI(text3, "Calibri",20 , 400,Pos.BASELINE_LEFT , 200, 200);
		setupTextUI(text4, "Calibri",20 , 400,Pos.BASELINE_LEFT , 200, 250);
		setupTextUI(text5, "Calibri",20 , 400,Pos.BASELINE_LEFT , 200, 300);
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
		but1.setOnAction(e->{
			// Register Button Action
			p.getChildren().clear();
			Label lblRegSuccessfullLabel = new Label("Registered Successfully");
			Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), evt->{lblRegSuccessfullLabel.setVisible(false);}),
								new KeyFrame(Duration.seconds(0.5), evt->{lblRegSuccessfullLabel.setVisible(true);}));
			timeline.setCycleCount(Animation.INDEFINITE);
			timeline.play();
			setupLabelUI(lblRegSuccessfullLabel, "Algerian", 48, 400.0, Pos.BASELINE_CENTER, 450.0, 360.0, "GREEN");
			p.getChildren().add(lblRegSuccessfullLabel);
		});	
		Scene scn = new Scene(p,1200,720);
		theStage.setTitle("Register Page");
		theStage.setScene(scn);
	
	}

	public void constructMainUI(Stage theStage){
		Pane p=new Pane();
		Label lb1=new Label("Welcome To Main Page");
		Button btn1=new Button("Medicine Stock");
		Button btn2=new Button("PlaceOrder");
		Button btn3=new Button("Start selling");
		setupLabelUI(lb1,"Calibri",20,50,Pos.BASELINE_CENTER,50,50,"BLUE");
		setupButtonUI(btn1,"Calibri",20,50,Pos.BASELINE_CENTER,50,200);
		setupButtonUI(btn2,"Calibri",20,50,Pos.BASELINE_CENTER,50,300);
		setupButtonUI(btn3,"Calibri",20,50,Pos.BASELINE_CENTER,50,400);
		p.getChildren().addAll(lb1,btn1,btn2,btn3);
		btn1.setOnAction(e->{
			constructMedicineDbUI(theStage);
		});
		btn2.setOnAction(e->{
			constructOrderUI(theStage);
		});
		btn3.setOnAction(e->{
			constructSellingUI(theStage);
		});
		Scene scn=new Scene(p, 1200, 720);
		theStage.setTitle("Main Page");
		theStage.setScene(scn);
		theStage.show();
        
	}

	public void constructMedicineDbUI(Stage theStage){
		Pane p=new Pane();
		Label lb1=new Label("MEdicine Database");
		TextField txt1=new TextField();
		setupTextUI(txt1, "calibri", 20, 50, Pos.BASELINE_CENTER, 50, 100);
		p.getChildren().addAll(txt1);
		
		TableView table=new TableView();
		table.setEditable(true);

		TableColumn col1=new TableColumn("S.N");
		TableColumn col2=new TableColumn("Name");
		TableColumn col4=new TableColumn("Company");
		TableColumn col5=new TableColumn("C Address");
		TableColumn col6=new TableColumn("C Contact");
		TableColumn col7=new TableColumn("InStock");
		TableColumn col8=new TableColumn("Placeorder");

		table.getColumns.addAll(col1,col2,col4,col5,col6,col7,col8);

		final VBox vbox=new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getChildren().addAll(table);

		((Group) p.getRoot()).getChildren().addAll(vbox);

		Scene scn = new Scene(p,1200,720);
		theStage.setTitle("Medical Database");
		theStage.setScene(scn);
        theStage.show();


   
	}
	public void constructOrderUI(Stage theStage){

	}

	public void constructSellingUI(Stage theStage){

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
