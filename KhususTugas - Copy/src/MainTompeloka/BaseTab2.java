/**
 *
 * @author F
 */

package MainTompeloka;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.beans.property.ReadOnlyObjectWrapper;
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
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class BaseTab2 {
    BaseTab3 langkah3 = new BaseTab3();
    Tab      tab3     = new Tab();
    
    String city;
    String inisial;
    Label lbFrom;
    
    final Label actionTaken = new Label();
    
    
    
    Label dws = new Label(" Dewasa 1");
    Label ank = new Label(" Anak 0");
    Label blt = new Label("0");
    
    int jumDewasa=1;
    int jumAnak=0;
    int jumBalita=0;
            
    double hargaDouble=0;
    
    public Pane tab(TabPane tab, 
                    ComboBox from, 
                    ComboBox to,
                    String date, 
                    TabPane panes,
                    Label dewasa, 
                    Label anak, 
                    Label balita){
        // Deklarasi tab ketiga---------------
        tab3.setDisable(true);
        tab3.setText("Langkah 3");
        tab3.setClosable(false);
        //-----------------------------------

        
        inisial =from!=null?from.getValue().toString().substring(0, 1)+
                              to.getValue().toString().substring(0, 1):null;
        city = from!=null?from.getValue()+" → "+to.getValue():null;
        
        BorderPane root = new BorderPane();
        root.setId("tab-background");
        root.setPadding(new Insets(10));
        root.setMaxHeight(342);
        root.setMaxWidth(890);
                
        root.setTop(header(date,dewasa,anak,balita));
        root.setCenter(getTable(panes,date));
        
        return root;
    }
    
    private VBox header(String date,Label dewasa, Label anak, Label balita){
        lbFrom = new Label(city);
        lbFrom.setId("lbf");
        
        Label tgl = new Label(date);
        tgl.setId("tgl");
        HBox vbTgl = new HBox(tgl,getPenumpang(dewasa,anak,balita));
        
        VBox root = new VBox(lbFrom,vbTgl);
        return root;
    }
    
    private HBox getPenumpang(Label dewasa, 
                              Label anak, 
                              Label balita)
    {
        jumDewasa = Integer.parseInt(dewasa.getText());
        jumAnak   = Integer.parseInt(anak.getText());
        jumBalita = Integer.parseInt(balita.getText());
        
        String d = jumDewasa !=0 ? " Dewasa "+dewasa.getText() : "";
        String a = jumAnak !=0 ? " Anak "+anak.getText() : "";
        String b = Integer.parseInt(balita.getText()) !=0 ? " Balita "+balita.getText() : "";
        
        dws = new Label(d);dws.setId("tgl");
        ank = new Label(a);ank.setId("tgl");
        blt = new Label(b);blt.setId("tgl");        
        
        HBox hbPenumpang = new HBox(dws,ank,blt);
        return hbPenumpang;
    }
    
    // GETTER -----------------------------------------------
    public Tab getTab3(){
        return tab3;
    }
    
    public Tab getTab4(){
        return langkah3.getTab4();
    }
    
    public Tab getTab5(){
        return langkah3.getTab5();
    }
    
    private TableView<Maskapai> getTable(TabPane  panes,String date){
        TableView<Maskapai>          table      = new TableView<>();
        TableColumn<Maskapai,String> kolBerangkat = new TableColumn<>("Berangkat");
        TableColumn<Maskapai,String> kolTiba = new TableColumn<>("Tiba");
//        TableColumn<Maskapai,String> kolPesawat = new TableColumn<>("Maskapai");
//        TableColumn<Maskapai,String> kolHarga = new TableColumn<>("Harga");
        
//        kolPesawat.setCellValueFactory(new PropertyValueFactory<Maskapai,String>("pesawat"));
        kolBerangkat.setCellValueFactory(new PropertyValueFactory<Maskapai,String>("berangkat"));
        kolTiba.setCellValueFactory(new PropertyValueFactory<Maskapai,String>("tiba"));
//        kolHarga.setCellValueFactory(new PropertyValueFactory<Maskapai,String>("harga"));
        
               
        //----------------------------------------------------------------------
        TableColumn<Maskapai,Maskapai> kolHarga = new TableColumn<>("Harga");
        kolHarga.setPrefWidth(100); 
        
        kolHarga.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Maskapai, Maskapai>, ObservableValue<Maskapai>>() {
          @Override 
          public ObservableValue<Maskapai> call(TableColumn.CellDataFeatures<Maskapai, Maskapai> features) {
              return new ReadOnlyObjectWrapper(features.getValue());
          }
        });
        
        kolHarga.setCellFactory(new Callback<TableColumn<Maskapai, Maskapai>, TableCell<Maskapai, Maskapai>>() {
          @Override public TableCell<Maskapai, Maskapai> call(TableColumn<Maskapai, Maskapai> btnCol) {
            return new TableCell<Maskapai, Maskapai>() {
              final ImageView buttonGraphic = new ImageView();
              final Button button = new Button(); {
                button.setGraphic(buttonGraphic);
                button.setMinWidth(130);
              }
              @Override public void updateItem(final Maskapai person, boolean empty) {
                super.updateItem(person, empty);
                if (person != null) {
                    Label price = new Label("Rp "+person.getHarga());
                    
                    button.setText("Pesan Sekarang");
                    VBox box = new VBox(price,button);
                    box.setAlignment(Pos.CENTER);
                    box.setSpacing(10);
                    setGraphic(box);
                    
                    button.setOnAction(new EventHandler<ActionEvent>() {
                    @Override public void handle(ActionEvent event) {
                        tab3.setDisable(false);
                        hargaDouble=person.getDoubleHarga();
                        actionTaken.setText(person.getPesawat());
                        
                        tab3.setContent(langkah3.tab(actionTaken,dws,jumDewasa,
                                ank,jumAnak,blt,jumBalita,hargaDouble,
                                panes,person.getResource(),date,
                                person.getBerangkat(),person.getTiba()));
                        panes.getSelectionModel().selectNext();
                    }
                  });
                } else {
                  setGraphic(null);
                }
              }
            };
          }
        });
        //----------------------------------------------------------------------
        
        //----------------------------------------------------------------------
        TableColumn<Maskapai,Maskapai> kolPesawat = new TableColumn<>("Maskapai");
        kolPesawat.setPrefWidth(250); 
        
        kolPesawat.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Maskapai, Maskapai>, ObservableValue<Maskapai>>() {
          @Override 
          public ObservableValue<Maskapai> call(TableColumn.CellDataFeatures<Maskapai, Maskapai> features) {
              return new ReadOnlyObjectWrapper(features.getValue());
          }
        });
        
        kolPesawat.setCellFactory(new Callback<TableColumn<Maskapai, Maskapai>, TableCell<Maskapai, Maskapai>>() {
          @Override public TableCell<Maskapai, Maskapai> call(TableColumn<Maskapai, Maskapai> btnCol) {
            return new TableCell<Maskapai, Maskapai>() {
              final ImageView buttonGraphic = new ImageView();
              final Button button = new Button(); {
                button.setGraphic(buttonGraphic);
                button.setMinWidth(130);
              }
              @Override public void updateItem(final Maskapai person, boolean empty) {
                super.updateItem(person, empty);
                if (person != null) {
                    Label airplane = new Label(""+person.getPesawat()); 
                    ImageView imageview = new ImageView(new Image(BaseTab2.class.getResourceAsStream(person.getResource()),50,50,true,true));
                    HBox box = new HBox(imageview,airplane);
                    box.setAlignment(Pos.CENTER_LEFT);
                    box.setSpacing(10);
                    setGraphic(box);
                } else {
                  setGraphic(null);
                }
              }
            };
          }
        });                
        //----------------------------------------------------------------------

        
        table.setPrefHeight(200);
        table.setTableMenuButtonVisible(true);
        
        kolPesawat.setMinWidth(200);
        kolBerangkat.setMinWidth(200);
        kolTiba.setMinWidth(200);
        kolHarga.setMinWidth(244);
        
        table.getColumns().addAll(kolPesawat,kolBerangkat,kolTiba,kolHarga);
        table.setItems(new Database().getList(inisial));
                
        if(inisial!=null){
            return table;
        }else{
            return table=new TableView();
        }
    }
}
