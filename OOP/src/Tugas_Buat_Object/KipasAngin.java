/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Buat_Object;


public class KipasAngin {
    int a,harga,keckipas;
    String merek,ukuran,letak,arahput,sumber;
    public void setMerek(String merek){
        this.merek=merek;
    }
    public void setHarga(int harga){
        this.harga=harga;
    }
    public void setLevelKecKipas(int keckipas){
        this.keckipas=keckipas;
    }
    public void setUkuran(String ukuran){
        this.ukuran=ukuran;
    }
    public void setLetak(String letak){
        this.letak=letak;
    }
    public void setSumberTenaga(String sumber){
        this.sumber=sumber;
    }
    public void displayMessage(){
        System.out.println("Merek kipas angin anda adalah\t= "+merek);
        System.out.println("Harga kipas angin anda\t\t= Rp."+harga);
        System.out.println("Kecepatan kipas angin anda sampai level\t= "+keckipas);
        System.out.println("Ukuran kipas angin \t\t= "+ukuran);
        System.out.println("Serta dapat diletakkan di\t= "+letak);
        System.out.println("Dan bersumber tenaga pada\t= "+sumber);
    }
}
