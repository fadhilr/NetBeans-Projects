/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1s2;

public class Mobil {

    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan, rubahkec;
    private double waktu,jarak;
    private double sekon;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        rubahKecepatan(i);
        kecepatan = i;
    }
    public void displayMessage() {
        System.out.println("Mobil  anda  adalah  bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan  mampu  menempuh  kecepatan " + kecepatan);
        System.out.println("dalam waktu " + (int)waktu+" jam atau "+(int)sekon+" detik");
        System.out.println("kecepatan dalam m/s\t= "+rubahkec);
        System.out.println("jarak yang ditempuh\t= "+jarak);
    }
    public void setWaktu(double waktu){
        setSekon(waktu);
        this.waktu=waktu;
    }
    private void setSekon(double waktu){
        sekon=waktu*3600;
    }
    private void rubahKecepatan(int i){
        rubahkec=(int) (i*(1000/3600.0));
    }
    public void hitungJarak(){
        jarak=kecepatan*waktu;
    }
}
