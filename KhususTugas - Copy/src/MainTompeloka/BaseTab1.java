/**
 *
 * @author F
 */

package MainTompeloka;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class BaseTab1 {
    
    private ComboBox<String> cbFrom = new ComboBox<>(); 
    private ComboBox<String> cbTo   = new ComboBox<>();
    
    private BaseTab2 langkah2   = new BaseTab2(); 
    private Tab      tab2       = new Tab();
    
    DatePicker dpDepart = new DatePicker();
    
    private Button btReverse = new Button();
    
    final ToggleGroup group  = new ToggleGroup();
    RadioButton rd1 = new RadioButton("Sekali Jalan");
    RadioButton rd2 = new RadioButton("Pulang Pergi");
    
    Label lbDewasa = new Label("1"); 
    Label lbAnak = new Label("0");   
    Label lbBalita = new Label("0"); 
    
    public Pane tab(TabPane panes){        
        // Deklarasi tab kedua---------------
        tab2.setText("Langkah 2");
        tab2.setContent(langkah2.tab(panes,null,null,null,panes,lbDewasa,lbAnak,lbBalita));
        tab2.setClosable(false);
        //-----------------------------------
        
        cbFrom.setId("cbFrom");
        cbTo.setId("cbTo");
        
        BorderPane base = new BorderPane();
        base.setPadding(new Insets(20));
        base.setPrefSize(880, 330);
        base.setId("tab-background");
        
        base.setLeft(gp1());
        base.setCenter(gp2());
        base.setRight(gp3(panes));
        
        Pane root = new Pane();
        root.getChildren().addAll(base);
        
        return root;
    }
    
    private GridPane gp1(){
        //1 -----------------------------------------------------
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setHgap(20);
        
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
        cbFrom.getItems().addAll("Bali/Denpasar","Jakarta","Makassar","Surabaya");
        cbFrom.setValue("Bali/Denpasar");
        root.add(cbFrom,0,2);
        
        
        btReverse.setId("reverse");
        btReverse.setOnAction(new EventHandler<javafx.event.ActionEvent>(){
            public void handle(javafx.event.ActionEvent event) {
                String cbFrom1= String.valueOf(cbFrom.getValue());
                String cbTo1= String.valueOf(cbTo.getValue());
                cbFrom.setValue(cbTo1);
                cbTo.setValue(cbFrom1);
            }
        });
        HBox rev = new HBox(btReverse);
        rev.setAlignment(Pos.CENTER);
        root.add(rev,0,3);
        
        
        
        Label to = new Label("Kota Tujuan:");
        root.add(to, 0, 4);
                
        cbTo.getItems().addAll("Bali/Denpasar","Jakarta","Makassar","Surabaya");
        cbTo.setValue("Jakarta");
        root.add(cbTo, 0, 5);
        
        
        
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
        root.setGridLinesVisible(false);
        
        
        Label a2 = new Label("2");
        a2.setId("a2");
        Label judul2 = new Label("Waktu Penerbangan");
        judul2.setId("judul2");
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(a2,judul2);
        root.add(hb2, 0, 0);
        
        Label depart = new Label("Tanggal Berangkat:");
        root.add(depart, 0, 1);
        
        //DatePicker -----------------------------------------------------
        dpDepart.setValue(LocalDate.now());
        root.add(dpDepart,0,2);
        //-----------------------------------------------------------------------
        
        rd1.setToggleGroup(group);
        rd1.setSelected(true);
        rd1.setPadding(new Insets(0,50,0,0));
        rd2.setToggleGroup(group);
//        rd2.setDisable(true);
        
        HBox radio = new HBox(rd1,rd2);
        root.add(radio,0,3);

        Line garis = new Line(0,0,0,300);
        garis.setId("g2");
        root.add(garis,1,0,1,7);
        
        return root;
    }
 
    private GridPane gp3(final TabPane panes){
        GridPane root = new GridPane();
        root.setVgap(10);
        root.setPadding(new Insets(0,0,0,20));

        
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
        
        lbDewasa.setId("lb1");
        lbAnak.setId("lb1");
        lbBalita.setId("lb1");
        
        // setOnAction ---------------------------------------------------------
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
        //----------------------------------------------------------------------
        
        HBox hbNo = new HBox(dewasa ,lbDewasa ,spasi,
                             anak   ,lbAnak   ,spasi2,
                             balita ,lbBalita);
        root.add(hbNo,0,2);
        
        
        tab2.setDisable(true);
        Button cari = new Button();
        cari.setOnAction(new EventHandler<ActionEvent>(){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            @Override
            public void handle(ActionEvent event) {
                
                if(dpDepart.getValue()!=null){
                    if (!cbFrom.getValue().toString().equals(cbTo.getValue().toString())) {
                        String date = dpDepart.getValue().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy"));
                        tab2.setDisable(false);
                        tab2.setContent(langkah2.tab(panes, null, null,date,panes,lbDewasa,lbAnak,lbBalita));
                        tab2.setContent(langkah2.tab(panes, cbFrom, cbTo,date,panes,lbDewasa,lbAnak,lbBalita));
                        panes.getSelectionModel().selectNext();
                    } else {
                        alert.setTitle("Warning Dialog");
                        alert.setHeaderText("Kota Asal dan Tujuan tidak boleh sama");
//          alert.setContentText("Careful with the next step!");
                        alert.showAndWait();
                    }
                }else{
                    alert.setTitle("Warning Dialog");
                    alert.setHeaderText("Tanggal Keberangkatan harus diisi");
                    alert.showAndWait();
                }
            }
            
        });
        cari.setId("cari");
        HBox hbCari = new HBox(cari);
        hbCari.setAlignment(Pos.CENTER);
        root.add(hbCari, 0, 3);
        
        return root;
    }
    
    
    // GETTER -----------------------------------------------
    public Tab getTab2(){
        return tab2;
    }
    
    public Tab getTab3(){
        return langkah2.getTab3();
    }
    
    public Tab getTab4(){
        return langkah2.getTab4();
    }
    
    public Tab getTab5(){
        return langkah2.getTab5();
    }
    
    public ComboBox getCbFrom(){
        return cbFrom;
    }
    
    public ComboBox getCbTo(){
        return cbTo;
    }
}

