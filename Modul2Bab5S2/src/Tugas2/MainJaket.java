/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        Scanner input1=new Scanner (System.in);
        int pilih, banyak;
        System.out.println("============ CV. Labkomdas ============");
        String pil="y";
        do {
            System.out.println("Jenis jaket : ");
            System.out.println("1. Jaket A");
            System.out.println("2. Jaket B");
            System.out.println("3. Jaket C");
            System.out.print("Masukkan pilihan anda : ");
            pilih=input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jumlah jaket yang dibeli : ");
                    banyak=input.nextInt();
                    Jaket.jaketA(banyak);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah jaket yang dibeli : ");
                    banyak=input.nextInt();
                    Jaket.jaketB(banyak);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah jaket yang dibeli : ");
                    banyak=input.nextInt();
                    Jaket.jaketC(banyak);
                    break;
                default:
                    System.out.println("Inputan salah");
            }
            System.out.print("Apakah anda ingin melanjutkan?(y/n)");
            pil=input1.nextLine();
        } while (pil.equalsIgnoreCase("y"));
    }
}
