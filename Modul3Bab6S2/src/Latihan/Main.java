/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        String pil,pili="y";
        do{
        System.out.print("Masukkan tinggi bangun ruang : ");
        int tinggi=input.nextInt();
        System.out.print("Masukkan volume bangun ruang : ");
        double volume=input.nextDouble();
        Balok a=new Balok(tinggi,volume);
        Tabung b=new Tabung(tinggi,volume);
        Limas c=new Limas(tinggi,volume);
            do {
                System.out.println("=========Bangun Ruang=========");
                System.out.println("1. Balok");
                System.out.println("2. Tabung");
                System.out.println("3. Limas");
                System.out.print("Masukkan pilihan anda : ");
                int pilih=input.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan panjang balok : ");
                        int p=input.nextInt();
                        System.out.print("Masukkan lebar balok : ");
                        int l=input.nextInt();
                        System.out.println("Luas penampang = "+a.luasPenampang());
                        System.out.println("Luas permukaan = "+a.luasPermukaan(p,l));
                        break;
                    case 2:
                        System.out.println("Luas penampang = "+b.luasPenampang());
                        System.out.println("Ukuran alas(jari-jari) = "+b.jari());
                        System.out.println("Luas permukaan = "+b.luasPermukaan());
                        break;
                    case 3:
                        System.out.println("Luas penampang = "+c.luasPenampang());
                        System.out.println("Luas permukaan = "+c.luasPermukaan());
                    default:
                        throw new AssertionError();
                }
                System.out.print("Apakah anda ingin melanjutkan?(y/n) : ");
                pili=input1.nextLine();
            } while (pili.equalsIgnoreCase("y"));
            
        System.out.print("Apakah anda ingin melanjutkan dengan volume dan tinggi baru?(y/n) : ");
        pil=input1.nextLine();
        }while(pil.equalsIgnoreCase("y"));
        
    }
}
