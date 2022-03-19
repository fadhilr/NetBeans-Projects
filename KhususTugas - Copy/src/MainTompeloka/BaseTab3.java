package MainTompeloka;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author F
 */
public class BaseTab3{
    BaseTab4 langkah4 = new BaseTab4();
    Tab      tab4     = new Tab();
    
    ComboBox<String> cbTitel  = new ComboBox<String>();
    ComboBox<String> cbTitel2 = new ComboBox<String>();
    ComboBox<String> cbTitel3 = new ComboBox<String>();
    
    TextField tfNama     = new TextField();
    TextField tfNama2     = new TextField();
    TextField tfNama3     = new TextField();
    
    public ScrollPane tab(Label lbPesawat,
                          Label dws, int jumDewasa,
                          Label ank, int jumAnak,
                          Label blt, int jumBalita,
                          Double harga, 
                          TabPane panes,
                          String resource,
                          String date,
                          String berangkat,
                          String tiba){

        
        Label lbJudul  = new Label("Data Pemesan yang Dapat Dihubungi");
        Label lbJudul2 = new Label("Data Penumpang 1");
        Label lbJudul3 = new Label("Data Penumpang 2");
        Label lbJudul4 = new Label("Data Penumpang 3");
        Label lbJudul5 = new Label("Rincian Harga");
        
        Button     lanjut       = new Button("Lanjut ke Pemesanan");
        lanjut.setId("lanjut");
        lanjut.setMinHeight(40);
        HBox btLanjut = new HBox(lanjut);
        // setOnAction ---------------------------------------------------------
        lanjut.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            public void handle(javafx.event.ActionEvent event) {
                tab4.setDisable(false);
                tab4.setContent(langkah4.tab(panes,resource,lbPesawat,date,berangkat,tiba));
                panes.getSelectionModel().selectNext();
            }
        });
        //----------------------------------------------------------------------
        btLanjut.setAlignment(Pos.CENTER_RIGHT);
        btLanjut.setPadding(new Insets(0,0,20,0));
        
        VBox vbTab = new VBox(lbJudul,
                              vb1(),
                              lbJudul2,
                              vb2(),
                              lbJudul3,
                              vb3(),
                              lbJudul4,
                              vb4(),
                              lbJudul5,
                              vb5(lbPesawat,dws,jumDewasa,ank,jumAnak,blt,jumBalita,harga),
                              btLanjut);
        vbTab.setSpacing(20);
        vbTab.setId("vbTab");
        
        
        ScrollPane root = new ScrollPane(vbTab);
        root.getStylesheets().add(getClass().getResource("../Resource/Tab3.css").toExternalForm());
        root.setMaxHeight(342);
        root.setMaxWidth(890);
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
        hbTitel.setSpacing(146);
        
        cbTitel2.getItems().addAll("Nona","Tuan","Nyonya");
        cbTitel2.setPrefSize(70, 20);
        cbTitel2.setId("cbTitel");
        
        tfNama.setPrefWidth(290);
        HBox      field      = new HBox(cbTitel2,tfNama);
        field.setSpacing(50);
        
        Label     ketNama    = new Label("Format: Nama Depan Nama Belakang");
        ketNama.setId("ketNama");
        
        Label     lbBagasi   = new Label("Bagasi");
        lbBagasi.setId("lbBagasi");
        TextField tfBagasi   = new TextField("20 kg (Rp 0)");tfBagasi.setDisable(true);
        tfBagasi.setMaxWidth(110);
        
        VBox root = new VBox(lbJudul,hbTitel,field,ketNama,lbBagasi,tfBagasi);
