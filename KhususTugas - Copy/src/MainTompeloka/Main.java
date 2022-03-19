package MainTompeloka;

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

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage stage){
        //Logo Tompeloka -----------------------------------------                                         width, height, preservedRatio, smooth 
        ImageView imgView = new ImageView(new Image(getClass().getResourceAsStream("../Resource/tmpl.png"),  190,    190,           true,   true));
        imgView.relocate(710,15);
        
        Pane root = new Pane();
        root.getChildren().addAll(tab(),imgView);
        //--------------------------------------------------------
        
        Scene scene = new Scene(root, 910,415);
        scene.getStylesheets().add(getClass().getResource("../Resource/coba2.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Tompeloka v1.0");
        stage.setResizable(false);
        stage.show();
    }    
    
    BaseTab1 utama = new BaseTab1();
    
    private TabPane tab(){
        //Tab Panel ----------------------------------------------
        
        TabPane panes = new TabPane();
        
        Tab tabs = new Tab();
        tabs.setText("Langkah 1");
        tabs.setContent(utama.tab(panes));
        tabs.setClosable(false);
        
        panes.getStyleClass().add(".tab-pane");
        panes.setPadding(new Insets(20,0,0,20));
        
        
        // Deklarasi tab keempat------------------------------------------------
        utama.getTab4().setDisable(true);
        utama.getTab4().setText("Langkah 4");
        utama.getTab4().setClosable(false);
        //----------------------------------------------------------------------
        // Deklarasi tab kelima------------------------------------------------
        utama.getTab5().setDisable(true);
        utama.getTab5().setText("Langkah 5");
        utama.getTab5().setClosable(false);
        //----------------------------------------------------------------------
        panes.getTabs().addAll(tabs,
                               utama.getTab2(),
                               utama.getTab3(),
                               utama.getTab4(),
                               utama.getTab5());
        
        //--------------------------------------------------------
        
        return panes;
    }
}