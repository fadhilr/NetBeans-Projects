/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class Tugas2Bab1 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        String nama, kel; 
        int awal, akhir, beban, ppj;
        System.out.println("Program penghitung pemakai listrik sederhana");
        System.out.print("Masukkan nama\t\t\t:");
        nama= input.nextLine();
        System.out.print("Kelurahan\t\t\t:");
        kel= input.nextLine();
        System.out.print("Masukkan posisi awal Kwh meter  :");
        awal= input.nextInt();
        System.out.print("Masukkan posisi akhir Kwh meter :");
        akhir= input.nextInt();
        System.out.print("Masukkan biaya beban saat ini\t:");
        beban= input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)\t:");
        ppj= input.nextInt();        
        
        int kwh= akhir-awal;
        int tarif= beban*kwh;
        int ppjpersen= tarif*ppj/100;
        int total= tarif+ppjpersen;
        System.out.println("=================PLN JAVA================");
        System.out.println("Nama\t\t\t:"+nama);
        System.out.println("Kelurahan\t\t:"+kel);
        System.out.println("Pemakaian bulan ini\t:"+kwh+"Kwh Meter");
        System.out.println("Tarif Listrik\t\t:Rp "+tarif+",-");
        System.out.println("PPJ 10%\t\t\t:Rp "+ppjpersen+",-");
        System.out.println("Total Bayar\t\t:Rp "+total+",-");
        System.out.println("==========================================");
    }
}