//        root.setId("vb2");
        return root;
    }
    
    private VBox vb3(){
        Label     lbJudul    = new Label("Penumpang Dewasa (12 tahun ke atas)");
        lbJudul.setId("lbJudulVB2");
        
        Label     lbTitel    = new Label("Titel");
        lbTitel.setId("lbTitel");
        Label     lbNama     = new Label("Nama Lengkap (sesuai KTP/SIM/Paspor)");
        lbNama.setId("lbNama");
        HBox      hbTitel    = new HBox(lbTitel,lbNama);
        hbTitel.setSpacing(146);
        
        cbTitel.getItems().addAll("Nona","Tuan","Nyonya");
        cbTitel.setPrefSize(70, 20);
        cbTitel.setId("cbTitel");
        
        
        tfNama2.setPrefWidth(290);
        HBox      field      = new HBox(cbTitel,tfNama2);
        field.setSpacing(50);
        
        Label     ketNama    = new Label("Format: Nama Depan Nama Belakang");
        ketNama.setId("ketNama");
        
        Label     lbBagasi   = new Label("Bagasi");
        lbBagasi.setId("lbBagasi");
        TextField tfBagasi   = new TextField("20 kg (Rp 0)");tfBagasi.setDisable(true);
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
        hbTitel.setSpacing(146);
        
        cbTitel3.getItems().addAll("Nona","Tuan","Nyonya");
        cbTitel3.setPrefSize(70, 20);
        cbTitel3.setId("cbTitel");
        
        tfNama3.setPrefWidth(290);
        HBox      field      = new HBox(cbTitel3,tfNama3);
        field.setSpacing(50);
        
        Label     ketNama    = new Label("Format: Nama Depan Nama Belakang");
        ketNama.setId("ketNama");
        
        Label     lbBagasi   = new Label("Bagasi");
        lbBagasi.setId("lbBagasi");
        TextField tfBagasi   = new TextField("20 kg (Rp 0)");tfBagasi.setDisable(true);
        tfBagasi.setMaxWidth(110);
        
        VBox root = new VBox(lbJudul,hbTitel,field,ketNama,lbBagasi,tfBagasi);
//        root.setId("vb2");
        return root;
    }
    
    
    private VBox vb5(Label lbPesawat, 
                     Label dws, int jumDewasa, 
                     Label ank, int jumAnak,
                     Label blt, int jumBalita,
                     double harga){
        lbPesawat.setId("lbPesawat");
        
        // Daftar Penumpang ----------------------------------------------------------------------
        String pesawat = lbPesawat.getText();
        Label lbPesawat1 = new Label(pesawat+" "+dws.getText());lbPesawat1.setId("lbHargaTiket");
        Label lbPesawat2 = new Label(pesawat+" "+ank.getText());lbPesawat2.setId("lbHargaTiket");
        Label lbPesawat3 = new Label(pesawat+" "+blt.getText());lbPesawat3.setId("lbHargaTiket");
        
        
        // Harga Total ----------------------------------------------------------------------        
        double h1 = harga*jumDewasa;
        double h2 = harga*jumAnak/2.0;
        double h3 = 0;
        
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.GERMAN);
        DecimalFormat df = (DecimalFormat) nf;
        
        Label lbHarga1 = new Label("Rp "+df.format(h1));lbHarga1.setId("lbHargaTiket");
        Label lbHarga2 = new Label("Rp "+df.format(h2));lbHarga2.setId("lbHargaTiket");
        Label lbHarga3 = new Label("Rp "+df.format(h3));lbHarga3.setId("lbHargaTiket");
        
        
        //Harga Bagasi ----------------------------------------------------------------------
        Label lbBagasi      = new Label("Harga Bagasi");lbBagasi.setId("lbBagasi");
        Label lbHargaBagasi = new Label("Rp 0");lbHargaBagasi.setId("lbHargaBagasi");
                                                                   
        VBox penumpang = new VBox(lbPesawat1);penumpang.setPrefWidth(650);
        VBox vbHarga   = new VBox(lbHarga1);vbHarga.setPadding(new Insets(0,20,0,0));
        
        if (jumAnak   != 0) {
            penumpang.getChildren().add(lbPesawat2);
            vbHarga.getChildren().add(lbHarga2);
        }
        if (jumBalita != 0) {
            penumpang.getChildren().add(lbPesawat3);
            vbHarga.getChildren().add(lbHarga3);
        }        
        
        GridPane gp1 = new GridPane();                  
        gp1.setHgap(25);
        gp1.add(penumpang, 0, 0);
        gp1.add(vbHarga, 1, 0);
        gp1.add(lbBagasi,0,1);
        gp1.add(lbHargaBagasi,1,1);
        
        VBox vb1 = new VBox(gp1);
        vb1.setPadding(new Insets(0,0,0,10));
        vb1.setId("vb5");
        
        Label lbTotal      = new Label("Harga Total");lbTotal.setId("lbTotal");
        Label lbHargaTotal = new Label("Rp "+df.format(h1+h2+h3));lbHargaTotal.setId("lbHargaTotal");
        
        HBox       hbTotal      = new HBox(lbTotal,lbHargaTotal);
        hbTotal.setId("hbTotal");
        hbTotal.setSpacing(570);
        hbTotal.setPadding(new Insets(0,10,10,10));
        
        VBox root = new VBox(vb1,hbTotal);
        return root;
    }
    
    
    //Getter    
    public Tab getTab4(){
        return tab4;
    }
    
    public Tab getTab5(){
        return langkah4.getTab5();
    }
}

