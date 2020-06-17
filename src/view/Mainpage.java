package view;
import javafx.animation.Animation;
//import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
//import javafx.event.EventHandler;
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
import javafx.util.Duration;

public class Mainpage {
    public void constructMainUi(Stage thesStage){
        Pane p=new Pane();
        Label lb1=new Label("Welcome To Main Page");
        setupLabelUI(lb1,"Calibri",20,50,Pos.BASELINE_CENTER,50,50,"BLUE");
        
    }
    
}