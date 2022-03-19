/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTompeloka;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

/**
 *
 * @author F
 */
public class Tes extends Application{

    public static void main(String[] args) {
        //Coba convert tanggal -------------------------------------------------
        double num = 6.00;
        
        DecimalFormatSymbols waktu = new DecimalFormatSymbols(Locale.GERMAN);
        waktu.setDecimalSeparator(':');
        DecimalFormat jam = new DecimalFormat("00.00", waktu);

        System.out.println("Hasil : " + jam.format(num));
        //Coba convert tanggal -------------------------------------------------
        
        //Coba convert tanggal -------------------------------------------------
        System.out.println("Random : "+(int)(Math.random()*5000000));
        
        System.out.println();
//        launch(args);
    }

    @Override
    public void start(Stage stage) {
        
        
        ToggleGroup tg = new ToggleGroup();
        RadioButton rbMandiri = new RadioButton();
        rbMandiri.setToggleGroup(tg);
        System.out.println("iki");
        
        // setOnAction ---------------------------------------------------------
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                System.out.println(tg.getSelectedToggle()==rbMandiri);
            }
        });
        //----------------------------------------------------------------------
        
        
        final Label hasil = new Label();
        Button ubah = new Button("Ubah");
        ubah.setOnAction(new EventHandler<javafx.event.ActionEvent>(){
            public void handle(javafx.event.ActionEvent event) {
                hasil.setText("-------");
                
                
            }
        });
        
        Scene scene = new Scene(new FlowPane(rbMandiri,ubah,hasil));
        stage.setScene(scene);
        stage.show();
    }
}
