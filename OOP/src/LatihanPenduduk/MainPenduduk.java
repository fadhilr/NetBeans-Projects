/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPenduduk;

import java.util.Scanner;


public class MainPenduduk {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        System.out.print("Masukkan banyak penduduk = ");
        int banyak=input.nextInt();
        Penduduk []orang=new Penduduk[banyak];
        
        String pil="y";
        do{
        System.out.println("=========MENU========");
        System.out.println("1. Menambahkan penduduk");
        System.out.println("2. Menampilkan penduduk");
        System.out.println("=====================");
        System.out.print("Masukkan pilihan anda =");
        int x=input.nextInt();
        System.out.println("=====================");
            switch (x) {
                case 1:
                    System.out.println("Mengisi data penduduk :");
                    for (int i = 0; i < banyak; i++) {
                        System.out.print("Masukkan nama =");
                        String nama=input1.nextLine();
                        System.out.print("Masukkan umur =");
                        String umur=input1.nextLine();
                        orang[i] = new Penduduk(nama,umur);
                        System.out.println("--------------------");
                    }
                    break;
                case 2:
                    System.out.println("Tampilkan penduduk :");
                    for (int i = 0; i < banyak; i++) {
                        orang[i].display();
                    }
                break;               
                default:
                    
            }
            System.out.print("Apakah anda ingin melanjutkan?(y/n)");
            pil=input1.nextLine();
            
        }while(pil.equalsIgnoreCase("y"));
        
    }
}
