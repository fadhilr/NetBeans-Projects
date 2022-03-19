/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        Buku1 objek= new Buku1();
        
        String pilih;
        do {
            System.out.println("===============Menu Buku================");
            System.out.println("1. Lihat daftar penghargaan buku");
            System.out.println("2. Tambahkan buku");
            System.out.println("3. Lihat judul buku");
            System.out.print("Masukkan pilihan anda = ");
            int pil=input.nextInt();
            switch (pil) {
                case 1:
                    objek.tampil();
                    break;
                case 2:
                    
                    objek.tambah();
                case 3:
                    System.out.println("Best seller local = "+Buku1.nLokal);
                    System.out.println("Best seller nasional = "+Buku1.nNasional);
                    System.out.println("Best seller internasional = "+Buku1.nInternasional);
                    break;
                default:
                    System.out.println("inputan yang dimasukkan salah");
                    
            }
            System.out.print("Apakah anda ingin melanjutkan?(y/n)");
            pilih=input1.nextLine();
        } while (pilih.equalsIgnoreCase("y"));
        
    }
}
