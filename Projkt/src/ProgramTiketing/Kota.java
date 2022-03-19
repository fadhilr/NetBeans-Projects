package ProgramTiketing;

import java.util.ArrayList;
import javafx.util.StringConverter;

/**
 *
 * @author F
 */


public class Kota {
    
    //Deklarasi Atribut
    private ArrayList<String> kota;
    private String kotaTujuan;
    
    public Kota(){
        setKota();
    }

    public ArrayList getKota() {
        return kota;
    }

    private void setKota(){        
        kota.add("Bali/Denpasar");
        kota.add("Jakarta");
        kota.add("Makassar");
        kota.add("Medan");
        kota.add("Surabaya");
        kota.add("Yogyakarta");
    }

//    @Override
//    public String toString() {
//        return ""+kota;
//    }
}