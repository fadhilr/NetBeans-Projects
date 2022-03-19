/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apotek;


public class Apotek {
    private static String []daftarObat={"Oskadon","Betadine","Paracetamol",
        "Bodrex","Mixagrip","Natur-E","Promag","Super tetra","Antimo"};
    private int []hargaObat={7000,10000,9000,2000,3000,5000,3000,2000,4000};
    private String nama,alamat;
    private static int harga=0;
    private static int []beli=new int[daftarObat.length];
    
    public Apotek(String nama){
        this.nama=nama;
        alamat="Sawojajar";
    }
    public Apotek(String nama, String alamat){
        this.nama=nama;
        this.alamat=alamat;
    }
    public void daftarPesan(){
        System.out.println("=========================================");
        for (int i = 0; i < daftarObat.length; i++) {
            System.out.println((i+1)+". "+daftarObat[i]+" \t\t|"
                    +hargaObat[i]+"\t\t|");
        }
        System.out.println("=========================================");
    }
    public void daftarPesan(int a){
        for (int i = 0; i < daftarObat.length; i++) {
            if (i==a-1) {
                harga+=hargaObat[i];
            }
            if (i==a-1) {
                beli[i]++;
            }
        }
    }
    public void daftarBeli(){
        System.out.println("Nama pemesan obat = "+nama);        
        System.out.println("Alamat pemesan obat = "+alamat);        
        System.out.println("Daftar obat yang dibeli : ");  
        for (int i = 0; i < daftarObat.length; i++) {
            System.out.println((i+1)+". "+daftarObat[i]+"\t\t|"+beli[i]+" kali \t|");
        }
        System.out.println("Total harga yang dibayar = "+harga);
    }
}
