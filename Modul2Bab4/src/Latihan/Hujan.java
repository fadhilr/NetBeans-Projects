/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

public class Hujan {
    private String intensitas,arah, lokasi;
    private String intensitasA[]= {"deras","sedang","gerimis",""};
    private String arahA[]= {"utara","timur","selatan","barat"};
    private String lokasiA[]= {"malang","surabaya","bandung","jakarta"};
    
    
    public void setHujan(String i, String a, String l){
        intensitas=i;
        arah=a;
        lokasi=l;
    }
    public void tampilIntensitas(){
        System.out.println("Arah angin : "+arahA[(int)Math.random()*4]);
        System.out.println("Lokasinya  : "+lokasiA[(int)Math.random()*4]);
    }
    public void tampilArah(){
        System.out.println("Intensitas hujan : "+intensitasA[(int)Math.random()*4]);
        System.out.println("Lokasinya        : "+lokasiA[(int)Math.random()*4]);
    }
    public void tampilLokasi(){
        System.out.println("Intensitas hujan : "+intensitasA[(int)Math.random()*4]);
        System.out.println("Arah angin       : "+arahA[(int)Math.random()*4]);
    }
    
    
    
//    public void setIntensitas(String a){
//        intensitas=a;
//    }
//    public String getIntensitas(){
//        return intensitas;
//    }
//    public void setArahAngin(String arah){
//        this.arah=arah;
//    }
//    public String getArahAngin(){
//        return arah;
//    }
//    public String getKeduanya(){
//        return arah+" "+intensitas;
//    }
//    public void setKeduanya(String a, String b){
//        intensitas=a;
//        arah=b;
//    }
//    public void setHujan(String arah){
//        if (arah.equalsIgnoreCase("utara")) {
//            intensitas="deras";
//            System.out.println("Jika "+arah+" maka intensitas hujan "+intensitas);
//        } else if (arah.equalsIgnoreCase("timur")) {
//            intensitas="gerimis";
//            System.out.println("Jika "+arah+" maka intensitas hujan "+intensitas);
//        } else if (arah.equalsIgnoreCase("selatan")) {
//            intensitas="lebat";
//            System.out.println("Jika "+arah+" maka intensitas hujan "+intensitas);
//        } else if (arah.equalsIgnoreCase("barat")) {
//            intensitas="sedang";
//            System.out.println("Jika "+arah+" maka intensitas hujan "+intensitas);
//        } else {
//            System.out.println("Arah yang salah");
//        }
//    }
}
