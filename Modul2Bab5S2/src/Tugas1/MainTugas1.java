/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;
public class MainTugas1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        Tugas1 aritmatika=new Tugas1();
        int bil=0,bil1=0;
        System.out.println("=============Menu aritmatika==============");
        String pil="y";
        do {
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Penyederhanaan");
            System.out.print("Masukkan pilihan anda : ");
            int pilih=input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("----penjumlahan----");
                    System.out.print("Masukkan bilangan 1 = ");
                    bil=input.nextInt();
                    System.out.print("Masukkan bilangan 2 = ");
                    bil1=input.nextInt();
                    Tugas1.penjumlahan(bil, bil1);
                    break;
                case 2:
                    System.out.println("----pengurangan----");
                    System.out.print("Masukkan bilangan 1 = ");
                    bil=input.nextInt();
                    System.out.print("Masukkan bilangan 2 = ");
                    bil1=input.nextInt();
                    Tugas1.pengurangan(bil, bil1);
                    break;
                case 3:
                    System.out.println("----perkalian----");
                    System.out.print("Masukkan bilangan 1 = ");
                    bil=input.nextInt();
                    System.out.print("Masukkan bilangan 2 = ");
                    bil1=input.nextInt();
                    aritmatika.perkalian(bil, bil1);
                    break;
                case 4:
                    System.out.println("----pembagian----");
                    System.out.print("Masukkan bilangan 1 = ");
                    bil=input.nextInt();
                    System.out.print("Masukkan bilangan 2 = ");
                    bil1=input.nextInt();
                    aritmatika.pembagian(bil, bil1);
                    break;
                case 5:
                    System.out.println("----penyederhanaan----");
                    System.out.print("Masukkan pembilang = ");
                    bil=input.nextInt();
                    System.out.print("Masukkan penyebut = ");
                    bil1=input.nextInt();
                    aritmatika.sederhana(bil, bil1);
                    break;
                default:
                    System.out.println("Inputan salah");
            }
            System.out.print("Apakah anda ingin melanjutkan?(y/n)");
            pil=input1.nextLine();
        } while (pil.equalsIgnoreCase("y"));
    }
}
