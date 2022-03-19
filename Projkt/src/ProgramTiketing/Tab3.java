package ProgramTiketing;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author F
 */
public class Tab3{
    
    public ScrollPane tab(){
        Label lbJudul  = new Label("Data Pemesan yang Dapat Dihubungi");
        Label lbJudul2 = new Label("Data Penumpang 1");
        Label lbJudul4 = new Label("Data Penumpang 2");
        Label lbJudul5 = new Label("Data Penumpang 3");
        Label lbJudul3 = new Label("Rincian Harga");
        
        Button     lanjut       = new Button("Lanjut ke Pemesanan");
        lanjut.setId("lanjut");
        lanjut.setMinHeight(40);
        HBox btLanjut = new HBox(lanjut);
        btLanjut.setAlignment(Pos.CENTER_RIGHT);
        btLanjut.setPadding(new Insets(0,0,20,0));
        
        VBox vbTab = new VBox(lbJudul,vb1(),lbJudul2,vb2(),lbJudul4,vb4(),lbJudul5,vb5(),lbJudul3, vb3(),btLanjut);
        vbTab.setSpacing(20);
        vbTab.setId("vbTab");
        
        ScrollPane root = new ScrollPane(vbTab);
        root.getStylesheets().add(getClass().getResource("../Resource/Tab3.css").toExternalForm());
        root.setMaxHeight(342);
        root.setId("root");
        
        return root;
    }
    
    private VBox vb1(){
        Label     lbKontak   = new Label("Nama Kontak"); 
        lbKontak.setId("lbKontak");
        TextField tfKontak   = new TextField();
        Label     lbKet      = new Label("Sesuai KTP/Paspor/SIM (tanpa tanda baca atau gelar");
        lbKet.setId("lbKet");
        
        
        Label     lbNope     = new Label("No. handphone kontak");
        lbNope.setId("lbNope");
        Label     lbEmail    = new Label("Alamat email kontak");
        lbEmail.setId("lbEmail");
        HBox      hbLabel    = new HBox(lbNope, lbEmail);
        hbLabel.setSpacing(80);
        
        TextField tfNope     = new TextField();
        tfNope.setPrefWidth(180);
        TextField tfEmail    = new TextField();
        tfEmail.setPrefWidth(180);
        HBox      hbField    = new HBox(tfNope,tfEmail);
        hbField.setSpacing(50);
        
        Label     lbKetNope  = new Label("Contoh: +62812512122111 ");
        lbKetNope.setId("lbKetNope");
        Label     lbKetEmail = new Label("Contoh: email@example.com");
        lbKetEmail.setId("lbKetEmail");
        HBox      hbKet      = new HBox(lbKetNope,lbKetEmail);
        hbKet.setSpacing(40);
        
        VBox root = new VBox(lbKontak, tfKontak, lbKet, hbLabel, hbField, hbKet);
//        root.setPadding(new Insets(0,10,10,10));
//        root.setId("vb1");
        return root;
    }
    
    private VBox vb2(){
        Label     lbJudul    = new Label("Penumpang Dewasa (12 tahun ke atas)");
        lbJudul.setId("lbJudulVB2");
        
        Label     lbTitel    = new Label("Titel");
        lbTitel.setId("lbTitel");
        Label     lbNama     = new Label("Nama Lengkap (sesuai KTP/SIM/Paspor)");
        lbNama.setId("lbNama");
        HBox      hbTitel    = new HBox(lbTitel,lbNama);
        hbTitel.setSpacing(90);
        
        TextField tfTitel    = new TextField(); 
        tfTitel.setPrefWidth(70);
        TextField tfNama     = new TextField();
        tfNama.setPrefWidth(290);
        HBox      field      = new HBox(tfTitel,tfNama);
        field.setSpacing(50);
        
        Label     ketNama    = new Label("Format: Nama Depan Nama Belakang");
        ketNama.setId("ketNama");
        
        Label     lbBagasi   = new Label("Bagasi");
        lbBagasi.setId("lbBagasi");
        TextField tfBagasi   = new TextField();
        tfBagasi.setMaxWidth(110);
        
        VBox root = new VBox(lbJudul,hbTitel,field,ketNama,lbBagasi,tfBagasi);
//        root.setId("vb2");
        return root;
    }
    
