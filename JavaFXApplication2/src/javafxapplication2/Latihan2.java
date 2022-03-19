package javafxapplication2;

import java.awt.Color;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.CheckBox;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Latihan2 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage stage){
        //Tab Panel ----------------------------------------------
        TabPane panes = new TabPane();
        
        Tab l1 = new Tab();
        l1.setText("Langkah 1");
        l1.setContent(tab1());
        
        Tab l2 = new Tab();
        l2.setText("Langkah 2");
        l2.setContent(tab2());
        
        panes.getStyleClass().add(".tab-pane");
        panes.setMinWidth(Double.MAX_VALUE);
        panes.setPadding(new Insets(20,0,0,20));
        panes.getTabs().addAll(l1,l2);
        //--------------------------------------------------------
        
        //Logo Tompeloka -----------------------------------------                             width, height, preservedRatio, smooth 
        ImageView imgView = new ImageView(new Image(getClass().getResourceAsStream("tmpl.png"),  190,    190,           true,   true));
        imgView.relocate(622,15);         
       
//        Pane.setLeftAnchor(panes,20.0);
//        Pane.setRightAnchor(imgView,20.0);
        
        Pane root = new Pane();
        root.getChildren().addAll(panes,imgView);
        //--------------------------------------------------------
        
        Scene scene = new Scene(root, 835,390);
        scene.getStylesheets().add(getClass().getResource("coba.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Tompeloka v1.0");
        stage.setResizable(false);
        stage.show();
    }
    
    private Pane tab1(){
        GridPane root = new GridPane();
//        root.setGridLinesVisible(true);
        
        root.setPrefWidth(Double.MAX_VALUE);
        root.setPadding(new Insets(0,0,0,1));
        
        Pane bg = new Pane();
        bg.setId("p1");
        root.add(bg,0,0,5,10);
        
        //1 -----------------------------------------------------
        Label a1 = new Label("1");
        a1.setId("a1");
        
        Label judul1 = new Label("Flight Destination");
        judul1.setFont(Font.font("Tahoma", FontWeight.BOLD,15));
        judul1.setPadding(new Insets(5,0,0,0));
        judul1.setStyle("-fx-text-fill: #434343;");
        
        HBox hb1 = new HBox();
        hb1.setSpacing(7);
        hb1.setPadding(new Insets(50,0,0,0));
        hb1.getChildren().addAll(a1,judul1);
        root.add(hb1,1,0);
                
        Label from = new Label("From:");
        from.setFont(Font.font("Tahoma", FontWeight.MEDIUM,15));
        from.setPadding(new Insets(20,0,0,0));
        root.add(from, 1, 1);
                
        ComboBox<String> cbFrom = new ComboBox<>();
        root.add(cbFrom, 1, 2);
                
        ImageView ivReverse = new ImageView
        (new Image(getClass().getResourceAsStream("../Resource/reverse.png"),30,30,true,true));
        HBox hbReverse = new HBox(ivReverse);
        hbReverse.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.add(hbReverse,1,4);
                
        Label to = new Label("To:");
        to.setFont(Font.font("Tahoma", FontWeight.MEDIUM,15));
        to.setPadding(new Insets(10,0,0,0));
        root.add(to, 1, 5);
                
        ComboBox<String> cbTo = new ComboBox<>();
        root.add(cbTo, 1, 6);
        
        //2 -----------------------------------------------------
        Label a2 = new Label("2");
        a1.setId("a2");        
        
        Label judul2 = new Label("Date of Flight");
        judul2.setFont(Font.font("Tahoma", FontWeight.BOLD,15));
        judul2.setPadding(new Insets(5,0,0,0));
        judul2.setStyle("-fx-text-fill: #434343;");
        
        HBox hb2 = new HBox();
        hb2.setSpacing(7);
        hb2.setPadding(new Insets(50,0,0,0));
        hb2.getChildren().addAll(a2,judul2);
        root.add(hb2,2,0);
                
        Label depart = new Label("Departure:");
        depart.setFont(Font.font("Tahoma", FontWeight.MEDIUM,15));
        depart.setPadding(new Insets(20,0,0,0));
        root.add(depart, 2, 1);
                
        DatePicker dpDepart = new DatePicker();
        dpDepart.setStyle("-fx-pref-width: 200;");
        root.add(dpDepart, 2, 2);
                
        HBox radio = new HBox();
        radio.setSpacing(40);
        
        CheckBox rd1 = new CheckBox("One-way");
        CheckBox rd2 = new CheckBox("Return");
        radio.getChildren().addAll(rd1,rd2);
        
        root.setVgap(10);
        root.setHgap(50);
        root.add(radio,2,4);
        
        //3 -----------------------------------------------------
        Label a3 = new Label("3");
        a1.setId("a3");        
        
        Label judul3 = new Label("Search Flight");
        judul3.setFont(Font.font("Tahoma", FontWeight.BOLD,15));
        judul3.setPadding(new Insets(5,0,0,0));
        judul3.setStyle("-fx-text-fill: #434343;");
        
        HBox hb3 = new HBox();
        hb3.setSpacing(7);
        hb3.setPadding(new Insets(50,0,0,0));
        hb3.getChildren().addAll(a3,judul3);
        root.add(hb3,3,0);
                
        Label no = new Label("No. of Passengers:");
        no.setFont(Font.font("Tahoma", FontWeight.MEDIUM,15));
        no.setPadding(new Insets(20,0,0,0));
        root.add(no, 3, 1);
                
        DatePicker dp = new DatePicker();
        dp.setStyle("-fx-pref-width: 200;");
        root.add(dp, 3, 2);
                
        HBox rad = new HBox();
        rad.setSpacing(40);
        
        CheckBox rdo1 = new CheckBox("One-way");
        CheckBox rdo2 = new CheckBox("Return");
        rad.getChildren().addAll(rdo1,rdo2);
        
        root.setVgap(10);
        root.setHgap(50);
        root.add(rad,3,4);
        
        return root;
    }
    
    private Pane tab2(){
        
        return new BorderPane();
    }
}
