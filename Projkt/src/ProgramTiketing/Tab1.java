/**
 *
 * @author F
 */

package ProgramTiketing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class Tab1 {
    private  ComboBox<String> cbFrom = new ComboBox<>();
    private  ComboBox<String> cbTo = new ComboBox<>();
    
    public Pane tab(TabPane tp){
        BorderPane root = new BorderPane();
        root.setId("tab-background");
        root.setLeft(gp1());
        root.setCenter(gp2());
        root.setRight(gp3(tp));
        
        ImageView dari = new ImageView(new Image(getClass().getResourceAsStream("../Resource/from.png"),30,30,true,true));
        dari.relocate(228,137);
        ImageView ke = new ImageView(new Image(getClass().getResourceAsStream("../Resource/to.png"),30,30,true,true));
        ke.relocate(228,277);
        ImageView tgl = new ImageView(new Image(getClass().getResourceAsStream("../Resource/tgl.png"),30,30,true,true));
        tgl.relocate(320,140);
        
        Pane base = new Pane();
        base.getChildren().addAll(root,dari,ke,tgl);
        
        root.setPadding(new Insets(20));
        root.setPrefSize(880, 330);
        
        return base;
    }
    
    private GridPane gp1(){
        //1 -----------------------------------------------------
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(20);
//        root.setGridLinesVisible(true);
        
        Label a1 = new Label("1"); 
        a1.setId("a1");
        Label judul1 = new Label("Tujuan Penerbangan");
        judul1.setId("judul1");
        HBox hb = new HBox();
        hb.getChildren().addAll(a1,judul1);
        root.add(hb, 0, 0);
        
        Label from = new Label("Kota Asal:");
        root.add(from,0,1);
        
        //Memasukkan Kota ke ComboBox kota
        ObservableList<String> options =  FXCollections.observableArrayList(
        "Jakarta",
        "Medan",
        "Bali/Denpasar",
        "Makassar"
        );
        
        cbFrom=new ComboBox(options);
        cbFrom.getItems().addAll();
        root.add(cbFrom,0,2);
        
        
        Button btReverse = new Button();
        btReverse.setId("reverse");
        HBox rev = new HBox(btReverse);
        rev.setAlignment(Pos.CENTER);
        root.add(rev,0,3);
        
        
        Label to = new Label("Kota Tujuan:");
        root.add(to, 0, 4);
                
        cbTo= new ComboBox(options);
        root.add(cbTo, 0, 5);
        
        btReverse.setOnAction(new EventHandler<javafx.event.ActionEvent>(){
            public void handle(javafx.event.ActionEvent event) {
                String cbFrom1= String.valueOf(cbFrom.getValue());
                String cbTo1= String.valueOf(cbTo.getValue());
                cbFrom.setValue(cbTo1);
                cbTo.setValue(cbFrom1);
            }
        });
        
        Line garis = new Line(0,0,0,300);
        garis.setId("g1");
        root.add(garis,1,0,1,7);
        
        return root;
    }
    
    private GridPane gp2(){
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(20);
        root.setPadding(new Insets(0,0,0,20));
//        root.setGridLinesVisible(true);
        
        //2 -----------------------------------------------------
        Label a2 = new Label("2");
        a2.setId("a2");
        Label judul2 = new Label("Waktu Penerbangan");
        judul2.setId("judul2");
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(a2,judul2);
        root.add(hb2, 0, 0);
        
        Label depart = new Label("Tanggal Berangkat:");
        root.add(depart, 0, 1);
        DatePicker dpDepart = new DatePicker();
        root.add(dpDepart,0,2);
        
        ToggleGroup tg = new ToggleGroup();
        RadioButton rd1 = new RadioButton("Sekali Jalan");
        rd1.setToggleGroup(tg);
        rd1.setPadding(new Insets(0,50,0,0));
        RadioButton rd2 = new RadioButton("Pulang Pergi");
        rd2.setToggleGroup(tg);
        
        HBox radio = new HBox();
        radio.getChildren().addAll(rd1,rd2);
        root.add(radio,0,3);
        
        Line garis = new Line(0,0,0,300);
        garis.setId("g2");
        root.add(garis,1,0,1,7);
        
        return root;
    }
    
    private GridPane gp3(final TabPane tp){
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setPadding(new Insets(0,0,0,20));
//        root.setGridLinesVisible(true);
        
        //3 -----------------------------------------------------
        Label a3 = new Label("3");
        a3.setId("a3");
        Label judul3 = new Label("Cari Tiket");
        judul3.setId("judul3");
        HBox hb3 = new HBox(a3,judul3);
        root.add(hb3,0,0);
                
        Label no = new Label("Jumlah Penumpang");
        root.add(no, 0, 1); 
        
        Rectangle spasi = new Rectangle(6, 41); spasi.setId("rr");
        Rectangle spasi2 = new Rectangle(6, 41);spasi2.setId("rr2");
        
        Button dewasa = new Button();  dewasa.setId("dewasa");
        Button anak = new Button();    anak.setId("anak");
        Button balita = new Button();  balita.setId("balita");
        
        final Label lbDewasa = new Label("0"); lbDewasa.setId("lb1");
        final Label lbAnak = new Label("0");   lbAnak.setId("lb1");
        final Label lbBalita = new Label("0"); lbBalita.setId("lb1");
        
        dewasa.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent event) {
                int lbDewasa1= Integer.parseInt(lbDewasa.getText());
                lbDewasa1++;
                if (lbDewasa1>3) {
                    lbDewasa1=1;
                }
                lbDewasa.setText(String.valueOf(lbDewasa1));
            }
        });
        anak.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent event) {
                int lbAnak1= Integer.parseInt(lbAnak.getText());
                lbAnak1++;
                if (lbAnak1>3) {
                    lbAnak1=0;
                }
                lbAnak.setText(String.valueOf(lbAnak1));
            }
        });
        balita.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent event) {
                int lbBalita1= Integer.parseInt(lbBalita.getText());
                lbBalita1++;
                if (lbBalita1>3) {
                    lbBalita1=0;
                }
                lbBalita.setText(String.valueOf(lbBalita1));
            }
        });
        HBox hbNo = new HBox(dewasa ,lbDewasa ,spasi,
                             anak   ,lbAnak   ,spasi2,
                             balita ,lbBalita);
        root.add(hbNo,0,2);
        
        Button cari = new Button();
        cari.setId("cari");
        HBox hbCari = new HBox(cari);
        hbCari.setAlignment(Pos.CENTER);
        root.add(hbCari, 0, 3);
        cari.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent event) {
                tp.getSelectionModel().selectNext();
            }
        });
        
        return root;
    }
    
//    private ArrayList<String> addKota(){
//        ArrayList<String> kota = new ArrayList<Kota>();
//        
//        kota.add("Bali/Denpasar","Yogyakarta"));
//        kota.add(new Kota("Jakarta","Surabaya"));
//        kota.add(new Kota("Makassar","Medan"));
//        kota.add(new Kota("Medan","Makassar"));
//        kota.add(new Kota("Surabaya","Jakarta"));
//        kota.add(new Kota("Yogyakarta","Bali/Denpasar"));
//        
//        return kota;
//    }

    public ComboBox<String> getCbFrom() {
        return cbFrom;
    }

    public void setCbFrom(ComboBox<String> cbFrom) {
        this.cbFrom = cbFrom;
    }

    public ComboBox<String> getCbTo() {
        return cbTo;
    }

    public void setCbTo(ComboBox<String> cbTo) {
        this.cbTo = cbTo;
    }
}

