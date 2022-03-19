/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_M;

public class Main {
    public static void main(String[] args) {
//        Mobil honda= new Mobil(12);
//        Mobil toyota= new Mobil();
        Spidol terbaru=new Spidol();
        Spidol a= new Spidol();
        a.setWarna("Biru");
        a.setMerek("samsung");
        a.setHarga(1000000);
        Spidol ja= new Spidol();
        terbaru.setHarga(500000);
        terbaru.setWarna("merah");
        terbaru.setMerek("toshiba");
        
        System.out.println("warna spidol 1= "+a.getWarna());
        System.out.println("merek spidol 1= "+a.getMerek());
        System.out.println("harga spidol 1= Rp."+a.getHarga());
        System.out.println("warna spidol 2= "+terbaru.getWarna());
        System.out.println("merek spidol 2= "+terbaru.getMerek());
        System.out.println("harga spidol 2= Rp."+terbaru.getHarga());
        
        
    
    }
}
