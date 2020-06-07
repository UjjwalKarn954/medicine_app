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

public class LoginUserInterface {
    public Pane constructLoginUI(Pane p) {
        var lbl = new Label("Hi There");
        setupLabelUI(lbl, "Calibri", 18, 50, Pos.BASELINE_CENTER, 50, 50, "BLUE");
        p.getChildren().addAll(lbl);
        return p;
    } 

    public void setupButtonUI(Button b, String ff, double f, double w, Pos p, double x, double y){
		b.setFont(Font.font(ff, f));
		b.setMinWidth(w);
		b.setAlignment(p);
		b.setLayoutX(x);
		b.setLayoutY(y);		
	}
    private void setupLabelUI(Label l, String ff, double f, double w, Pos p, double x, double y, String c){
		l.setFont(Font.font(ff, f));
		l.setMinWidth(w);
		l.setAlignment(p);
		l.setLayoutX(x);
		l.setLayoutY(y);
		l.setTextFill(Color.web(c));
    }
    private void setupTextUI(TextField t, String ff, double f, double w, Pos p, double x, double y){
		t.setFont(Font.font(ff, f));
		t.setMinWidth(w);
		t.setMaxWidth(w);
		t.setAlignment(p);
		t.setLayoutX(x);
		t.setLayoutY(y);		
	}
	private void setupTextAreaUI(TextArea t, String ff,double f, int s, double w, Pos p, double x, double y){
		t.setFont(Font.font(ff, f));
		t.setMinWidth(w);
		t.setMaxWidth(w);
		t.setPrefRowCount(s);
		t.setLayoutX(x);
		t.setLayoutY(y);		
	}
	private static void setupComboBoxUI(ComboBox<String> cb,double w, double x, double y) {

		cb.setMinWidth(w);
		cb.setLayoutX(x);
		cb.setLayoutY(y);
	}
}
