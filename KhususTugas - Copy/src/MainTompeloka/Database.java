package MainTompeloka;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

/**
 *
 * @author F
 */
public class Database {
    //Attribut
    private String[] pesawat   = {"Lion Air","Garuda Indonesia","Sriwijaya Air","Citilink"};
    private String[] kota      = {"Bali/Denpasar","Jakarta","Makassar","Surabaya"};
    private String[] rute      = {"BJ","BM","BS",
                                  "JB","JM","JS",
                                  "MB","MJ","MS",
                                  "SB","SJ","SM"};
    private double[] durasi    = {
                                //Bali-Jakarta      //Bali-Makassar        //Bali-Surabaya         
                                1.55,               1.20,                  1.50,                   
                                //Jakarta-Bali      //Jakarta-Makassar     //Jakarta-Surabaya      
                                1.55,               2.30,                  1.30,                  
                                //Makassar-Bali     //Makassar-Jakarta     //Makassar-Surabaya     
                                1.20,               2.30,                  1.20,                  
                                //Surabaya-Bali     //Surabaya-Jakarta     //Surabaya-Makassar    
                                1.50,               1.30,                  1.20
                                };
    private double[] berangkat = {//pagi  //siang   //malam
                                    06.00,   14.00,     20.00};
    private double[] tiba      = new double[durasi.length];
    private double[] base      = {
                                //Lion Air  //Garuda Indonesia  //Sriwijaya Air //Citilink
                                200,        225,                175,            220};
    private double[] harga     = new double[durasi.length];

    public Database(){

    }

    public String[] getPesawat() {
        return pesawat;
    }

    public String[] getKota() {
        return kota;
    }

    public double[] getDurasi() {
        return durasi;
    }

    public double[] getBerangkat() {
        return berangkat;
    }

    public double[] getTiba() {
        return tiba;
    }

    public double[] getHarga() {
        return harga;
    }
    
    public String[] getRute(){
        return rute;
    }
    
    public double[] getBase(){
        return base;
    }

    public ObservableList getList(String kota){
        if(kota!=null){
            int index=0;
            for(int a=0;a<rute.length;a++){

                if(kota.equals(rute[a])){
                    index=a;
                    break;
                }
            }

            ObservableList<Maskapai> list = FXCollections.observableArrayList();
            for(int a = 0; a < pesawat.length; a++) {
                for (int b = 0; b < berangkat.length; b++) {
                    tiba[b]=berangkat[b]+durasi[index];
                    list.add(new Maskapai(pesawat[a], berangkat[b],tiba[b],(base[a]*durasi[index]*(b+1)*1000),"/Resource/"+(a+1)+".png"));
                    System.out.println();
                }
            }
            return list;
        } else{
            return null;
        }
    }
}
