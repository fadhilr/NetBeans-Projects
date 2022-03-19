/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;


public class MainHujan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        Hujan objek=new Hujan();
        String pilih;
        do{
            System.out.println("=============Menu Inputan Hujan============");
            System.out.println("1. Input intensitas hujan");
            System.out.println("2. Input arah mata angin");
            System.out.println("3. Input lokasi hujan");
            System.out.print("Masukkan pilihan anda : ");
            int pil=input1.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("-Deras");
                    System.out.println("-Sedang");
                    System.out.println("-Gerimis");
                    System.out.print("Pilihan intensitas hujan :");
                    String inten=input.nextLine();
                    objek.setHujan(inten, "", "");
                    objek.tampilIntensitas();
                    break;
                case 2:
                    System.out.println("-Utara");
                    System.out.println("-Timur");
                    System.out.println("-Selatan");
                    System.out.println("-Barat");
                    System.out.print("Pilihan Arah mata angin :");
                    String arah=input.nextLine();
                    objek.setHujan("", arah, "");
                    objek.tampilArah();
                    break;
                case 3:
                    System.out.println("-Malang");
                    System.out.println("-Surabaya");
                    System.out.println("-Bandung");
                    System.out.println("-Jakarta");
                    System.out.print("Pilihan lokasi :");
                    String lokasi=input.nextLine();
                    objek.setHujan("", "", lokasi);
                    objek.tampilLokasi();
                    break;
                default:
                    System.out.println("Inputan salah");
            }
        System.out.print("Apakah anda ingin lanjut?(y/n) : ");
        pilih=input.nextLine();
        }while(pilih.equalsIgnoreCase("y"));
    }
}
