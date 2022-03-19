/**
 *
 * @author F
 */
package ProgramTiketing;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

public class Tab5 {
    public ScrollPane tab(){
        ImageView header = new ImageView(new Image(getClass().getResourceAsStream("../Resource/HeaderE-tiket.png"),700,700,true,true));
//        header.relocate(28,137);
        
        Label judul = new Label("Penerbangan Pergi");
        
        
        
        VBox base = new VBox(header, judul,hb1());
        base.setSpacing(20);
        base.setStyle("-fx-background-color:white;");
        
        ScrollPane root = new ScrollPane(base);
        root.setMaxHeight(342);
        root.setPadding(new Insets(10, 0, 10, 90));
        root.getStylesheets().add(getClass().getResource("../Resource/Tab5.css").toExternalForm());
        return root;
    }
    
    private HBox hb1(){
        ImageView logo = new ImageView(new Image(getClass().getResourceAsStream("../Resource/1.jpg"),80,80,true,true));
        Label lbKode = new Label("Kode Booking (PNR)");
        Label kode = new Label("12345678");
        VBox vb1 = new VBox(logo,lbKode,kode);
        
        Label pesawat = new Label("Garuda Indonesia GA-401");
        Line garis = new Line(0,0,300,0);
        Label tgl = new Label("Sabtu, 09 Agustus 2014");
        
        Label from = new Label("Bali/Denpasar");
        Label to   = new Label("Jakarta");
        HBox hb1 = new HBox(from,to);
        hb1.setSpacing(70);
        
        Label fromBandara = new Label("Ngurah Rai Intl(DPS)");
        Label toBandara = new Label("Soekarno Hatta Intl(CGK)");
        HBox hb2 = new HBox(fromBandara,toBandara);
        hb2.setSpacing(70);
        
        Label berangkat = new Label("Berangkat 06:35");
        Label tiba = new Label("Tiba 07:30(Terminal 2F");
        HBox hb3 = new HBox(berangkat,tiba);
        hb3.setSpacing(70);
        
        VBox vb2 = new VBox(pesawat,garis,tgl,hb1,hb2,hb3);
        
        HBox root = new HBox(vb1,vb2);
        root.setId("hbt5");
        return root;
    }
}
