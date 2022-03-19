/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Buat_Object;


public class MainKipas {
    public static void main(String[] args) {
        System.out.println("==========Object Kipas Angin1==========");
        KipasAngin kipas1=new KipasAngin();
        KipasAngin kipas2=new KipasAngin();
        kipas1.setHarga(100000);
        kipas1.setLetak("Di dinding");
        kipas1.setLevelKecKipas(6);
        kipas1.setMerek("Panasonic");
        kipas1.setSumberTenaga("Listrik");
        kipas1.setUkuran("Besar");
        kipas1.displayMessage();
        System.out.println("==========Object Kipas Angin2==========");
        kipas2.setHarga(200000);
        kipas2.setLetak("Di lantai");
        kipas2.setLevelKecKipas(3);
        kipas2.setMerek("Cosmos");
        kipas2.setSumberTenaga("Baterai");
        kipas2.setUkuran("Sedang");
        kipas2.displayMessage();
        System.out.println("================================");
    }
}