    private VBox vb4(){
        Label     lbJudul    = new Label("Penumpang Dewasa (12 tahun ke atas)");
        lbJudul.setId("lbJudulVB2");
        
        Label     lbTitel    = new Label("Titel");
        lbTitel.setId("lbTitel");
        Label     lbNama     = new Label("Nama Lengkap (sesuai KTP/SIM/Paspor)");
        lbNama.setId("lbNama");
        HBox      hbTitel    = new HBox(lbTitel,lbNama);
        hbTitel.setSpacing(90);
        
        TextField tfTitel    = new TextField(); 
        tfTitel.setPrefWidth(70);
        TextField tfNama     = new TextField();
        tfNama.setPrefWidth(290);
        HBox      field      = new HBox(tfTitel,tfNama);
        field.setSpacing(50);
        
        Label     ketNama    = new Label("Format: Nama Depan Nama Belakang");
        ketNama.setId("ketNama");
        
        Label     lbBagasi   = new Label("Bagasi");
        lbBagasi.setId("lbBagasi");
        TextField tfBagasi   = new TextField();
        tfBagasi.setMaxWidth(110);
        
        VBox root = new VBox(lbJudul,hbTitel,field,ketNama,lbBagasi,tfBagasi);
//        root.setId("vb2");
        return root;
    }
    private VBox vb5(){
        Label     lbJudul    = new Label("Penumpang Dewasa (12 tahun ke atas)");
        lbJudul.setId("lbJudulVB2");
        
        Label     lbTitel    = new Label("Titel");
        lbTitel.setId("lbTitel");
        Label     lbNama     = new Label("Nama Lengkap (sesuai KTP/SIM/Paspor)");
        lbNama.setId("lbNama");
        HBox      hbTitel    = new HBox(lbTitel,lbNama);
        hbTitel.setSpacing(90);
        
        TextField tfTitel    = new TextField(); 
        tfTitel.setPrefWidth(70);
        TextField tfNama     = new TextField();
        tfNama.setPrefWidth(290);
        HBox      field      = new HBox(tfTitel,tfNama);
        field.setSpacing(50);
        
        Label     ketNama    = new Label("Format: Nama Depan Nama Belakang");
        ketNama.setId("ketNama");
        
        Label     lbBagasi   = new Label("Bagasi");
        lbBagasi.setId("lbBagasi");
        TextField tfBagasi   = new TextField();
        tfBagasi.setMaxWidth(110);
        
        VBox root = new VBox(lbJudul,hbTitel,field,ketNama,lbBagasi,tfBagasi);
//        root.setId("vb2");
        return root;
    }
    private VBox vb3(){        
        Label      lbPesawat    = new Label("Citilink (Dewasa) 1");
        lbPesawat.setId("lbPesawat");
        Label      lbHargaTiket = new Label("Rp "+"653.400");
        lbHargaTiket.setId("lbHargaTiket");
        HBox       hb1          = new HBox(lbPesawat, lbHargaTiket);
        hb1.setSpacing(400);
        
        Label      lbBagasi     = new Label("Harga Bagasi");
        lbBagasi.setId("lbBagasi");
        Label      lbHargaBagasi= new Label ("Rp "+"0");
        lbHargaBagasi.setId("lbHargaBagasi");
        HBox       hb2          = new HBox(lbBagasi,lbHargaBagasi);
        hb2.setSpacing(235);
        VBox       vbRincian    = new VBox(hb1,hb2);
//        vbRincian.setId("vbRincian");
        
        Label      lbTotal      = new Label("Harga Total");
        lbTotal.setId("lbTotal");
        Label      lbHargaTotal = new Label("Rp "+"653.400");
        lbHargaTotal.setId("lbHargaTotal");
        HBox       hbTotal      = new HBox(lbTotal,lbHargaTotal);
        hbTotal.setId("hbTotal");
        hbTotal.setSpacing(218);
        hbTotal.setPadding(new Insets(0,10,10,10));
        
        VBox root = new VBox(vbRincian,hbTotal);
        return root;
    }
}

