package ProgramTiketing;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Label;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javafx.geometry.Insets;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTampilan extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    Scene scene;
    Tab1 tab1 = new Tab1();
    Tab2 tab2 = new Tab2();
    Tab3 tab3 = new Tab3();
    Tab4 tab4 = new Tab4();
    Tab5 tab5 = new Tab5();
    
    public void start(Stage stage){   
        
        //Logo Tompeloka -----------------------------------------                                         width, height, preservedRatio, smooth 
        ImageView imgView = new ImageView(new Image(getClass().getResourceAsStream("../Resource/tmpl.png"),  190,    190,           true,   true));
        imgView.relocate(710,15);
        
        Pane root = new Pane();
        root.getChildren().addAll(tab(),imgView);
        //--------------------------------------------------------
        
        scene = new Scene(root, 910,415);
        scene.getStylesheets().add(getClass().getResource("../Resource/coba2.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Tompeloka v1.0");
        stage.setResizable(false);
        stage.show();
    }    
    
    private TabPane tab(){
        //Tab Panel ----------------------------------------------

        TabPane panes = new TabPane();
        
        panes.getSelectionModel().select(2);
        
        Tab l1 = new Tab();
        l1.setText("Langkah 1");
        l1.setContent(tab1.tab(panes));
        l1.setClosable(false);
        
        Tab l2 = new Tab();
        l2.setText("Langkah 2");
        l2.setContent(tab2.tab(tab1));
        l2.setClosable(false);
        
        Tab l3 = new Tab();
        l3.setText("Langkah 3");
        l3.setContent(tab3.tab());
        l3.setClosable(false);
        
        
        
        Tab l4 = new Tab();
        l4.setText("Langkah 4");
        l4.setContent(tab4.tab());
        l4.setClosable(false);
        
        Tab l5 = new Tab();
        l5.setText("Langkah 5");
        l5.setContent(tab5.tab());
        l5.setClosable(false);
        
        panes.getStyleClass().add(".tab-pane");
        panes.setPadding(new Insets(20,0,0,20));
        panes.getTabs().addAll(l1,l2,l3,l4,l5);
        
        //--------------------------------------------------------
        
        return panes;
    }
}