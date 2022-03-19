package MainTompeloka;

import java.time.format.DateTimeFormatter;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

/**
 *
 * @author F
 */
public class BaseTab4 {
    
    Label bank = new Label(); 
    Label penerima = new Label();
    Label cabang = new Label();
    Label rekening = new Label();
    
    BaseTab5 langkah5 = new BaseTab5();
    Tab      tab5     = new Tab();
    
    public ScrollPane tab(TabPane panes,
                          String resource,
                          Label lbPesawat,
                          String date,
                          String berangkat,
                          String tiba){        
        Label judul = new Label("Pembayaran");
        
        Label ket = new Label("Transfer dapat dilakukan melalui ATM/Internet Banking/SMS Banking ");
        ket.setId("ket");
        
        
        Label lbMandiri = new Label("Bank Mandiri");lbMandiri.setId("lbMandiri");
        Label lbBNI = new Label("Bank BNI");lbBNI.setId("lbBNI");
        Label lbBRI = new Label("Bank BRI");lbBRI.setId("lbBRI");
        
        ImageView mandiri = new ImageView(new Image(getClass().getResourceAsStream("../Resource/BankMandiri.png"),100,100,true,true));
        ImageView bni = new ImageView(new Image(getClass().getResourceAsStream("../Resource/BankBNI.png"),80,80,true,true));
        ImageView bri = new ImageView(new Image(getClass().getResourceAsStream("../Resource/BankBRI.png"),100,100,true,true));
        
        ToggleGroup tg = new ToggleGroup();
        RadioButton rbMandiri = new RadioButton();rbMandiri.setToggleGroup(tg);
        RadioButton rbBNI     = new RadioButton();rbBNI.setToggleGroup(tg);
        RadioButton rbBRI     = new RadioButton();rbBRI.setToggleGroup(tg);
        
                
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
        
        Line garis2 = new Line(0,0,0,300);
        Label empty = new Label("");
        HBox hbGrup = new HBox(kiri,garis2,empty);
        hbGrup.setSpacing(10);
        
        // setOnAction ---------------------------------------------------------
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                hbGrup.getChildren().remove(2);
                if(tg.getSelectedToggle() == rbMandiri) {
                    hbGrup.getChildren().add(getKanan(panes,resource,lbPesawat,date,berangkat,tiba));
                    bank    .setText("Mandiri");
                    penerima.setText("PT. Satu Nusa Travelindo");
                    cabang  .setText("Grand Mandiri Tower");
                    rekening.setText("7998 7998 67");
                }else if(tg.getSelectedToggle() == rbBNI) {
                    hbGrup.getChildren().add(getKanan(panes,resource,lbPesawat,date,berangkat,tiba));
                    bank    .setText("BNI");
                    penerima.setText("PT. Dua Nusa Travelindo");
                    cabang  .setText("Grand BNI Tower");
                    rekening.setText("3928 7118 45");
                }else if(tg.getSelectedToggle() == rbBRI) {
                    hbGrup.getChildren().add(getKanan(panes,resource,lbPesawat,date,berangkat,tiba));
                    bank    .setText("BRI");
                    penerima.setText("PT. Tiga Nusa Travelindo");
                    cabang  .setText("Grand BRI Tower");
                    rekening.setText("1228 4118 90");
                }
            }
        });
        //----------------------------------------------------------------------

        
        VBox base = new VBox(judul,hbGrup);
        
        ScrollPane root = new ScrollPane(base);
        root.setId("root");
        root.setMaxHeight(342);
        root.setPadding(new Insets(20));
        root.getStylesheets().add(getClass().getResource("../Resource/Tab4.css").toExternalForm());
        return root;
    }
    
    
    // Getter
    private VBox getKanan(TabPane panes, 
                          String resource,
                          Label lbPesawat,
                          String date,
                          String berangkat,
                          String tiba){
        
        //KANAN ------------------------------------------------
        Label lbBank  = new Label("Bank tujuan");lbBank.setId("lbBank");
        bank.setId("bank");
        HBox hbBank = new HBox(lbBank, bank);
        hbBank.setSpacing(50);
        
        Label lbPenerima  = new Label("Nama Penerima");lbPenerima.setId("lbPenerima");
        penerima.setId("penerima");
        HBox hbPenerima = new HBox(lbPenerima, penerima);
        hbPenerima.setSpacing(23);
        
        Label lbCabang = new Label("Cabang");lbCabang.setId("lbCabang");
        cabang.setId("cabang");
        HBox hbCabang = new HBox(lbCabang, cabang);
        hbCabang.setSpacing(77);
        
        Label lbRekening =new Label("No. Rekening");
        lbRekening.setId("lbRekening");
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
        
        
        Button bayar = new Button("Saya sudah bayar");
        bayar.setId("bayar");
        // SetOnAction ---------------------------------------------------------
        bayar.setOnAction(new EventHandler<ActionEvent>(){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            @Override
            public void handle(ActionEvent event) {
                tab5.setDisable(false);
                tab5.setContent(langkah5.tab(resource,lbPesawat,date,berangkat,tiba));
                panes.getSelectionModel().selectNext();
            }
        });
        
        
        HBox hbBayar = new HBox(bayar);
        hbBayar.setAlignment(Pos.CENTER);
        
        VBox kanan = new VBox(hbBank,hbPenerima,hbCabang,hbRekening,garis,ket2,hbBayar);
        kanan.setSpacing(10);
        kanan.setId("kanan");
        //KANAN END -------------------------------------------------------------
        return kanan;
    }
    
    public Tab getTab5(){
        return tab5;
    }
}
