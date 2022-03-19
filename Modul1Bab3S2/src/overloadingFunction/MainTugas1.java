/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingFunction;

import java.util.Scanner;


public class MainTugas1 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        Scanner input1=new Scanner (System.in);
        Tugas1 objek=new Tugas1();
        String pilih="y";
        do{
        System.out.println("=================Menu===================");
        System.out.println("1. Merubah inputan teks menjadi bilangan");
        System.out.println("2. Merubah inputan bilangan menjadi teks");
        System.out.print("Masukkan pilihan anda :");
        int pil=input.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("----Merubah huruf menjadi angka (0-100)----");
                    System.out.print("Masukkan kata yang diinginkan = ");
                    String x=input1.nextLine();
                    objek.overloadingMeth(x);
                    break;
                case 2:
                    System.out.println("----Merubah angka menjadi huruf(0-100)----");
                    System.out.print("Masukkan angka yang diinginkan = ");
                    int x1=input.nextInt();
                    objek.overloadingMeth(x1);
                    break;
                default:
                    System.out.println("pilihan yang anda masukkan tidak ada");
            }
        System.out.print("Apakah anda ingin melanjutkan?(y/n)");
        pilih=input1.nextLine();
        }while(pilih.equalsIgnoreCase("y"));
    }
}
