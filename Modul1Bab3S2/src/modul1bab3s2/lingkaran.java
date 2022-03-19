/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab3s2;

public class lingkaran {
    int alas, tinggi; 
    public lingkaran(int alas) {
        this.alas = alas;
    }
    public lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public lingkaran(String alas,String tinggi){
        perubahan(alas,tinggi);
    }
    public void perubahan(String alas,String tinggi){
        int a,b;
        a=Integer.parseInt(alas);
        b=Integer.parseInt(tinggi);
        System.out.println("Nilai alas yang dimasukkan = "+a);
        System.out.println("Nilai tinggi yang dimasukkan = "+b);
        System.out.println("Luas = "+(a*b)/2);
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getAlas() {
        return alas;
    }
    public int getTinggi() {
        return tinggi;
    }
    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }
    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }
}
