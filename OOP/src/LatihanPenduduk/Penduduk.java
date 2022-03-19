/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPenduduk;


public class Penduduk {
    private String nama;
    private String umur;
    private String kota;
    private int banyak;
    
    public Penduduk(String nama, String umur){
        this.nama=nama;
        this.umur=umur;
        this.kota="Malang";
    }
    public void display(){
        System.out.println("nama yang dimasukkan \t= "+nama);
        System.out.println("umur yang dimasukkan \t= "+umur);
        System.out.println("kota tempat tinggal \t= "+kota);
        System.out.println("----------------------------");
    }
}
