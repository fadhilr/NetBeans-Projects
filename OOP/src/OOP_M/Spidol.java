/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_M;

/**
 *
 * @author guest-BioMQO
 */
public class Spidol {
    int a;
    String warna;
    String merek;
    int harga;
    public Spidol(){
        
    }
    public void setWarna(String warna){
       this.warna=warna;
    }
    public void setHarga(int harga){
       this.harga=harga;
    }
    public void setMerek(String merek){
        this.merek=merek;
    }
    public String getWarna(){
        return warna;        
    }
    public String getMerek(){
        return merek;
    }
    public int getHarga(){
        return harga;
    }

//    String setWarna() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}
