/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apotek;

import java.util.Scanner;
public class ApotekMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        System.out.print("Masukkan nama anda = ");
        String nama=input1.nextLine();
        System.out.print("Masukkan alamat anda = ");
        String alamat=input1.nextLine();
        Apotek orang1=new Apotek(nama);
        Apotek orang2=new Apotek(nama, alamat);
        String pilih="y";
        do {
        System.out.println("==========Menu Apotek============");
        System.out.println("1. Lihat daftar obat");
        System.out.println("2. Masukkan data obat yang ingin dibeli");
        System.out.println("3. Total harga yang dibeli ");
        System.out.print("Masukkan pilihan anda : ");
        int pil=input.nextInt();
            switch (pil) {
                case 1:
                    orang1.daftarPesan();
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.print("Masukkan obat yang ingin dibeli = ");
                    int obat=input.nextInt();
                    orang1.daftarPesan(obat);
                    break;
                case 3:
                  System.out.println("========================================");
                  orang1.daftarBeli();
                  System.out.println("========================================");
                    break;
                default:
                    System.out.println("Angka yang anda masukkan salah");
            }
            System.out.print("Apakah anda ingin melanjutkan pembelian?(y/n)");
            pilih=input1.nextLine();
        } while (pilih.equalsIgnoreCase("y"));
    }
}
