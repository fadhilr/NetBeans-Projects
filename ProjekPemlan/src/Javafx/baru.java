/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javafx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class baru extends Application{
    Label judul;
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage){
        HBox hb= new HBox();
        judul=new Label("Penerbangan");
        hb.getChildren().add(judul);
        judul.setPadding(new Insets(20,0,0,0));
        
        GridPane grid= new GridPane();
        grid.add(hb, 1, 0);
        grid.setHgap(20);
        grid.setGridLinesVisible(true);
        Label from= new Label("From :");
        hb.getChildren().add(from);
        from.setPadding(new Insets(10,0,0,0));
        grid.add(from, 1, 1);
        
        
        Scene scene= new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Tompel");
        stage.show();
        
        
    }
}
