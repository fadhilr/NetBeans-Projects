/**
 *
 * @author F
 */

package ProgramTiketing;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
//import musicLibrary.MusicTable;

public class Tab2 {
    public Pane tab(Tab1 tab1){
        BorderPane root = new BorderPane();
        root.setId("tab-background");
        root.setPadding(new Insets(10));
        root.setMaxHeight(342);
//        TableView table = getTableView();
//        table.setPrefHeight(200);
        
        root.setTop(header(tab1));
//        root.setCenter(table);
        
        return root;
    }
    
    
    private VBox header(Tab1 tab1){
        Label from = new Label();//(tab1.getCbFrom().getValue()+" → "+tab1.getCbTo().getValue());
        from.setId("lbf");
        
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E, dd MMMM y");
        Label tgl = new Label(""+ft.format(date));
        tgl.setId("tgl");
        
        VBox root = new VBox(from,tgl);
        
        return root;
    }
    
    
//    final ObservableList<Integer> ratingSample = FXCollections.observableArrayList(1,2,3,4,5);
//    
//    ObservableList<String> artists = FXCollections.observableArrayList("Batik Air",
//            "Citilink","Garuda Indonesia","Lion Air","Avril","Disturbia","Kid Rock","Jessi J","Unknown","Unknown");    
//    ObservableList<String> titles = FXCollections.observableArrayList("04:00",
//            "08:15","08:35","20:20","21:40","Disturbia","Kid Rock","Price Tag","Title 2","09");
//    
//     public TableView getTableView(){
//        TableView<musicLibrary.Music> table = new TableView<musicLibrary.Music>(); 
//        table.setTableMenuButtonVisible(true);
//        
//        /*
//         * Creating the TableColumn for the TableView
//         * The property value Factory name must match with the 
//         * Generic Class's(Music's) property
//         */
//        TableColumn<musicLibrary.Music,musicLibrary.Album> albumArt = new TableColumn<musicLibrary.Music,musicLibrary.Album>("Maskapai");
//        albumArt.setCellValueFactory(new PropertyValueFactory("album"));
//        albumArt.setPrefWidth(200); 
//        
//        TableColumn<musicLibrary.Music,String> title = new TableColumn<musicLibrary.Music,String>("Berangkat");
//        title.setCellValueFactory(new PropertyValueFactory("title"));
//        title.setPrefWidth(120); 
//         
//        TableColumn<musicLibrary.Music,String> artist = new TableColumn<musicLibrary.Music,String>("Artist");
//        artist.setCellValueFactory(new PropertyValueFactory("artist"));
//        artist.setPrefWidth(120); 
//        
//        TableColumn<musicLibrary.Music,Integer> rating = new TableColumn<musicLibrary.Music,Integer>("Rating");
//        rating.setCellValueFactory(new PropertyValueFactory("rating"));
//        rating.setPrefWidth(120); 
//        
//        
//        
//        
//        
//        // SETTING THE CELL FACTORY FOR THE ALBUM ART                 
//        albumArt.setCellFactory(new Callback<TableColumn<musicLibrary.Music,musicLibrary.Album>,TableCell<musicLibrary.Music,musicLibrary.Album>>(){        
//            @Override
//            public TableCell<musicLibrary.Music, musicLibrary.Album> call(TableColumn<musicLibrary.Music, musicLibrary.Album> param) {                
//                TableCell<musicLibrary.Music, musicLibrary.Album> cell = new TableCell<musicLibrary.Music, musicLibrary.Album>(){
//                    @Override
//                    public void updateItem(musicLibrary.Album item, boolean empty) {                        
//                        if(item!=null){                            
//                            HBox box= new HBox();
//                            box.setSpacing(10) ;
//                            VBox vbox = new VBox();
//                            vbox.getChildren().add(new Label(item.getArtist()));
//                            vbox.getChildren().add(new Label(item.getAlbum())); 
//
//                            ImageView imageview = new ImageView();
//                            imageview.setFitHeight(50);
//                            imageview.setFitWidth(50);
//                            imageview.setImage(new Image(MusicTable.class.getResource("img").toString()+"/"+item.getFilename())); 
//
//                            box.getChildren().addAll(imageview,vbox); 
//                            //SETTING ALL THE GRAPHICS COMPONENT FOR CELL
//                            setGraphic(box);
//                        }
//                    }
//                };
//                System.out.println(cell.getIndex());               
//                return cell;
//            }
//            
//        });        
//        
//        
//        // SETTING THE CELL FACTORY FOR THE RATINGS COLUMN         
//        rating.setCellFactory(new Callback<TableColumn<musicLibrary.Music,Integer>,TableCell<musicLibrary.Music,Integer>>(){        
//            @Override
//            public TableCell<musicLibrary.Music, Integer> call(TableColumn<musicLibrary.Music, Integer> param) {                
//                TableCell<musicLibrary.Music, Integer> cell = new TableCell<musicLibrary.Music, Integer>(){
//                    @Override
//                    public void updateItem(Integer item, boolean empty) {
//                        if(item!=null){
//                            
//                           ChoiceBox choice = new ChoiceBox(ratingSample);                                                      
//                           choice.getSelectionModel().select(ratingSample.indexOf(item));
//                           //SETTING ALL THE GRAPHICS COMPONENT FOR CELL
//                           setGraphic(choice);
//                        } 
//                    }
//                };                           
//                return cell;
//            }
//            
//        });        
//        
//        
//        //ADDING ALL THE COLUMNS TO TABLEVIEW
//        table.getColumns().addAll(albumArt,title,artist,rating);        
//        
//        //ADDING ROWS INTO TABLEVIEW
//        ObservableList<musicLibrary.Music> musics = FXCollections.observableArrayList();
//        for(int i = 0; i<10; i++){
//            musicLibrary.Album al = new musicLibrary.Album(i+1+".jpg",artists.get(i),artists.get(i)); 
//            musicLibrary.Music m = new musicLibrary.Music(artists.get(i),al,titles.get(i),i%5); 
//            musics.add(m); 
//        }        
//        table.setItems(musics); 
//        
//        return table;
//    }
}
