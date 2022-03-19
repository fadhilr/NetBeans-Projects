package ProgramTiketing;

import java.awt.event.ItemEvent;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;


public class Tab4 {
    public ScrollPane tab(){
        Label judul = new Label("Pembayaran");
        
        Label ket = new Label("Transfer dapat dilakukan melalui ATM/Internet Banking/SMS Banking ");
        ket.setId("ket");
        
        ToggleGroup tg = new ToggleGroup();
        RadioButton rbMandiri = new RadioButton();
        rbMandiri.setToggleGroup(tg);
        RadioButton rbBNI = new RadioButton();
        rbBNI.setToggleGroup(tg);
        RadioButton rbBRI = new RadioButton();
        rbBRI.setToggleGroup(tg);
        
        Label lbMandiri = new Label("Bank Mandiri");lbMandiri.setId("lbMandiri");
        Label lbBNI = new Label("Bank BNI");lbBNI.setId("lbBNI");
        Label lbBRI = new Label("Bank BRI");lbBRI.setId("lbBRI");
        
        ImageView mandiri = new ImageView(new Image(getClass().getResourceAsStream("../Resource/BankMandiri.png"),100,100,true,true));
        ImageView bni = new ImageView(new Image(getClass().getResourceAsStream("../Resource/BankBNI.png"),80,80,true,true));
        ImageView bri = new ImageView(new Image(getClass().getResourceAsStream("../Resource/BankBRI.png"),100,100,true,true));
        
        HBox b1 = new HBox(rbMandiri, mandiri, lbMandiri);
        b1.setId("b1");
        b1.setSpacing(10);
        HBox b2 = new HBox(rbBNI, bni, lbBNI);
        b2.setId("b2");
        b2.setAlignment(Pos.CENTER_LEFT);
        b2.setSpacing(10);
        HBox b3 = new HBox(rbBRI, bri, lbBRI);
        b3.setId("b3");
        b3.setAlignment(Pos.CENTER_LEFT);
        b3.setSpacing(10);
        
        VBox kiri = new VBox(ket,b1,b2,b3);
        
        //------------------------------------------------
        
        Label lbBank  = new Label("Bank tujuan");lbBank.setId("lbBank");
        Label bank = new Label("BNI"); bank.setId("bank");
        HBox hbBank = new HBox(lbBank, bank);
        hbBank.setSpacing(50);
        
        Label lbPenerima  = new Label("Nama Penerima");
        lbPenerima.setId("lbPenerima");
        Label penerima = new Label("PT. Trinusa Travelindo");
        penerima.setId("penerima");
        HBox hbPenerima = new HBox(lbPenerima, penerima);
        hbPenerima.setSpacing(23);
        
        Label lbCabang = new Label("Cabang");
        lbCabang.setId("lbCabang");
        Label cabang = new Label("Grand Slipi Tower");
        cabang.setId("cabang");
        HBox hbCabang = new HBox(lbCabang, cabang);
        hbCabang.setSpacing(77);
        
        Label lbRekening =new Label("No. Rekening");
        lbRekening.setId("lbRekening");
        Label rekening = new Label("7998 7998 67");
        rekening.setId("rekening");
        HBox hbRekening = new HBox(lbRekening, rekening);
        hbRekening.setSpacing(40);
        
        Line garis = new Line(0,0,300,0);
        
        Label ket2 = new Label(String.format("Setelah Anda melakukan transfer, "
                                           + "segera konfirmasikan dengan "
                                           + "menekan tombol di bawah ini."));
        ket2.setAlignment(Pos.CENTER);
        ket2.setMaxWidth(300);
        ket2.setWrapText(true);
        ket2.setId("ket2");
        
        Button bayar = new Button("Bayar dengan Transfer");
        bayar.setId("bayar");
        HBox hbBayar = new HBox(bayar);
        hbBayar.setAlignment(Pos.CENTER);
        
        VBox kanan = new VBox(hbBank,hbPenerima,hbCabang,hbRekening,garis,ket2,hbBayar);
        kanan.setSpacing(10);
        kanan.setId("kanan");
        
        Line garis2 = new Line(0,0,0,300);
        
        HBox hbGrup = new HBox(kiri,garis2,kanan);
        hbGrup.setSpacing(10);
        
        VBox base = new VBox(judul,hbGrup);
        
        ScrollPane root = new ScrollPane(base);
        root.setId("root");
        root.setMaxHeight(342);
        root.setPadding(new Insets(20));
        root.getStylesheets().add(getClass().getResource("../Resource/Tab4.css").toExternalForm());
        return root;
    }
}
