/**
 *
 * @author F
 */
package MainTompeloka;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

public class BaseTab5 {
    public ScrollPane tab(String resource,
                          Label lbPesawat,
                          String date,
                          String berangkat,
                          String tiba){        
        ImageView header = new ImageView(new Image(getClass().getResourceAsStream("../Resource/HeaderE-tiket.png"),700,700,true,true));

        Label judul = new Label("Penerbangan Pergi");
        Label note = new Label("NOTE: \n● Semua waktu tertera adalah waktu bandara setempat.\n"
                                     + "● Mohon lakukan chechk-in minimal 1 jam (domestik) sebelum berangkat.");
        Label lbDetail = new Label("Detail Penumpang");
        VBox base = new VBox(header, judul,hb1(resource, lbPesawat,date,berangkat,tiba),note,lbDetail);
        base.setSpacing(20);
        base.setStyle("-fx-background-color:white;");
        
        ScrollPane root = new ScrollPane(base);
        root.setMaxHeight(342);
        root.setMaxWidth(890);
        root.setPadding(new Insets(10, 0, 10, 90));
        root.getStylesheets().add(getClass().getResource("../Resource/Tab5.css").toExternalForm());
        return root;
    }
    
    private HBox hb1(String resource, 
                     Label lbPesawat, 
                     String date,
                     String lbBerangkat,
                     String lbTiba){
        int random = (int)(Math.random()*1000000);
        
        ImageView logo = new ImageView(new Image(getClass().getResourceAsStream(resource),80,80,true,true));
        Label lbKode = new Label("Kode Booking (PNR)");
        Label kode = new Label(""+random);
        VBox vb1 = new VBox(logo,lbKode,kode);
        vb1.setAlignment(Pos.CENTER);
        
        Label pesawat = new Label(lbPesawat.getText()+" GA-"+random/1000);pesawat.setId("pesawat");
        Line garis = new Line(0,0,300,0);
        Label tgl = new Label(date);tgl.setId("tgl");
        
        GridPane gp = new GridPane();
        gp.setHgap(20);
        
        Label from = new Label("Bali/Denpasar");from.setId("ket");
        Label to   = new Label("Jakarta");to.setId("ket");
        gp.add(from, 0, 0);
        gp.add(to,1,0);
        
        Label lbBkt = new Label("Berangkat");lbBkt.setId("ket");
        Label lbTba = new Label("Tiba");lbTba.setId("ket");
        gp.add(lbBkt,0,1);
        gp.add(lbTba,1,1);
        
        Label berangkat = new Label(lbBerangkat);berangkat.setId("ket");
        Label tiba = new Label(lbTiba);tiba.setId("ket");
        gp.add(berangkat,0,2);
        gp.add(tiba,1,2);
        
        
        VBox vb2 = new VBox(pesawat,garis,tgl,gp);
        
        HBox root = new HBox(vb1,vb2);
        root.setSpacing(20);
        root.setId("hbt5");
        return root;
    }
    
    private VBox vbList(ComboBox titel, TextField tfNama,
                        ComboBox titel2,TextField tfNama2,
                        ComboBox titel3,TextField tfNama3,
                        int jumDewasa,int jumAnak,int jumBalita){
        
        Label lbNo          = new Label("No.");
        Label lbGelar       = new Label("Titel");
        Label lbPenumpang   = new Label("Nama Penumpang");
        Label lbJenis       = new Label("Jenis Tiket");
        Label lbBagasi      = new Label("Bagasi Terdaftar");
        Label lbTiket       = new Label("Ticket Number");
        HBox header = new HBox(lbNo,lbGelar,lbPenumpang,lbJenis,lbBagasi,lbTiket);
        
        int random = (int)(Math.random()*10000000);
        
        HBox hbDewasa = new HBox();        
        hbDewasa.setSpacing(20);
        //HBox detail penumpang
        if(jumDewasa!=0){
            for(int a=1;a<=jumDewasa;a++){
                lbNo.setText(""+a);
                lbGelar.setText(titel2.getValue().toString());
                lbPenumpang.setText(tfNama2.getText());
                lbJenis.setText("Anak");
                lbBagasi.setText("20 kg");
                lbTiket.setText(""+random);
                hbDewasa = new HBox(lbNo,lbGelar,lbPenumpang,lbJenis,lbBagasi,lbTiket);
            }
        }else if(jumAnak!=0){
            lbNo.setText("2");
            lbGelar.setText(titel2.getValue().toString());
            lbPenumpang.setText(tfNama2.getText());
            lbJenis.setText("Anak");
            lbBagasi.setText("20 kg");
            lbTiket.setText(""+random);
            hbDewasa = new HBox(lbNo,lbGelar,lbPenumpang,lbJenis,lbBagasi,lbTiket);
        }else if(jumBalita!=0){
            lbNo.setText("2");
            lbGelar.setText(titel2.getValue().toString());
            lbPenumpang.setText(tfNama2.getText());
            lbJenis.setText("Anak");
            lbBagasi.setText("20 kg");
            lbTiket.setText(""+random);
            hbDewasa = new HBox(lbNo,lbGelar,lbPenumpang,lbJenis,lbBagasi,lbTiket);
        }
        
        VBox root = new VBox(header);
        return root;
    }
}
